package br.ufc.demo.author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mikaellemos on 17/07/17.
 */

@RepositoryRestResource(collectionResourceRel = "authors", path = "authors")
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
