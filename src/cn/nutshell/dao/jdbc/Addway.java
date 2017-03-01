package cn.nutshell.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.nutshell.dao.JDBCManager;

public class Addway {
	public void DaoWay(List<String> s){
		String starts = (String)s.get(6);
		String p = (String)s.get(0);
		String station1 =  (String)s.get(7);
		String p1 = (String)s.get(1);
		String station2 =  (String)s.get(8);
		String p2 =(String)s.get(2);
		String station3 = (String)s.get(9);
		String p3 = (String)s.get(3);
		String station4 = (String)s.get(10);
		String p4 = (String)s.get(4);
		String station5 =  (String)s.get(11);
		String p5 = (String)s.get(5);
		String ends = (String)s.get(12);
		String tn = (String)s.get(13);
		String s1 = (String)s.get(14);
		String s2 = (String)s.get(15);
		String s3 = (String)s.get(16);
		String s4 = (String)s.get(17);
		String s5 = (String)s.get(18);
		System.out.println(p3);
		int pr = 0;int pr1=0;int pr2=0;int pr3=0;int pr4=0;int pr5=0;
		if(!p.equals("")){ pr = Integer.valueOf(p);}
		if(!p1.equals("")){ pr1 = Integer.valueOf(p1);}
		if(!p2.equals("")){ pr2 = Integer.valueOf(p2);}
		if(!p3.equals("")){ pr3 = Integer.valueOf(p3);}
		if(!p4.equals("")){ pr4 = Integer.valueOf(p4);}
		if(!p5.equals("")){ pr5 = Integer.valueOf(p5);}
		Connection con = JDBCManager.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="INSERT INTO way_station(train_num,start,p,station1,s1,p1,station2,s2,p2,station3,s3,p3,station4,s4,p4,station5,s5,p5,station6)"
				+ "values('"+tn+"','"+starts+"','"+pr+"',"
						+ "'"+station1+"','"+s1+"','"+pr1+"','"+station2+"','"+s2+"','"+pr2+"','"+station3+"','"+s3+"','"+pr3+"',"
						+" '"+station4+"','"+s4+"','"+pr4+"','"+station5+"','"+s5+"','"+pr5+"','"+ends+"')";
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
