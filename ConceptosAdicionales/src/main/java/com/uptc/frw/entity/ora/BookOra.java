package com.uptc.frw.entity.ora;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "LIBROS")
public class BookOra {

    @Id
    @Column(name = "ID_LIBRO")
    private Long id;
    @Column(name = "TITULO")
    private String title;
    @Column(name = "PRECIO")
    private Double price;

    @OneToOne(mappedBy = "editionBook")
    private EditionOra edition;

    @OneToMany(mappedBy = "book")
    private List<BillDetailOra> billDetails;

    @ManyToMany
    @JoinTable(
            name = "AUTOR_LIBRO",
            joinColumns = @JoinColumn(name = "ID_LIBRO"),
            inverseJoinColumns = @JoinColumn(name = "ID_AUTOR")
    )
    private List<PersonOra> authors;

    public BookOra(){}

    public BookOra(Long id, String title, Double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public BookOra(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EditionOra getEdition() {
        return edition;
    }
    public void setEdition(EditionOra edition) {
        this.edition = edition;
    }

    public List<BillDetailOra> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetailOra> billDetails) {
        this.billDetails = billDetails;
    }

    public List<PersonOra> getAuthors() {
        return authors;
    }

    public void setAuthors(List<PersonOra> authors) {
        this.authors = authors;
    }
}
