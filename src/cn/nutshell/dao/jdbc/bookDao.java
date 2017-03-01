package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;

public class bookDao {
	public void Daobook(String ticketnum,String trainnum,String startstation,
			String endstation,String price,String starttime,String carrnum,String seatnum){
		int tic = Integer.valueOf(ticketnum);
		int pri = Integer.valueOf(price);
		int carr = Integer.valueOf(carrnum);
		int seat = Integer.valueOf(seatnum);
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="INSERT INTO order_t(ticket_num,train_num,start_station,end_station,price,start_time,carr_num,seat_num)"
				+ "values('"+tic+"','"+trainnum+"','"+startstation+"','"+endstation+"',"
						+ "'"+pri+"','"+starttime+"','"+carr+"','"+seat+"')";
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
