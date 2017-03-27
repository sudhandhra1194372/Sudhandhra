package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Methods;
import com.service.Service;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("action");
		if("home".equals(action)) 
		{
			try
			{
			String user=request.getParameter("username");
			String pass=request.getParameter("password");
			
			Service objService = new Service();
			String username =objService.serviceHome(user,pass);
			
			System.out.println(username);
			
			if(username.equals(user))
			{
				request.setAttribute("user_name",user);
			RequestDispatcher r=request.getRequestDispatcher("Success.jsp");
			r.forward(request,response);
			
			}
			else
			{
				
				RequestDispatcher r=request.getRequestDispatcher("Error.jsp");
				r.forward(request,response);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		if("create".equals(action))
		{
			try
			{
				String name=request.getParameter("name");
				int age=Integer.parseInt(request.getParameter("age"));
				String gender=request.getParameter("gender");
				String marital_status=request.getParameter("marital_status");
				long phone_number=Long.parseLong(request.getParameter("phone_number"));
				String disease_type=request.getParameter("disease_type");
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				
				Service objService = new Service();
				int count =objService.serviceCreate(name,age,gender,marital_status,phone_number,disease_type,username,password);
				
				if(count>0)
				{
					request.setAttribute("user_name",username);
				RequestDispatcher r=request.getRequestDispatcher("Success.jsp");
				r.forward(request,response);
				
				}
				else
				{
					
					RequestDispatcher r=request.getRequestDispatcher("Error.jsp");
					r.forward(request,response);
				}
				
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
