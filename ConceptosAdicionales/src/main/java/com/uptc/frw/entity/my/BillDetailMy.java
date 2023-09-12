package com.uptc.frw.entity.my;

import jakarta.persistence.*;

@Entity
@Table(name = "DETALLES_COMPRA")
public class BillDetailMy {

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
    private BillMy bill;
    @ManyToOne
    @JoinColumn(name = "ID_LIBRO", nullable = false)
    private BookMy book;

    public BillDetailMy(){}

    public BillDetailMy(int quantity, BillMy bill, BookMy book) {
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

    public BillMy getBill() {
        return bill;
    }

    public void setBill(BillMy bill) {
        this.bill = bill;
    }

    public BookMy getBook() {
        return book;
    }

    public void setBook(BookMy book) {
        this.book = book;
    }
}
