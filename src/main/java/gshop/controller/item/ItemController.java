package gshop.controller.item;

import gshop.domain.item.Item;
import gshop.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ItemController{

    private final ItemService itemService;

    @GetMapping("/items")
    public String itemList(Model model){



        return "items";
    }

    /**
     * [API] 사용자 리스트 조회
     * 해당 Response는 Toast UI Grid 에 맞는 Response 값으로 구성하여 반환한다.
     *
     * @return responseData
     */
    @GetMapping("api/v1/admin/user")
    public ResponseEntity<Item> selectUserList() {
        log.info("item List2 contorller");
        return new ResponseEntity<>(null, HttpStatus.OK);
        //return new ResponseEntity<>(selectGridUserList, HttpStatus.OK);
    }


}
