package com.lab1.entity;

public class User {
    private long id;
    private String name;
    private String surname;
    private Role role;

    // Constructors
    public User() {
    }

    public User(long id, String name, String surname, Role role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Role getRole() {
        return role;
    }

    private enum Role {
        FE, BE, CMS, OPS, QA, AQA
    }
}
