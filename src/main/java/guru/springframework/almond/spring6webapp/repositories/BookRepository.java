package guru.springframework.almond.spring6webapp.repositories;

import guru.springframework.almond.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
