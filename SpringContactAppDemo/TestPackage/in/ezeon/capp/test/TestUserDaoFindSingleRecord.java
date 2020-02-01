package in.ezeon.capp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.dao.UserDAOImpl;
import in.ezeon.capp.domain.User;

public class TestUserDaoFindSingleRecord {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAOImpl.class);
    User u = userDAO.findbyId(5);
    System.out.println("-------------User Details---------------");
    System.out.println(u.getUserid()+"");
    System.out.println(u.getName()+"");
    System.out.println(u.getPhone()+"");
    System.out.println(u.getEmail()+"");
    System.out.println(u.getAddress()+"");
    System.out.println(u.getLoginName()+"");
    System.out.println(u.getLoginStatus()+"");
    System.out.println(u.getRole()+"");
}
}
