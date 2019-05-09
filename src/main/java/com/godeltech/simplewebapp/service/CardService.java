package com.godeltech.simplewebapp.service;

import com.godeltech.simplewebapp.domain.Card;
import com.godeltech.simplewebapp.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public List<Card> getAllCard() {
        return cardRepository.findAll();
    }

    public void save(Card card){
        cardRepository.save(card);
    }
}
