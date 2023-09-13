package com.uptc.frw.entity.my;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "COMPRAS")
public class BillMy {

    @Id
    @Column(name = "ID_COMPRA")
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "table_gen")
    @TableGenerator(name = "table_gen",
            table="generator",
            pkColumnName = "table_name",
            valueColumnName = "valor",
            pkColumnValue = "compras",
            allocationSize = 1)
    private Long id;

    @Column(name = "ID_PERSONA", insertable = false, updatable = false)
    private int personId;

    @Column(name = "FECHA")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "ID_PERSONA", nullable = false)
    private PersonMy person;

    @OneToMany(mappedBy = "bill")
    private List<BillDetailMy> billDetails;

    public BillMy(){}


   public BillMy(Long id, int personId, Date date) {
        this.id = id;
        this.personId = personId;
        this.date = date;
    }

    public BillMy(Date date, PersonMy person) {
        this.date = date;
        this.person = person;
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

    public PersonMy getPerson() {
        return person;
    }

    public void setPerson(PersonMy person) {
        this.person = person;
    }

    public List<BillDetailMy> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetailMy> billDetails) {
        this.billDetails = billDetails;
    }

}
