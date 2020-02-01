package in.ezeon.capp.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.capp.config.SpringRootConfig;
import in.ezeon.capp.dao.ContactDAO;
import in.ezeon.capp.dao.ContactDAOImpl;
import in.ezeon.capp.domain.Contact;

public class TestContactDAOFindByProp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDAO cd = ctx.getBean(ContactDAOImpl.class);
	List<Contact> cl = cd.findByProperty("name","Rud");
	for(Contact l: cl){
		System.out.println(l.getContactId()+"-"+l.getName()+"-"+l.getUserid()+"-"+l.getPhone());
	}
}
}
