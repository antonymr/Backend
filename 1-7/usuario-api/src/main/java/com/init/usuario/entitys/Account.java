package com.init.usuario.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number", length = 10)
    public String number;

    @Column(name = "type", length = 150)
    public String type;

    public void setId(long id) {
        this.id = id;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }
    public String getNumber() {
        return number;
    }
    public String getType() {
        return type;
    }
    
}
