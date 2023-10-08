package com.crud.library.service;

import java.util.List;

import com.crud.library.model.Book;

public interface ActionService {

	Book addBook(Book book);

	List<Book> getAllBooksRepo();

	Book getBookByIdRepo(Integer bookId);

	Book updateBookRepo(Integer bookId, Book book);

	void deleteAllBooksRepo();

	void deleteBookByIdRepo(Integer bookId);

	List<Book> getOnlyRepo();

}
