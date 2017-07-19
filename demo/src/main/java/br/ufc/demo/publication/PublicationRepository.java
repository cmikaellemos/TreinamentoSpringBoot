package br.ufc.demo.publication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by mikaellemos on 18/07/17.
 */

@RepositoryRestResource(collectionResourceRel = "publications", path = "publications")
public interface PublicationRepository extends JpaRepository<Publication, Integer>{
}
