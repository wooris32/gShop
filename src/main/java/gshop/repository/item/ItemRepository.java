package gshop.repository.item;

import gshop.domain.item.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    @PersistenceContext
    private final EntityManager em;

    public void save(Item item){
            em.persist(item);
    }

    public Item findItemById(Long id){
        return em.find(Item.class, id);
    }

    public List<Item> findItems(){
        return em.createQuery("SELECT i FROM Item i",Item.class)
                .getResultList();
    }
}
