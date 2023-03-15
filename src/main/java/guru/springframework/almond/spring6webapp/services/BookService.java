package guru.springframework.almond.spring6webapp.services;

import guru.springframework.almond.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
