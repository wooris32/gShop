package com.example.repository;

import com.example.domain.GShopTest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class GShopTestRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(GShopTest gShopTest) {
        em.persist(gShopTest);
        return gShopTest.getId();
    }
}
