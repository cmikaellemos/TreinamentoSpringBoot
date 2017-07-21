package br.ufc.demo.publishers;

import br.ufc.demo.publication.Publication;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 18/07/17.
 */

@Data
@AllArgsConstructor
@Entity(name="publisher")
public class Publisher {

    @Id
    @Column(name = "id_publisher")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublisher;

    @Column(name = "name_publisher")
    private String namePublisher;

    private String city;

    private String country;

    @OneToMany(mappedBy = "publications", targetEntity = Publisher.class)
    private List<Publication> publications;

    public Publisher() {
    }
}
