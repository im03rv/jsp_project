package com.crud.library.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.library.model.Book;
import com.crud.library.service.ActionService;
import com.crud.library.service.impl.ReportService;

import net.sf.jasperreports.engine.JRException;



@RestController
@RequestMapping("/api/actions")

public class ActionsController {
	
	@GetMapping("/vasy")
	public String get() {
		return "Vasyian";
	}

	@Autowired
	private ActionService actionService;
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/report/{format}")
	public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
		return reportService.exportReport(format);
	}
//		@PostMapping("/add")
//		public Book createBook(@RequestBody Book book) {
//			return this.bookService.createBook(book);
//		}
	@PostMapping("/add")
	public Book createBookByRepo(@RequestBody Book book) {
		return actionService.addBook(book);
	}

//		@GetMapping("/books")
//		public List<Book> getAllBooks() {
//			return this.bookService.getAllBooks();
//		}
	@GetMapping("/do")
	public List<Book> getOnly() {
		return actionService.getOnlyRepo();
	}
	@GetMapping("/show")
	public List<Book> getAllBooksRepo() {
		return actionService.getAllBooksRepo();
	}

//		@GetMapping("/{bookId}")
//		public Book getBookById(@PathVariable Integer bookId) {
//			return this.bookService.getBookById(bookId);
//		}

	@GetMapping("/{bookId}")
	public Book getBookByIdRepo(@PathVariable Integer bookId) {
		return actionService.getBookByIdRepo(bookId);
	}

//		@PutMapping("/{bookId}")
//		public Book updateBook(@PathVariable Book book) {
//			return this.bookService.updateBook(book);
//		}

	@PutMapping("/{bookId}")
	public Book updateBookRepo(@PathVariable(value = "bookId") Integer bookId, @RequestBody Book book) {
		return actionService.updateBookRepo(bookId, book);
	}

//		@DeleteMapping
//		public String deleteAllBooks() {
//			this.bookService.deleteAllBooks();
//			return "All users have been deleted successfully.";
//		}

	@DeleteMapping
	public String deleteAllBooksRepo() {
		this.actionService.deleteAllBooksRepo();
		return "All Books have been deleted successfully.";
	}

//		@DeleteMapping("/{id}")
//		public Book deleteBook(@PathVariable Integer bookId) {
//			return this.bookService.deleteBookById(bookId);
//		}

	@DeleteMapping("/{bookId}")
	public String deleteBookRepo(@PathVariable Integer bookId) {

		this.actionService.deleteBookByIdRepo(bookId);
		return "the book " + bookId + " have been deleted successfully.";
	}

}
