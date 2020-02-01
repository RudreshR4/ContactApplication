package in.ezeon.capp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.dao.UserDAOImpl;
import in.ezeon.capp.domain.User;

public class TestUserDaoSave {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAOImpl.class);
    User u = new User();
    u.setName("Ramesh");
    u.setPhone("8888685454");
    u.setEmail("xyx@gmail.com");
    u.setAddress("PCMCV");
    u.setLoginName("Hall");
    u.setPassword("xyznz");
    u.setRole(1);
    u.setLoginStatus(1);
    userDAO.save(u);
    System.out.println("DATA has been saved successfully!!!!!!!!!");
}
}
