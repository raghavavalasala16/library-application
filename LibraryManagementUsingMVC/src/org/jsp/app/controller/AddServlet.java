package org.jsp.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.model.CleanCodeApproach;

@WebServlet("/view/AddServlet")
public class AddServlet extends HttpServlet {

	 

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String  BookName = req.getParameter("bn");
		String  BookAuthor=req.getParameter("ba");
		String BookEdition=req.getParameter("be");
		String BookPrice=req.getParameter("bp");
		String  BookType= req.getParameter("bt");
		 
		 int edition=Integer.parseInt(BookEdition);
		  double price=Double.parseDouble(BookPrice);
		  
		  CleanCodeApproach c1 = new CleanCodeApproach();
		  c1.addBook(BookName,BookAuthor,edition,price,BookType);
			
	  ServletContext context= getServletContext();
			 context.setAttribute("name",BookName );
			 context.setAttribute("author", BookAuthor);
			 context.setAttribute("edition", edition);
			 context.setAttribute("price", price);
			 context.setAttribute("type", BookType);
			
	 
			 RequestDispatcher r1 =req.getRequestDispatcher("PrintAdd.jsp");
			 r1.include(req, resp);
		  
		  
		
		  
		
	}
}
