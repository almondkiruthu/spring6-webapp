package guru.springframework.almond.spring6webapp.repositories;

import guru.springframework.almond.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
