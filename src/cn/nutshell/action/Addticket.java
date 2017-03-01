package cn.nutshell.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.nutshell.dao.jdbc.Addway;
import cn.nutshell.dao.jdbc.addTic;

/**
 * Servlet implementation class Addticket
 */
@WebServlet("/Addticket")
public class Addticket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addticket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String starts = new String(request.getParameter("starts").getBytes("iso-8859-1"),"utf-8");
		String tn = request.getParameter("cid"); 		//³µ´Î
		String ends = new String(request.getParameter("ends").getBytes("iso-8859-1"),"utf-8");
		String starttime = request.getParameter("starttime");
		String busniess = request.getParameter("busniess");
		String endtime = request.getParameter("endtime");
		String first = request.getParameter("first");
		String second = request.getParameter("second"); 
		
		String p = request.getParameter("p");
		String station1 = new String(request.getParameter("station1").getBytes("iso-8859-1"),"utf-8");
		String p1 = request.getParameter("p1");
		String station2 = new String(request.getParameter("station2").getBytes("iso-8859-1"),"utf-8");
		String p2 = request.getParameter("p2");
		String station3 = new String(request.getParameter("station3").getBytes("iso-8859-1"),"utf-8");
		String p3 = request.getParameter("p3");
		String station4 = new String(request.getParameter("station4").getBytes("iso-8859-1"),"utf-8");
		String p4 = request.getParameter("p4");
		String station5 = new String(request.getParameter("station5").getBytes("iso-8859-1"),"utf-8");
		String p5 = request.getParameter("p5");
		
		String s1 = request.getParameter("s1");
		String s2 = request.getParameter("s2");
		String s3 = request.getParameter("s3");
		String s4 = request.getParameter("s4");
		String s5 = request.getParameter("s5");
		
		List<String> s = new ArrayList<String>();
		s.add(p); s.add(p1); s.add(p2);	s.add(p3);	s.add(p4);	s.add(p5);
		s.add(starts); s.add( station1); s.add( station2); s.add( station3); s.add( station4); s.add( station5);
		s.add(ends); s.add(tn);
		s.add(s1);s.add(s2);s.add(s3);s.add(s4);s.add(s5);
		Addway addway = new Addway();
		addway.DaoWay(s);
		Random rand = new Random();
		int num = rand.nextInt(10000);
		addTic add = new addTic();
		add.DaoTicket(starts, tn, ends, starttime, busniess, endtime, first, second, num);
		request.getRequestDispatcher("/tips.jsp").forward(request,response);
		//System.out.println(starts+tn);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
