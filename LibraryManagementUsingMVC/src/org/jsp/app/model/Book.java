package org.jsp.app.model;

import java.io.Serializable;
import javax.persistence.*;


@Entity

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String booktitle;

	private String bookauthor;

	private String booktype;

	private int edition;

	private double price;

	public Book() {
	}

	public String getBooktitle() {
		return this.booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getBookauthor() {
		return this.bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBooktype() {
		return this.booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	public int getEdition() {
		return this.edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}