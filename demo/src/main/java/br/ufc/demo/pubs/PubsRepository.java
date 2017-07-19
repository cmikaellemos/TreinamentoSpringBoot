package br.ufc.demo.pubs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pubs", path = "pubs")
public interface PubsRepository extends JpaRepository<Pubs, Integer> {
}
