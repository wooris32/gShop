package com.example.gshop.repository;

import com.example.gshop.domain.GShopTest;
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
