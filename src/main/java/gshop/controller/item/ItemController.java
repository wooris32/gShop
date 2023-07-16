package gshop.controller.item;

import gshop.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ItemController{

    private final ItemService itemService;

    @GetMapping("/items")
    public String itemList(Model model){



        return "items";
    }


}
