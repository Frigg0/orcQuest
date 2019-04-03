package com.frigg0.orcquest.services.deckService;

import com.frigg0.orcquest.models.cards.Card;
import com.frigg0.orcquest.models.cards.CardType;
import com.frigg0.orcquest.services.diceService.DiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaptureCardService {
    // Variables instantiations
    @Autowired
    DiceService diceService;

    /* Factory methods to create unique card models */
    Card chopeLaPoulette(){
        return new Card(1, "Chope la poulette", CardType.Caputre,
                1, false,
                1, true, diceService.doubleGreenDices());
    }

    Card chopeLaBiquette(){
        return new Card(2, "Chope la biquette", CardType.Caputre,
                1, false,
                2, true, diceService.doubleYellowDices());
    }

    Card chopeLaVachette(){
        return new Card(3, "Chope la vachette", CardType.Caputre,
                1, false,
                4, true, diceService.doubleRedDices());
    }

    Card chopeLaPrincesse(){
        return new Card(4, "Chope la princesse", CardType.Caputre,
                true, 8, true);
    }
}
