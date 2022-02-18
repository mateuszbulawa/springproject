package pl.mbulawa.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mbulawa.springproject.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
