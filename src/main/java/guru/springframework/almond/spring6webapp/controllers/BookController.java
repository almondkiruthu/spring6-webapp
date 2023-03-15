package guru.springframework.almond.spring6webapp.controllers;

import guru.springframework.almond.spring6webapp.repositories.AuthorRepository;
import guru.springframework.almond.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    private final BookService bookService;
}
