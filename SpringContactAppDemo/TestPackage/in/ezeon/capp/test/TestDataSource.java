package in.ezeon.capp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.capp.config.SpringRootConfig;

public class TestDataSource {

	public static void main(String[] args) {
	    ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);
        String sql = "INSERT INTO USER(`name`, `phone`, `email`, `address`, `loginName`, `password`)VALUES(?,?,?,?,?,?)";
        Object[] param = new Object[]{"Rudresh","8888844444","rud@gmail.com","Pune","rudzz","Max@007"};
        jt.update(sql, param);
        System.out.println("-----SQL Query executed-----");
	}

}
