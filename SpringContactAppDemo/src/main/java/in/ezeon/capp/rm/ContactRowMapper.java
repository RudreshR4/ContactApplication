package in.ezeon.capp.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.ezeon.capp.domain.Contact;
import in.ezeon.capp.domain.User;

public class ContactRowMapper implements RowMapper<Contact> {

	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact c = new Contact();
		c.setUserid(rs.getInt("userId"));
		c.setContactId(rs.getInt("contactId"));
		c.setName(rs.getString("name"));
		c.setEmail(rs.getString("email"));
		c.setAddress(rs.getString("address"));
		c.setPhone(rs.getString("phone"));
		c.setRemark(rs.getString("remark"));
		return c;
	}

}
