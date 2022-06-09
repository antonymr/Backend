package com.init.usuario.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 150)
    public String name;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "identification", length = 13)
    public String identification;

    @Column(name = "email", length = 100)
    public String email;

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getIdentification() {
        return identification;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
