package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;
import cn.nutshell.entity.Admin;

public class AdminDaoIfor {
	public Admin getUserByCondition(String condition) {
		// TODO Auto-generated method stub
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Admin admin = null;
		String sql = "SELECT * FROM admin_t a where a.name=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1, condition);
			rs = ps.executeQuery();
			if(rs.next()){
				admin = new Admin();
				admin.setPassword(rs.getString("password"));
				admin.setName(rs.getString("name"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCManager.close(rs, ps, con);
		}
		return admin;
	}

}
