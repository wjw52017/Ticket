package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;

public class addnum {
	 public void add(String name,String num){
			Connection con = JDBCManager.getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			Integer numb = Integer.valueOf(num);
			String sql ="update user_info u set u.num=? where u.name = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, numb);
				ps.setString(2, name);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				JDBCManager.close(rs, ps, con);
			}
			System.out.println("successful!!");
		}
}
