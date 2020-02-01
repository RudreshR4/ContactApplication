package in.ezeon.capp.test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.dao.UserDAOImpl;
import in.ezeon.capp.domain.User;

public class TestUserDaoFindByProperty {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAOImpl.class);
    List<User> u = userDAO.findByProperty(" userid",5);
    //List<User> u = userDAO.findByProperty(" name","Rudresh");
    System.out.println("-------------User Details---------------");
    for(User l : u){
    	 System.out.println(l.getUserid()+"");
    	    System.out.println(l.getName()+"");
    	    System.out.println(l.getPhone()+"");
    	    System.out.println(l.getEmail()+"");
    	    System.out.println(l.getAddress()+"");
    	    System.out.println(l.getLoginName()+"");
    	    System.out.println(l.getLoginStatus()+"");
    	    System.out.println(l.getRole()+"");
    	    System.out.println("=========================================");
    }
}
}
