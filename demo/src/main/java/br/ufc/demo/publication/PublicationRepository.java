package br.ufc.demo.publication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by mikaellemos on 18/07/17.
 */

@Repository
@Transactional
public interface PublicationRepository extends JpaRepository<Publication, Integer>{
}
