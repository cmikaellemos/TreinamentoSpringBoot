package br.ufc.demo.publication;

import br.ufc.demo.author.Author;
import br.ufc.demo.pubs.Pubs;
import br.ufc.demo.type.TypePub;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by mikaellemos on 18/07/17.
 */

@Data
@NoArgsConstructor
@Entity(name = "publication")
public class Publication {

    @Id
    @Column(name = "id_publication")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublication;

    @ManyToOne()
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    private TypePub typePublication;

    @ManyToOne()
    @JoinColumn(name="id_author", referencedColumnName = "id_author")
    private Author authorPublication;

    @Column(name = "date_publication")
    private Date datePublication;

    private String title;

    @Column(name = "text_publication")
    private String textPublication;

    @ManyToOne()
    @JoinColumn(name = "id_pubs", referencedColumnName = "id_pubs")
    private Pubs pubsPublication;

}
