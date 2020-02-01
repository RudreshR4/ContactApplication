package in.ezeon.capp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@Controller
public class TestController {
    @RequestMapping("/test/hello")
	public String helloWord(){
    	System.out.println("Inside HelloWorld method");
	  return "hello";  //->/WEB-INF/view/hello.jsp
  }
    @RequestMapping("/test/demo")
    public String hello(){
    	System.out.println("Inside demo method");
		return "demo";  	
    }
}
