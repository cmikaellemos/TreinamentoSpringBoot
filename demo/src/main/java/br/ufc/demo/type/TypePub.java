package br.ufc.demo.type;

import br.ufc.demo.publication.Publication;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 18/07/17.
 */

@Data
@NoArgsConstructor
@Entity(name="typepub")
public class TypePub {

    @Id
    @Column(name="id_type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idType;

    @Column(name = "name_type")
    private String nameType;

    @OneToMany(mappedBy = "publications", targetEntity = TypePub.class)
    private List<Publication> publications;
}
