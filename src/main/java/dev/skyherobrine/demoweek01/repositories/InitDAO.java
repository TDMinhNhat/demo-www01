package dev.skyherobrine.demoweek01.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class InitDAO {

    private static EntityManager em = null;

    public InitDAO() {
        if(em == null) {
            em = Persistence.createEntityManagerFactory("demo-week01").createEntityManager();
        }
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
