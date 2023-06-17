package com.example.gshop.domain;

import com.example.gshop.repository.GShopTestRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GShopTestTest {

    @Autowired
    GShopTestRepository gShopTestRepository;

    @Autowired
    EntityManager em;

    @Test
    @Transactional
    @Rollback(false)
    public void testGShopTest() {
        GShopTest gShopTest = new GShopTest();
        gShopTest.setExplain("tttt111t");

        gShopTestRepository.save(gShopTest);
        em.flush();
    }



}