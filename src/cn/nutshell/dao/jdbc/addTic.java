package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;

public class addTic {
	public void DaoTicket(String starts,String tn,String ends,String starttime,
			String busniess,String endtime,String first,	String second,int num){
		int b = Integer.valueOf(busniess);
		int f = Integer.valueOf(first);
		int s = Integer.valueOf(second);
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="INSERT INTO ticket_info(num,train_num,start_time,end_time,business,first,second,end_station,start_station)"
				+ "values('"+num+"','"+tn+"','"+starttime+"','"+endtime+"',"
						+ "'"+b+"','"+f+"','"+s+"','"+ends+"','"+starts+"')";
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCManager.close(rs, ps, con);
		}
		System.out.println("successful!!");
	}
}

