package com.univ.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DTO.CustRegDTO;
import com.univ.DAO.*;

/**
 * Servlet implementation class CustReg
 */
@WebServlet("/CustReg")
public class CustReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 CustRegDTO cdata=new CustRegDTO();
	       cdata.setCname(request.getParameter("cname"));
	       cdata.setCadd(request.getParameter("cadd"));
	       cdata.setCemail(request.getParameter("cemail"));
	    cdata.setMob(Integer.parseInt(request.getParameter("mob")));
	       cdata.setSalpur(Integer.parseInt(request.getParameter("salpur")));
	       cdata.setUnm(request.getParameter("unm"));
	       cdata.setPw(request.getParameter("pw"));
	       CustRegDAO data=new CustRegDAO();
	       int x=data.save1(cdata);
	       if(x!=0)
	       {
	    	response.sendRedirect("login.jsp");   
	       }else {
	    	response.sendRedirect("reg.jsp");
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
