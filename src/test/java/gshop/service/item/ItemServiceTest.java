package gshop.service.item;

import gshop.domain.item.Item;
import gshop.repository.item.ItemRepository;
import jakarta.persistence.EntityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemRepository itemRepository;

    @Autowired
    EntityManager em;

    @Test
    @Rollback(false)
    public void Item_저장() throws Exception{
        //given
        Item item = new Item("test","EA","1LT",10000.0,"Test");

        //when
        Long savedId = itemService.saveItem(item);

        //then
        em.flush();
        assertEquals(item,itemRepository.findItemById(savedId));
    }
}