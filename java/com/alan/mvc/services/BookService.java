package com.alan.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.alan.mvc.models.Book;
import com.alan.mvc.repositories.BookRepository;
@Service
public class BookService {
//	----------------DEPENDENCY INJECTION----------------
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
//    -------------------------------------------------
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    //	updates a book
    public Book updateBook(Long id,String title,String desc,String lang,Integer numOfPages) {
    	 //find the book by id
    	Optional<Book> optionalBook = bookRepository.findById(id);
         //check if book searched for exists
    	 if(optionalBook.isPresent()) {
        	 //create new instance of the book 
        	 Book updatedBook = optionalBook.get();
        	 // use setters to set new values
        	 updatedBook.setTitle(title);
        	 updatedBook.setDescription(desc);
        	 updatedBook.setLanguage(lang);;
        	 updatedBook.setNumberOfPages(numOfPages);
        	 //return the saved copy
              return bookRepository.save(updatedBook);
              //if its not there == null
         } else {
             return null;
         }	
    }
    
    // delete a Book by Id
    public void deleteBook(Long id) {
        	 bookRepository.deleteById(id);      
         }
    
    
}
