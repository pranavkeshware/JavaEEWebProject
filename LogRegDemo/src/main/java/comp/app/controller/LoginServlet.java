package comp.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import comp.app.dao.EmployeeDao;
import comp.app.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/serv2")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("txtUsername");
		String pwd = request.getParameter("txtPassword");
		
		Employee e = new Employee();
		e.setName(name);
		e.setPassword(pwd);
		
		boolean status = false;
		
		
		try {
			status = EmployeeDao.validateEmp(e);
			if (status == true) {
				pw.write("Login Successfull");
				request.getRequestDispatcher("index.html").include(request, response);
			} 
			else 
			{
				pw.write("Invalid Username or Password!!!");
				request.getRequestDispatcher("index.html").include(request, response);

			} 
		} catch (ClassNotFoundException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}catch (SQLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
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
