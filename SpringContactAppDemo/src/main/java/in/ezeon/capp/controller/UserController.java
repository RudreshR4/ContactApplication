package in.ezeon.capp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.ezeon.capp.command.LoginCommand;
import in.ezeon.capp.domain.User;
import in.ezeon.capp.exeception.UserBlockedException;
import in.ezeon.capp.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
 @RequestMapping(value ={"/","/index"})	
 public String index(Model m){
	 m.addAttribute("command", new LoginCommand());
	 return "index"; //JSP -//WEB-INF/view/index.jsp
 }
 
 @RequestMapping(value ={"/login"}, method=RequestMethod.POST)	
 public String handleLogin(@ModelAttribute("command") LoginCommand cmd, Model m){
	System.out.println("HandleLogin is working..");
	try {
		User loggedInUser = userService.login(cmd.getLoginName(), cmd.getPassword());
		if(loggedInUser==null){
			// If failed
			m.addAttribute("err","Login Failed! Please enter valid credentials.");
			return "index";
		}else{
			//If passed
			//Check the role and redirect to a appropriate dashboard
			if(loggedInUser.getRole().equals(UserService.ROLE_ADMIN)){
				return "redirect:/admin/dashboard";
				//return "include/dashboard_admin";
			}else if(loggedInUser.getRole().equals(UserService.ROLE_USER)){
				return "redirect:/user/dashboard";
				//return "include/dashboard_user";
			}else{
				//Error message and go back to the form..Only 2 roles are there..
				m.addAttribute("err","Invalid User Role");
				return "index";
			}
		}
	} catch (UserBlockedException e) {
	m.addAttribute("err",e.getMessage());
	return "index";  //JSP page-Login form
	}
	//return null;
 }
 
 @RequestMapping(value ={"/user/dashboard"})	
 public String userDashBoard(){
	 return "include/dashboard_user"; //JSP -//WEB-INF/view/dashboard_user.jsp
 }
 
 @RequestMapping(value ={"/admin/dashboard"})	
 public String adminDashBoard(){
	 return "include/dashboard_admin"; //JSP -//WEB-INF/view/dashboard_user.jsp
 }
}
