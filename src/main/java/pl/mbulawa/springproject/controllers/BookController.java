package pl.mbulawa.springproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mbulawa.springproject.repositories.BookRepository;

@RequiredArgsConstructor
@Controller
public class BookController {

    private final BookRepository bookRepository;

    @RequestMapping(value = "/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
