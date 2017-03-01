package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.nutshell.dao.JDBCManager;
import cn.nutshell.dao.UserDao;
import cn.nutshell.entity.User;

public class UserDaoIfor {
	
public List<User> getUser() {
	// TODO Auto-generated method stub
	Connection con = JDBCManager.getConnection();
	PreparedStatement ps = null;
	ResultSet rs = null;
	User user = null;
	List<User> users = new ArrayList<>();
	String sql = "SELECT * FROM user_info  limit 9";
	try {
		ps = con.prepareStatement(sql);
		//ps.setObject(1, condition);
		rs = ps.executeQuery();
		while(rs.next()){
			user = new User();
			user.setId(rs.getString("user_id"));
			user.setPassword(rs.getString("password"));
			user.setPhone(rs.getString("tel"));
			user.setName(rs.getString("name"));
			user.set_selfid(rs.getString("Id"));
			user.setType(rs.getString("type"));
			users.add(user);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally{
		JDBCManager.close(rs, ps, con);
	}
	return users;
}
}
