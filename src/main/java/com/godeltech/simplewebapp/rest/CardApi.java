package com.godeltech.simplewebapp.rest;

import com.godeltech.simplewebapp.domain.Card;
import com.godeltech.simplewebapp.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/card")
@CrossOrigin
public class CardApi {
    @Autowired
    private CardService cardService;

    @GetMapping("/getAllCard")
    private List<Card> getAllCard(){
        return cardService.getAllCard();
    }

    @PostMapping("/postCard")
    private void postCard(@RequestBody Card card ){
        cardService.save(card);
    }

}
