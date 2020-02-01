package in.ezeon.capp.service;

import java.util.List;

import in.ezeon.capp.domain.Contact;

public interface ContactService {
public void save(Contact c);
public void update(Contact c);
public void delete(Integer contactId);
public void delete(Integer[] contactIds);

public List<Contact> findUserContact(Integer UserId);
public List<Contact> findUserContact(Integer UserId,String txt);
}
