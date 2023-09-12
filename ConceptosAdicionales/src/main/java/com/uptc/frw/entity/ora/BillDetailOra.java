package com.uptc.frw.entity.ora;

import jakarta.persistence.*;

@Entity
@Table(name = "DETALLES_COMPRA")
public class BillDetailOra {

    @Id
    @Column(name = "ID_DETALLE")
     private Long id;

    @Column(name = "ID_COMPRA", insertable = false, updatable = false)
    private int billId;
    @Basic
    @Column(name = "ID_LIBRO",  insertable = false, updatable = false)
    private int bookId;
    @Basic
    @Column(name = "CANTIDAD")
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "ID_COMPRA", nullable = false)
    private BillOra bill;
    @ManyToOne
    @JoinColumn(name = "ID_LIBRO", nullable = false)
    private BookOra book;

    public BillDetailOra(){}

    public BillDetailOra(int quantity, BillOra bill, BookOra book) {
        this.quantity = quantity;
        this.bill = bill;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BillOra getBill() {
        return bill;
    }

    public void setBill(BillOra bill) {
        this.bill = bill;
    }

    public BookOra getBook() {
        return book;
    }

    public void setBook(BookOra book) {
        this.book = book;
    }
}
