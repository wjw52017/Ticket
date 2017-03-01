package cn.nutshell.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.nutshell.dao.jdbc.queryDao;
import cn.nutshell.dao.jdbc.queryWay;
import cn.nutshell.entity.Query;
import cn.nutshell.entity.Way;

/**
 * Servlet implementation class Adquery
 */
@WebServlet("/Adquery")
public class Adquery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adquery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tn = request.getParameter("cid");
		queryDao qd = new queryDao();
		Query q = qd.getByTrain(tn);
		queryWay qw = new queryWay();
		Way w = qw.getway(tn);
		//System.out.println(q);
		request.setAttribute("adq", q);
		request.setAttribute("st",w );
		 request.getRequestDispatcher("/Adquery.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
