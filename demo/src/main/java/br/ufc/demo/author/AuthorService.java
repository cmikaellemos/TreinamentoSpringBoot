package br.ufc.demo.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 18/07/17.
 */

//@Service
public class AuthorService{

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll(){
        return this.authorRepository.findAll();
    }

    public void create(Author author){
        this.authorRepository.save(author);
    }

    public Author findOne(Integer id){
        return this.authorRepository.findOne(id);
    }

    public void update(Integer id, String firstName, String lastName){
       Author tempAuthor = this.authorRepository.findOne(id);
       tempAuthor.setFirstName(firstName);
       tempAuthor.setLastName(lastName);
       this.authorRepository.save(tempAuthor);
    }

    public void delete(Integer id){
        authorRepository.delete(id);
    }

}
