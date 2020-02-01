package in.ezeon.capp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.UserDAO;
import in.ezeon.capp.dao.UserDAOImpl;
import in.ezeon.capp.domain.User;

public class TestUserDaoDelete {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAOImpl.class);
    userDAO.delete(4);
    System.out.println("DATA has been Deleted successfully!!!!!!!!!");
}
}
