package com.pluralsight.entity;

import javax.persistence.*;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="application_id")
    private Integer id;

    private String name;
    private String desciption;
    private String owner;

    Application(){
        super();
    }
    Application(int id, String name, String desciption, String owner){
        this.id = id;
        this.name = name;
        this.desciption = desciption;
        this.owner= owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
