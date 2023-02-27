package com.techpalle.contrller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.module.Customer;
import com.techpalle.util.SuccessPage;


@WebServlet("/")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String path=request.getServletPath();
		switch(path)
		{
		case "/logCustomer":
			validateCustomer(request,response);
			break;
		case "/regCustomer" :
			insertCustomer(request,response);
			break;
	//	case "/login" :
			//login(request,response);
		//	break;
		case "/reg":
			getRegistrationPage(request,response);
			break;
		case "/log":
			getLoginPage(request,response);
			break;
		
		default:
			getStartUpPage(request,response);
			break;
			
		}
	}

	private void validateCustomer(HttpServletRequest request, HttpServletResponse response)
	{
		//read the email and password login.jsp file
		String e=request.getParameter("tbemailLog");
		String p=request.getParameter("tbpassLog");
		//call method present in DAO
		boolean res=DataAccess.validateCustomer(e, p);
		//condition  and Redirect user to desination page(success)
		if(res)
		{
			try {
				RequestDispatcher rd=	request.getRequestDispatcher("Success.jsp");
				//store the Successpage class data inside RD
				SuccessPage sp=new SuccessPage ();
				request.setAttribute("succesDetails", sp);

				rd.forward(request, response);
			} catch (ServletException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
			
		}
		else
		{
			getLoginPage(request,response);
			
		}
		
			}
	

	private void insertCustomer(HttpServletRequest request, HttpServletResponse response) 
	{
		String name=request.getParameter("tbname");
		String email=request.getParameter("tbemail");
		String pass=request.getParameter("tbpassword");
		long mobile=Long.parseLong(request.getParameter("tbmobile"));
		String state=request.getParameter("ddlcities");
		
		Customer c= new Customer(name,email,pass,mobile,state);
		
		DataAccess .insertCustomer(c);
		
	try {
		RequestDispatcher rd=	request.getRequestDispatcher("Customer_login.jsp");

		rd.forward(request, response);
	} catch (ServletException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	
	



		
		
		
		
		
	}





	private void getRegistrationPage(HttpServletRequest request, HttpServletResponse response) 
	{
		try {
			RequestDispatcher rd=request.getRequestDispatcher("Customer_Registration.jsp");
			rd.forward(request, response);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}

		
	





	private void getLoginPage(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			RequestDispatcher rd=request.getRequestDispatcher("Customer_login.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}


	private void getStartUpPage(HttpServletRequest request, HttpServletResponse response) 
	{
		
		
		try {
			RequestDispatcher rd=request.getRequestDispatcher("Customer_Management.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
