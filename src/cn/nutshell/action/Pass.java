package cn.nutshell.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.nutshell.dao.jdbc.PassDao;
import cn.nutshell.entity.Admin;

/**
 * Servlet implementation class Pass
 */
@WebServlet("/Pass")
public class Pass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mpass = request.getParameter("mpass");
		String npass = request.getParameter("newpass");
		System.out.println(mpass+npass);
		PassDao p = new PassDao();
		HttpSession session = request.getSession();
		Admin a = (Admin)session.getAttribute("admin");
		if(a.getPassword().equals(mpass)){
			p.UpdatePass("admin", npass);
			request.getRequestDispatcher("/tips.jsp").forward(request,response);
		}
		else{
			request.getRequestDispatcher("/error.html").forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
