package guru.springframework.almond.spring6webapp.repositories;

import guru.springframework.almond.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
