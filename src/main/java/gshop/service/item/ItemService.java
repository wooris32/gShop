package gshop.service.item;

import gshop.domain.item.Item;
import gshop.repository.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public Long saveItem(Item item){
        itemRepository.save(item);
        return item.getId();
    }

    public Item findItemById(Long id){
        return itemRepository.findItemById(id);
    }

    public List<Item> findItems(){
        return itemRepository.findItems();
    }

    @Transactional
    public void updateItem(Long itemId, String name, int price, int stockQuantity){

    }

}
