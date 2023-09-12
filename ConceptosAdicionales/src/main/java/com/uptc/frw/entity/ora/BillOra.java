package com.uptc.frw.entity.ora;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COMPRAS")
public class BillOra {

    @Id
    @Column(name = "ID_COMPRA")
    private Long id;

    @Column(name = "ID_PERSONA", insertable = false, updatable = false)
    private int personId;

    @Column(name = "FECHA")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "ID_PERSONA", nullable = false)
    private PersonOra person;

    @OneToMany(mappedBy = "bill")
    private List<BillDetailOra> billDetails;

    public BillOra(){}

    public BillOra(Date date, PersonOra person) {
        this.date = date;
        this.person = person;
    }

    public BillOra(Long id, int personId, Date date) {
        this.id = id;
        this.personId = personId;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PersonOra getPerson() {
        return person;
    }

    public void setPerson(PersonOra person) {
        this.person = person;
    }

    public List<BillDetailOra> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetailOra> billDetails) {
        this.billDetails = billDetails;
    }

}
