package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;

public class delete {
	public void del(String Id){
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "delete from ticket_info where train_num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, Id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCManager.close(rs, ps, con);
		}
		System.out.println("successful!!");
	}
	
	public void delway(String Id){
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "delete from way_station where train_num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, Id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCManager.close(rs, ps, con);
		}
		System.out.println("successful!!");
	}

}
