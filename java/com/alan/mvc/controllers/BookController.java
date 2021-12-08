package com.alan.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alan.mvc.models.Book;
import com.alan.mvc.services.BookService;

@Controller
public class BookController {
	
	//--------------DEPENDENCY INJECTION---------------
    private final BookService bookService;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    //---------------------------------------------------
//	@RequestMapping("/")
//	public String show(Model model) {
//		List<Book> books=bookService.allBooks();
//		model.addAttribute("books", books);
//		return "show.jsp";
//	}
	@RequestMapping("/{id}")
	public String oneBook(@PathVariable("id") Long id, Model model ) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "show.jsp";
		
		
	}

}
