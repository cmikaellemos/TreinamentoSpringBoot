package br.ufc.demo.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

/**
 * Created by mikaellemos on 17/07/17.
 */

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping(
        method = RequestMethod.GET
    )
    public Iterable<Author> queryAllAuthors(){
        return this.authorRepository.findAll();
    }

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<Void> createAuthor(@RequestBody Author author) throws MalformedInputException, URISyntaxException, MalformedURLException {
        authorRepository.save(author);
        URL createdURL = new URL("http://localhost:8080/authors/" + author.getId().toString());
        return ResponseEntity.created(createdURL.toURI()).build();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}"
    )
    public Author queryAuthor(@RequestBody Integer id){
        return this.authorRepository.find(id);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = {"/id"}
    )
    public void deleteAuthor(Integer id) { authorRepository.delete(id);}



}
