package com.init.usuario.entitys;

public class User {
    private long id;
    public String name;
    private String password;
    public String identification;
    public String mail;

    public User(long id, String name, String password, String identification, String mail){
        this.id = id;
        this.name = name;
        this.password = password;
        this.identification = identification;
        this.mail = mail;
    }

    public String getId() {
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
    public String getMail() {
        return mail;
    }

    public void setId(String id) {
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
    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
