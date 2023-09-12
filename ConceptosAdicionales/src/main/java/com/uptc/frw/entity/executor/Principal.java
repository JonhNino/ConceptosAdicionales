package com.uptc.frw.entity.executor;


import com.uptc.frw.entity.conf.PersistenceUtil;
import jakarta.persistence.EntityManager;

public class Principal {

    public static void main(String[] args) {

     EntityManager entityManagerOra =PersistenceUtil.getEntityManagerOra();
     System.out.println("Conexion Oracle");
     EntityManager entityManagerMy =PersistenceUtil.getEntityManagerMy();
     System.out.println("Conexion Mysql");
    }
}
