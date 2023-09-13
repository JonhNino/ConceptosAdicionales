package com.uptc.frw.entity.executor;


import com.uptc.frw.entity.conf.PersistenceUtil;
import com.uptc.frw.entity.my.BillMy;
import com.uptc.frw.entity.my.BookMy;
import com.uptc.frw.entity.my.PersonMy;
import com.uptc.frw.entity.ora.BillOra;
import com.uptc.frw.entity.ora.BookOra;
import com.uptc.frw.entity.ora.PersonOra;
import jakarta.persistence.EntityManager;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        //EntityManager entityManagerOra = PersistenceUtil.getEntityManagerOra();
        //System.out.println("Conexion Oracle");
        //entityManagerOra.getTransaction().begin();
        //     createPersonOra(entityManagerOra);
        //     createBookOra(entityManagerOra);
        //createTableGeneratorOra(entityManagerOra);
        //entityManagerOra.getTransaction().commit();

          EntityManager entityManagerMy = PersistenceUtil.getEntityManagerMy();
          System.out.println("Conexion Mysql");
          entityManagerMy.getTransaction().begin();
        //    createBook(entityManagerMy);
        //   createPerson(entityManagerMy);
          createTableGenerator(entityManagerMy);
          entityManagerMy.getTransaction().commit();
    }

    public static void createPersonOra(EntityManager entityManagerOra) {
        PersonOra personOra = new PersonOra(("Juana "), "Jane", "Colombiana");
        entityManagerOra.persist(personOra);
    }

    public static void createBookOra(EntityManager entityManagerOra) {
        for (int i = 0; i < 100; i++) {
            BookOra bookOra = new BookOra("Biblia Nuevo testamento" + i, 5033.4 + i);
            entityManagerOra.persist(bookOra);
        }
    }

    public static void createPerson(EntityManager entityManagerMy) {
        PersonMy personMy = entityManagerMy.find(PersonMy.class, 1);
        BillMy billMy = new BillMy(new Date(), personMy);
        entityManagerMy.persist(billMy);
    }

    public static void createBook(EntityManager entityManagerMy) {
        for (int i = 0; i < 100; i++) {
            BookMy bookMy = new BookMy("Biblia32" + i, 352.2 + i);
            entityManagerMy.persist(bookMy);
        }
    }

    public static void createTableGeneratorOra(EntityManager entityManagerOra) {
        PersonOra personOra = entityManagerOra.find(PersonOra.class, 12);
        BillOra billOra = new BillOra(new Date(), personOra);
        entityManagerOra.persist(billOra);
    }

    public static void createTableGenerator(EntityManager entityManagerMy) {
        PersonMy personMy = entityManagerMy.find(PersonMy.class, 1);
        BillMy billMy = new BillMy(new Date(), personMy);
        entityManagerMy.persist(billMy);
    }

    public static void createPersonMysql(EntityManager entityManagerMy) {
        for (int i = 0; i < 100; i++) {
            PersonMy personMy = new PersonMy(("Juana " + i), "Jane", "Colombiana");
            entityManagerMy.persist(personMy);
        }
    }

}
