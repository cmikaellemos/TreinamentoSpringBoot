package br.ufc.demo.type;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "types", path = "types")
public interface TypePubRepository extends CrudRepository<TypePub, Integer> {
}
