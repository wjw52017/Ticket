package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.nutshell.dao.JDBCManager;
import cn.nutshell.entity.Way;

public class queryWay {
	public Way getway(String tn){
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Way way = null;
		String sql = "SELECT * FROM way_station w where w.train_num= ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1, tn);
			rs = ps.executeQuery();
			if(rs.next()){
				way = new Way();
				way.settrainnum(rs.getNString("train_num"));
				way.setstation1(rs.getNString("station1"));
				way.setstation2(rs.getNString("station2"));
				way.setstation3(rs.getNString("station3"));
				way.setstation4(rs.getNString("station4"));
				way.setstation5(rs.getNString("station5"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCManager.close(rs, ps, con);
		}
		return way;
	}
}
