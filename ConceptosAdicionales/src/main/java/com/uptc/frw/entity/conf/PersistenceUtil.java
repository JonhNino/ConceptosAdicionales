package com.uptc.frw.entity.conf;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenceUtil {


    private static EntityManagerFactory ORA_ENTITY_MANAGER_FACTORY;
    private static EntityManagerFactory MY_ENTITY_MANAGER_FACTORY;


   public static EntityManager getEntityManagerOra(){
        if(ORA_ENTITY_MANAGER_FACTORY==null){
            ORA_ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("feriaUnitOra");
        }
       return ORA_ENTITY_MANAGER_FACTORY.createEntityManager();
   }

    public static EntityManager getEntityManagerMy(){
        if(MY_ENTITY_MANAGER_FACTORY==null){
            MY_ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("feriaUnitMy");
        }
        return MY_ENTITY_MANAGER_FACTORY.createEntityManager();
    }

}
