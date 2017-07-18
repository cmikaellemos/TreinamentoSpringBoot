package br.ufc.demo.author;

import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by mikaellemos on 17/07/17.
 */

public interface AuthorRepository {

    Iterable<Author> findAll();

    Author find(Integer id);

    void save(Author author);

    void delete(Integer id);

    void update(Integer id, Author author);

}
