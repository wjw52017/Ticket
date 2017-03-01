package cn.nutshell.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.nutshell.dao.jdbc.AdminDaoIfor;
import cn.nutshell.entity.Admin;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		HttpSession session = request.getSession();
		
		AdminDaoIfor ad = new AdminDaoIfor();
		Admin admin = ad.getUserByCondition(name);
		
		if (admin == null) {
			request.setAttribute("pswd", "用户名或密码输入错误");
			 request.getRequestDispatcher("/admin.jsp").forward(request,response); 
		}
		
		else if( !admin.getPassword().equals(pwd)){
			request.setAttribute("pswd", "用户名或密码输入错误");
			 request.getRequestDispatcher("/admin.jsp").forward(request,response);
		}
		
		else {
			session.setAttribute("admin", admin);
	       request.getRequestDispatcher("/backstage.jsp").forward(request,response);
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
