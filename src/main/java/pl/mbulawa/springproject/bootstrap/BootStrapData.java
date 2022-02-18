package pl.mbulawa.springproject.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.mbulawa.springproject.domain.Author;
import pl.mbulawa.springproject.domain.Book;
import pl.mbulawa.springproject.domain.Publisher;
import pl.mbulawa.springproject.repositories.AuthorRepository;
import pl.mbulawa.springproject.repositories.BookRepository;
import pl.mbulawa.springproject.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3245252342");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());

        Publisher publisher1 = new Publisher("Lantern street 12", "Warsaw", "Masovia", "03-222");
        publisherRepository.save(publisher1);

        System.out.println("Number of publishers: " + publisherRepository.count());
    }
}
