package com.struts2.trdio;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Mymvc.POJO.Mypojo;
/**
 * 
 * Servlet implementation class Myservlet
 */
//ÐÞ¸Ä
@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean b=false;
		Mypojo mypojo=new Mypojo();
		String aname=request.getParameter("authorname");
		b=mypojo.login(aname);
		if(b) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("Failed.jsp");
		}
		//doGet(request, response);
	}
	public void init()throws ServletException{
		
	}

}
