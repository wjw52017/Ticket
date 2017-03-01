package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;
import cn.nutshell.entity.Query;
import cn.nutshell.entity.User;

public class queryDao {
		public Query getqueryby_info(String start,String end,String date){
			Connection con = JDBCManager.getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			Query query = null;
			String sql = "SELECT * FROM ticket_info t where t.start_station=? and t.end_station=? and  t.start_time>=?";
			try {
				ps = con.prepareStatement(sql);
				ps.setObject(1, start);
				ps.setObject(2, end);
				ps.setObject(3, date);
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
		
		public Query getByTrain(String tn){
			Connection con = JDBCManager.getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			Query query = null;
			String sql = "SELECT * FROM ticket_info t where t.train_num=?";
			try {
				ps = con.prepareStatement(sql);
				ps.setObject(1, tn);
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
