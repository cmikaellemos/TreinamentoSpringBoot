package br.ufc.demo.pubs;

import br.ufc.demo.publication.Publication;
import br.ufc.demo.publishers.Publisher;
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
@Entity(name = "pubs")
public class Pubs {

    @Id
    @Column(name = "id_pubs")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPubs;

    @Column(name = "publications_name")
    private String publicationsName;

    @OneToMany(mappedBy = "publications", targetEntity = Pubs.class)
    private List<Publication> publications;

    @ManyToOne()
    @JoinColumn(name = "id_publisher", referencedColumnName = "id_publisher")
    private Publisher pubsPublisher;

}
