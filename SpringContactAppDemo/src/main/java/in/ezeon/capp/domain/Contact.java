package in.ezeon.capp.domain;

public class Contact {
 private Integer contactId; //PK
 private Integer userid;  //FK
 private String name;
 private String phone;
 private String email;
 private String address;
 private String remark;
public Integer getContactId() {
	return contactId;
}
public void setContactId(Integer contactId) {
	this.contactId = contactId;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
