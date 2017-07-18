package br.ufc.demo.type;

import br.ufc.demo.publication.Publication;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikaellemos on 18/07/17.
 */

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

    public TypePub() {
    }

    public TypePub(String nameType, List<Publication> publications) {
        this.nameType = nameType;
        this.publications = publications;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }
}
