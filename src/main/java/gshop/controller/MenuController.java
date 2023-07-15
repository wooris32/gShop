package gshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MenuController {

    @RequestMapping("/dashboard")
    public String dashBoard(){
        log.info("dashboasrd contorller");
        return "pages/dashboard/dashboard";
    }

    @RequestMapping("/item-list")
    public String itemList(){
        log.info("item List contorller");
        return "pages/item/item_list";
    }

    @RequestMapping("/item-list2")
    public String itemList2(){
        log.info("item List2 contorller");
        return "pages/item/item_list2";
    }

}
