package br.ufc.demo.author;

import br.ufc.demo.publication.Publication;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 17/07/17.
 */

@Data
@AllArgsConstructor
@Entity(name="author")
public class Author {

    @Id
    @Column(name = "id_author")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "publications", targetEntity = Author.class)
    private List<Publication> publications;

    public Author() {
    }
}
