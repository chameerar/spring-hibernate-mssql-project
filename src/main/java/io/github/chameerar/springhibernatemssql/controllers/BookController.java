package io.github.chameerar.springhibernatemssql.controllers;

import io.github.chameerar.springhibernatemssql.models.Book;
import io.github.chameerar.springhibernatemssql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping(value = "/", produces = "application/json")
    public List<Book> getBooks() {
        return bookService.list();
    }

    @PostMapping(value = "/new", consumes = "application/json", produces = "application/json")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Book get(@PathVariable Long id) {
        return bookService.get(id);
    }

    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        return bookService.update(id, book);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }
}
