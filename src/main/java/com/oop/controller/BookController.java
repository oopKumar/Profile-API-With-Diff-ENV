package com.oop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oop.binding.Book;
import com.oop.binding.BookResponse;
import com.oop.service.BookService;

@RestController
@RequestMapping("library")
public class BookController {
	private @Autowired BookService bookService;
	

	@PostMapping("/saveBook")
	public ResponseEntity<BookResponse>getBookById(@RequestBody Book book){
		return new ResponseEntity<>(bookService.saveBook(book),HttpStatus.OK);
	}
	
	
	@GetMapping("/books")
	public ResponseEntity<List<BookResponse>>getAllBookDetails(){
		return new ResponseEntity<>(bookService.getAllBookDetails(),HttpStatus.OK);
	}
	
	@GetMapping("/book/{bookId}")
	public ResponseEntity<BookResponse>getBookById(@PathVariable Integer bookId){
		return new ResponseEntity<>(bookService.getBookById(bookId),HttpStatus.OK);
	}
	
	

	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String>deleteBookById(@PathVariable Integer bookId){
		return new ResponseEntity<>(bookService.deleteBookById(bookId),HttpStatus.OK);
	}

}
