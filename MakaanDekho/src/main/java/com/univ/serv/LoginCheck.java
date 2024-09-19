package com.univ.serv;

import java.io.IOException;

import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DTO.CustRegDTO;
import com.univ.DAO.CustRegDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession(false);
		if(hs!=null)
		{
		  	hs.invalidate();
		}
		CustRegDTO cdata= new CustRegDTO();
		cdata.setUnm(request.getParameter("unm"));
		cdata.setPw(request.getParameter("pw"));
		CustRegDAO data= new CustRegDAO();
		Vector x=data.loginChck(cdata);
		System.out.println(x);
		if(x.isEmpty()) {
			response.sendRedirect("login.jsp");
			
		}else {
			 hs=request.getSession(true);
			    hs.setAttribute("unm", x.elementAt(1));
			response.sendRedirect("index.jsp");
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
