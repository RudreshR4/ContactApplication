package in.ezeon.capp.test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.ContactDAO;
import in.ezeon.capp.dao.ContactDAOImpl;
import in.ezeon.capp.domain.Contact;

public class TestContactDOASave {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
    ContactDAO cd = ctx.getBean(ContactDAOImpl.class);
    Contact c = new Contact();
    c.setUserid(1);
    c.setName("Rud");
    c.setEmail("rudzz.rocks@gmail.com");
    c.setPhone("567433806434");
    c.setAddress("PCMC,Pune");
    c.setRemark("Serv.");
    cd.save(c);
    System.out.println("Entered Contact Info. has been saved!!!!!!");
}
}

