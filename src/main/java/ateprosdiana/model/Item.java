package ateprosdiana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "item")
public class Item extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "itemGenerators", sequenceName = "item_genertaor", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "itemGenerators", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "count")
    public String count;

    @Column(name = "price")
    public String price;

    @Column(name = "type")
    public String type;

    @Column(name = "description")
    public String description;

    @Column(name = "createdAt")
    public String createdAt;

    @Column(name = "updateAt")
    public String updatedAt;

}
