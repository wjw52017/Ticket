package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;
import cn.nutshell.entity.Query;

public class ticketinfoDao {
	public Query getby_name(String name){
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Query query = null;
		String sql = "SELECT * FROM user_info u,ticket_info t where u.name=? and t.num=u.num";
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1, name);
			rs = ps.executeQuery();
			if(rs.next()){
				query = new Query();
				query.settrainnum(rs.getNString("train_num"));
				query.setstarttime(rs.getString("start_time"));
				query.setendtime(rs.getString("end_time"));
				query.setstartstation(rs.getString("start_station"));
				query.setendstation(rs.getString("end_station"));
				query.setbusiness(rs.getInt("business"));
				query.setfirst(rs.getInt("first"));
				query.setsecond(rs.getInt("second"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCManager.close(rs, ps, con);
		}
		return query;
	}
}
