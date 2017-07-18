package br.ufc.demo.publishers;

import br.ufc.demo.pubs.Pubs;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 18/07/17.
 */

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

    public Publisher() {
    }

    public Publisher(Integer idPublisher, String namePublisher, List<Pubs> pubs) {
        this.idPublisher = idPublisher;
        this.namePublisher = namePublisher;
        this.pubs = pubs;
    }

    public Integer getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(Integer idPublisher) {
        this.idPublisher = idPublisher;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public List<Pubs> getPubs() {
        return pubs;
    }

    public void setPubs(List<Pubs> pubs) {
        this.pubs = pubs;
    }
}
