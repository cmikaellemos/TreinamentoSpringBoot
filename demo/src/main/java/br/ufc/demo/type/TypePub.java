package br.ufc.demo.type;

import br.ufc.demo.publication.Publication;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@Entity(name="typepub")
public class TypePub {

    @Id
    @Column(name="id_type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idType;

    @Column(name = "name_type",
            unique = true)
    private String nameType;

    @OneToMany(mappedBy = "publications", targetEntity = TypePub.class)
    private List<Publication> publications;

    public TypePub() {
    }
}
