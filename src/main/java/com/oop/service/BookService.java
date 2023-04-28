package com.oop.service;

import java.util.List;

import com.oop.binding.Book;
import com.oop.binding.BookResponse;

public interface BookService {
	
	public List<BookResponse> getAllBookDetails();
	public BookResponse getBookById(Integer bookId);
	public BookResponse saveBook(Book book);
	public String deleteBookById(Integer bookId);

}
