package com.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by King on 2016/2/19.
 */
@Entity
public class Org {
    private int id;
    private String name;
    private Set<Org> children = new HashSet<Org>();
    private Org parent;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToOne
    @JoinColumn(name = "parent_id")
    public Org getParent() {
        return parent;
    }

    public void setParent(Org parent) {
        this.parent = parent;
    }
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "parent",fetch = FetchType.EAGER)
    public Set<Org> getChildren() {
        return children;
    }

    public void setChildren(Set<Org> children) {
        this.children = children;
    }
}
