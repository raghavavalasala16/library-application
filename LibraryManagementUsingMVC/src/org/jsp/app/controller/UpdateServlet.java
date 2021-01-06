package org.jsp.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.app.model.Book;
import org.jsp.app.model.CleanCodeApproach;

@WebServlet("/view/UpdateServlet")
public class UpdateServlet extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
	
	 String name=req.getParameter("bn");
	 String edition=req.getParameter("be");
	 int ed=Integer.parseInt(edition);
	 
	 
	 
	 CleanCodeApproach c1=new CleanCodeApproach();
	 
	 c1.UpdateBook(name,ed);
	 
	 
//	 Book book = new Book();
//	  ServletContext context= getServletContext();
//	  context.setAttribute("name", book.getBooktitle());
//		 context.setAttribute("author", book.getBookauthor());
//		 context.setAttribute("edition", book.getEdition());
//		 context.setAttribute("price",book.getPrice());
//		 context.setAttribute("type", book.getBooktype());
//		
//
//		 RequestDispatcher r1 =req.getRequestDispatcher("PrintUpdate.jsp");
//		 r1.include(req, resp);
	
	 
}
}
