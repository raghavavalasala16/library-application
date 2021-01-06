package org.jsp.app.model;



import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;



import org.jsp.app.controller.AddServlet;
import org.jsp.app.model.Book;

	
	
public class CleanCodeApproach {
	
	
	 static EntityManagerFactory factory=Persistence.createEntityManagerFactory("LibraryManagementUsingMVC");
	static EntityManager manager=factory.createEntityManager();
	
			
	
		
		
	
			public void addBook(String bn,String ba,int be,double bp,String bt) {
				
			
				manager.getTransaction().begin();
				
				Book book=new Book();
				
				book.setBooktitle(bn);
				book.setBookauthor(ba);
				book.setEdition(be);
				book.setPrice(bp);
				book.setBooktype(bt);
				
				manager.persist(book);
	
				manager.getTransaction().commit();
				
			}
			public void SearchBook(String bname) {
				
				manager.getTransaction().begin();
				
				Book book=manager.find(Book.class,bname);
				
				System.out.println(book);
				
				
				
				manager.getTransaction().commit();
			}
			public void UpdateBook(String bname,int be) {
				
				manager.getTransaction().begin();
				
				 Book book = manager.find(Book.class,bname);
				
				 book.setEdition(be);
				 
				 System.out.println(book);
				 
				 
				 
				 
				 manager.getTransaction().commit();
            }
			public void RemoveBook(String bname) {

				manager.getTransaction().begin();
				
				Book book = manager.find(Book.class, bname);
				
				manager.remove(book);
				
				manager.getTransaction().commit();
						
			}
			
}
