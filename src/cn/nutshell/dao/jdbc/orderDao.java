package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.nutshell.dao.JDBCManager;
import cn.nutshell.entity.Order;

public class orderDao {
	public List<Order> get_order(){
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Order order = null;
		List<Order> orders = new ArrayList<>();
		String sql = "SELECT * FROM order_t  limit 10";
		try {
			ps = con.prepareStatement(sql);
		//	ps.setObject(1, name);
			rs = ps.executeQuery();
			while(rs.next()){
				order = new Order();
				order.setnum(rs.getInt("ticket_num"));
				order.settrainnum(rs.getNString("train_num"));
				order.setstarttime(rs.getString("start_time"));
				order.setstartstation(rs.getString("start_station"));
				order.setendstation(rs.getString("end_station"));
				order.setcarr(rs.getInt("carr_num"));
				order.setseat(rs.getInt("seat_num"));
				order.setprice(rs.getInt("price"));
				orders.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCManager.close(rs, ps, con);
		}
		return orders;
	}

}
