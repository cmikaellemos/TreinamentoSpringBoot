package br.ufc.demo.publication;

import br.ufc.demo.author.Author;
import br.ufc.demo.pubs.Pubs;
import br.ufc.demo.type.TypePub;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by mikaellemos on 18/07/17.
 */

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

    @Column(name = "text_publication")
    private String textPublication;

    @ManyToOne()
    @JoinColumn(name = "id_pubs", referencedColumnName = "id_pubs")
    private Pubs pubsPublication;

    public Publication() {
    }

    public Publication(Integer idPublication, TypePub typePublication, Author authorPublication,
                       Date datePublication, String textPublication, Pubs pubsPublication) {
        this.idPublication = idPublication;
        this.typePublication = typePublication;
        this.authorPublication = authorPublication;
        this.datePublication = datePublication;
        this.textPublication = textPublication;
        this.pubsPublication = pubsPublication;
    }

    public TypePub getTypePublication() {
        return typePublication;
    }

    public void setTypePublication(TypePub typePublication) {
        this.typePublication = typePublication;
    }

    public Pubs getPubsPublication() {
        return pubsPublication;
    }

    public void setPubsPublication(Pubs pubsPublication) {
        this.pubsPublication = pubsPublication;
    }

    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }

    public Author getAuthorPublication() {
        return authorPublication;
    }

    public void setAuthorPublication(Author authorPublication) {
        this.authorPublication = authorPublication;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getTextPublication() {
        return textPublication;
    }

    public void setTextPublication(String textPublication) {
        this.textPublication = textPublication;
    }
}
