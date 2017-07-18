package br.ufc.demo.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by mikaellemos on 17/07/17.
 */

@Repository
@Transactional
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
