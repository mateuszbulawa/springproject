package pl.mbulawa.springproject.repositories;

import pl.mbulawa.springproject.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
