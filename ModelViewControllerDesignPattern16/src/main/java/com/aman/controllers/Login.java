package com.aman.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.aman.dbconn.DbConnection;
import com.aman.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/loginForm")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String myemail =req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		try {
			Connection conn = DbConnection.getConnection();
			String select_sql_query = "SELECT * FROM register WHERE email=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(select_sql_query);
			ps.setString(1, myemail);
			ps.setString(2, mypass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				User user = new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				
				// aab ham chah rhe hai har ek page par uper wala  object accessible ho
				// to hm session ka use kar lenge
				HttpSession session = req.getSession();
				
				session.setAttribute("session_user", user);
				
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp"); // because mujhe ish baar dynamic page create karna hai so hamne le liya hai ish baar jsp
				
				rd.forward(req, resp);
				
			}else {
				out.println("<h3 style='color:red'>Email id and password didnt matched </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				
				rd.include(req, resp);
				
			}
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
