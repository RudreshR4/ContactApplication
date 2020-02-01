package in.ezeon.capp.test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.ContactDAO;
import in.ezeon.capp.dao.ContactDAOImpl;
import in.ezeon.capp.domain.Contact;

public class TestContactDAOUpdate {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDAO cd = ctx.getBean(ContactDAOImpl.class);
	Contact c = new Contact();
	c.setContactId(1);
	c.setName("KiranR");
	c.setAddress("KharGar");
	cd.update(c);
	System.out.println("Updated Successfully!!!!!!!");
}
}
