package com.uptc.frw.entity.my;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "LIBROS")
public class BookMy {

    @Id
    @Column(name = "ID_LIBRO")
    private Long id;
    @Column(name = "TITULO")
    private String title;
    @Column(name = "PRECIO")
    private Double price;

    @OneToOne(mappedBy = "editionBook")
    private EditionMy edition;

    @OneToMany(mappedBy = "book")
    private List<BillDetailMy> billDetails;

    @ManyToMany
    @JoinTable(
            name = "AUTOR_LIBRO",
            joinColumns = @JoinColumn(name = "ID_LIBRO"),
            inverseJoinColumns = @JoinColumn(name = "ID_AUTOR")
    )
    private List<PersonMy> authors;

    public BookMy(){}

    public BookMy(Long id, String title, Double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public BookMy(String title, Double price) {
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

    public EditionMy getEdition() {
        return edition;
    }
    public void setEdition(EditionMy edition) {
        this.edition = edition;
    }

    public List<BillDetailMy> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetailMy> billDetails) {
        this.billDetails = billDetails;
    }

    public List<PersonMy> getAuthors() {
        return authors;
    }

    public void setAuthors(List<PersonMy> authors) {
        this.authors = authors;
    }
}
