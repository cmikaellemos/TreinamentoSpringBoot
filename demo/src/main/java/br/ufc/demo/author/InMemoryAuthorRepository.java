package br.ufc.demo.author;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mikaellemos on 17/07/17.
 */

public class InMemoryAuthorRepository {


    private static final List<Author> AUTHORS = new ArrayList<>();

//    static {
//        AUTHORS.addAll(Arrays.asList(
//            new Author(1, "Chico", "Buarque"),
//            new Author(2, "Fernando", "Pessoa"),
//            new Author(3, "Talita", "Pessoa")
//        ));
//    }
//
//    @Override
//    public Iterable<Author> findAll() {
//        return Collections.unmodifiableList(AUTHORS);
//    }
//
//    @Override
//    public Author find(Integer id) {
//        return AUTHORS.get(id);
//    }
//
//    @Override
//    public void save(Author author) {
//        AUTHORS.add(author);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        AUTHORS.remove(this.find(id));
//    }
//
//    @Override
//    public void update(Integer id, Author author) {
//        AUTHORS.set(id, author);
//    }
//

}
