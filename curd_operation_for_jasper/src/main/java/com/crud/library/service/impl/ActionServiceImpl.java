package com.crud.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.library.model.Book;
import com.crud.library.repository.ActionRepository;
import com.crud.library.service.ActionService;

@Service
public class ActionServiceImpl implements ActionService{
	
	@Autowired ActionRepository actionRepository;
	@Override
	public Book addBook(Book book) {
		return actionRepository.save(book);
	}

	@Override
	public List<Book> getAllBooksRepo() {
		 
		return actionRepository.findAll();
	}

	@Override
	public Book getBookByIdRepo(Integer bookId) {
		 
		return actionRepository.findById(bookId).get() ;
	}

	@Override
	public Book updateBookRepo(Integer bookId, Book book) {
		Book b = actionRepository.findById(bookId).get();
		b.setAuthor(book.getAuthor());
		b.setBook_name(book.getBook_name());
		b.setPrice(book.getPrice());
		return actionRepository.save(b);
	}

	@Override
	public void deleteAllBooksRepo() {
		actionRepository.deleteAll();
		
	}

	@Override
	public void deleteBookByIdRepo(Integer bookId) {
		
		Book book = actionRepository.findById(bookId).get();
		actionRepository.delete(book);
		
	}

	@Override
	public List<Book> getOnlyRepo() {
		List<Book> book = actionRepository.findAll();
		
		for(Book b : book) {
			
		}
		return null;
	}

}
