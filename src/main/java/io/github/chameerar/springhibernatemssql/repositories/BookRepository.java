package io.github.chameerar.springhibernatemssql.repositories;

import io.github.chameerar.springhibernatemssql.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
