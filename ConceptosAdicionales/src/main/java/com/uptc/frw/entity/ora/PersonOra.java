package com.uptc.frw.entity.ora;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PERSONAS")
public class PersonOra {

    @Id
    @Column(name = "ID_PERSONA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRES")
    private String name;

    @Column(name = "APELLIDOS")
    private String lastName;

    @Column(name = "NACIONALIDAD")
    private String nationality;
    @OneToMany(mappedBy = "person")
    private List<BillOra> bills;

    @ManyToMany(mappedBy = "authors")
    private List<BookOra> books;

    public PersonOra(){}

    public PersonOra(String name, String lastName, String nationality) {
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public PersonOra(Long id, String name, String lastName, String nationality, List<BillOra> bills, List<BookOra> books) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
        this.bills = bills;
        this.books = books;
    }

    public PersonOra(String name, String lastName, String nationality, List<BillOra> bills, List<BookOra> books) {
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
        this.bills = bills;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<BillOra> getBills() {
        return bills;
    }

    public void setBills(List<BillOra> bills) {
        this.bills = bills;
    }

    public List<BookOra> getBooks() {
        return books;
    }

    public void setBooks(List<BookOra> books) {
        this.books = books;
    }
}
