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

@WebServlet("/view/SearchServlet")
public class SearchServlet extends HttpServlet {
	
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
	 
	 String name =req.getParameter("bn");
	 CleanCodeApproach c1=new CleanCodeApproach();
	// Book book=new Book();
	 c1.SearchBook(name);
//	 Book book=new Book();
//	  ServletContext context= getServletContext();
//		 context.setAttribute("name", book.getBooktitle());
//		 context.setAttribute("author", book.getBookauthor());
//		 context.setAttribute("edition", book.getEdition());
//		 context.setAttribute("price",book.getPrice());
//		 context.setAttribute("type", book.getBooktype());
//		
//
//		 RequestDispatcher r1 =req.getRequestDispatcher("PrintSearch.jsp");
//		 r1.include(req, resp);
}
}
