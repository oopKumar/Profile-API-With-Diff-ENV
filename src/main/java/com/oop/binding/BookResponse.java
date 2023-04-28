package com.oop.binding;

import java.time.LocalDate;

public class BookResponse {
	private Integer bookId;
	private String author;
	private String name;
	private Double price;
	private Integer rackNo;
	private String status;
	private String edition;
	private LocalDate dateOfPurchase;
	
	public BookResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookResponse(Integer bookId, String author, String name, Double price, Integer rackNo, String status,
			String edition, LocalDate dateOfPurchase) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.name = name;
		this.price = price;
		this.rackNo = rackNo;
		this.status = status;
		this.edition = edition;
		this.dateOfPurchase = dateOfPurchase;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRackNo() {
		return rackNo;
	}

	public void setRackNo(Integer rackNo) {
		this.rackNo = rackNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
}
