package in.ezeon.capp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.domain.User;
import in.ezeon.capp.service.UserService;
import in.ezeon.capp.service.UserServiceImpl;

public class TestUserServiceRegister {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserService userServ = ctx.getBean(UserServiceImpl.class);
    User u = new User();
    u.setName("Kamal");
    u.setPhone("6767632456");
    u.setEmail("xxx@gmail.com");
    u.setAddress("Nashik");
    u.setLoginName("Kamal");
    u.setPassword("xyyy");
    u.setRole(UserService.ROLE_USER);
    u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);
    userServ.register(u);
    System.out.println("User Registered Successfully!!!!!!!!!");
}
}
