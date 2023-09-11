package io.github.chameerar.springhibernatemssql.services;

import io.github.chameerar.springhibernatemssql.models.Book;
import io.github.chameerar.springhibernatemssql.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book get(Long id) {

        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isEmpty()) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND, "Book not found");
        }
        return bookOptional.get();
    }

    public Book update(Long id, Book book) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isEmpty()) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND, "Book not found");
        }
        Book existingBook = bookOptional.get();
        existingBook.setName(book.getName());
        return bookRepository.save(existingBook);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
