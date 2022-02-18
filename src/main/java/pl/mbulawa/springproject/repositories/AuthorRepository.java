package pl.mbulawa.springproject.repositories;

import pl.mbulawa.springproject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
