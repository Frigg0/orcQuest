package com.frigg0.orcquest.services.deckService;

import com.frigg0.orcquest.models.cards.Card;
import com.frigg0.orcquest.models.cards.CardType;
import com.frigg0.orcquest.services.debuffService.DebuffService;
import com.frigg0.orcquest.services.diceService.DiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrawlCardService {
    // Variables instantiation
    @Autowired
    DiceService diceService;
    @Autowired
    DebuffService debuffService;

    Card warDog(){
        return new Card(25, "Chien de guerre", CardType.Brawl, 2,
                false, 1, debuffService.loseTwoHealth(),
                false, diceService.doubleGreenDices());
    }

    Card peasant(){
        return new Card(26, "Paysans", CardType.Brawl, 1,
                false, 2, debuffService.loseOneHealth(),
                false, diceService.doubleGreenDices());
    }

    Card soldier(){
        return new Card(27, "Soldat", CardType.Brawl, 1,
                false, 3, debuffService.loseTwoHealth(),
                false, diceService.doubleYellowDices());
    }
}
