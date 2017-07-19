package br.ufc.demo.publishers;

import br.ufc.demo.pubs.Pubs;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 18/07/17.
 */

@Data
@NoArgsConstructor
@Entity(name="publisher")
public class Publisher {

    @Id
    @Column(name = "id_publisher")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublisher;

    @Column(name = "name_publisher")
    private String namePublisher;

    @OneToMany(mappedBy = "pubs", targetEntity = Publisher.class)
    private List<Pubs> pubs;

}
