package com.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oop.binding.Book;
import com.oop.binding.BookResponse;
import com.oop.entity.BookEntity;
import com.oop.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	public List<BookResponse> getAllBookDetails() {
		
		List<BookEntity> book = bookRepository.findAll();
		List<BookResponse> resp = new ArrayList();
		for(BookEntity b:book) {
			BookResponse bookResponse = new BookResponse();
			BeanUtils.copyProperties(b,bookResponse);
			resp.add(bookResponse);
		}
		
		return resp;
	}


	public BookResponse getBookById(Integer bookId) {
		Optional<BookEntity> findById = bookRepository.findById(bookId);
		BookResponse bookResponse = new BookResponse();
		BeanUtils.copyProperties(findById,bookResponse);
		
		return bookResponse;
	}

	
	public BookResponse saveBook(Book book) {
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(book,bookEntity);
		BookEntity save = bookRepository.save(bookEntity);
		BookResponse response = new BookResponse();
		response.setBookId(save.getBookId());
		BeanUtils.copyProperties(bookEntity,response);
		
		return response;
	}

	
	public String deleteBookById(Integer bookId) {
		bookRepository.deleteById(bookId);
		return "Book Deleted Successfully with this id  "+bookId;
	}

}
