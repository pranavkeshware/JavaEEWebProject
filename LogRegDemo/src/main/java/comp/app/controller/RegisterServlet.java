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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/serv1")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		
		String name= request.getParameter("name");
		String pwd= request.getParameter("password");
		String email= request.getParameter("email");
		String phnNo= request.getParameter("phoneNo");
		
		
		Employee e = new Employee();
		e.setName(name);
		e.setPassword(pwd);
		e.setEmail(email);
		e.setPhoneNo(phnNo);
		
		try {
			int status = EmployeeDao.save(e);
			
			if(status==1)
			{
				pw.write("Employee Registered Successfully");
				request.getRequestDispatcher("index.html").include(request,response);
			}
			else
			{
				pw.write("Failed to Register!!!");
				request.getRequestDispatcher("register.html").include(request,response);
			}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#do
	 * Post(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
