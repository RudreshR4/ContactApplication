package in.ezeon.capp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.dao.UserDAOImpl;
import in.ezeon.capp.domain.User;

public class TestUserDaoUpdate {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAOImpl.class);
    User u = new User();
    u.setUserid(5);
    u.setName("KiranRao");
    u.setPhone("8888885454");
    u.setEmail("xyx@gmail.com");
    u.setAddress("Mumbai");
    u.setRole(1);
    u.setLoginStatus(1);
    
    userDAO.update(u);
    System.out.println("DATA has been updated successfully!!!!!!!!!");
}
}
