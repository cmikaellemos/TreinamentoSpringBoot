package br.ufc.demo.publication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mikaellemos on 18/07/17.
 */

@RepositoryRestResource(collectionResourceRel = "publications", path = "publications")
public interface PublicationRepository extends CrudRepository<Publication, Integer> {
}
