package br.ufc.demo.pubs;

import br.ufc.demo.publication.Publication;
import br.ufc.demo.publishers.Publisher;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 18/07/17.
 */

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

    public Pubs() {
    }

    public Pubs(Integer idPubs, String publicationsName, List<Publication> publicationPubs) {
        this.idPubs = idPubs;
        this.publicationsName = publicationsName;
        this.publications = publicationPubs;
    }

    public Integer getIdPubs() {
        return idPubs;
    }

    public void setIdPubs(Integer idPubs) {
        this.idPubs = idPubs;
    }

    public String getPublicationsName() {
        return publicationsName;
    }

    public void setPublicationsName(String publicationsName) {
        this.publicationsName = publicationsName;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public Publisher getPubsPublisher() {
        return pubsPublisher;
    }

    public void setPubsPublisher(Publisher pubsPublisher) {
        this.pubsPublisher = pubsPublisher;
    }
}
