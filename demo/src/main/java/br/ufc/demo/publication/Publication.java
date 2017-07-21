package br.ufc.demo.publication;

import br.ufc.demo.author.Author;
import br.ufc.demo.publishers.Publisher;
import br.ufc.demo.type.TypePub;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mikaellemos on 18/07/17.
 */

@Data
@AllArgsConstructor
@Entity(name = "publication")
public class Publication {

    @Id
    @Column(name = "id_publication")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublication;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_publication")
    private Date datePublication;

    private String title;

    @Column(name = "text_publication")
    private String textPublication;

    @ManyToOne()
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    private TypePub typePublication;

    @ManyToOne()
    @JoinColumn(name="id_author", referencedColumnName = "id_author")
    private Author authorPublication;

    @ManyToOne()
    @JoinColumn(name = "id_publisher", referencedColumnName = "id_publisher")
    private Publisher pubsPublisher;

    public Publication() {
    }
}
