package com.frigg0.orcquest.services.deckService;

import com.frigg0.orcquest.models.cards.Card;
import com.frigg0.orcquest.models.cards.CardType;
import com.frigg0.orcquest.services.debuffService.DebuffService;
import com.frigg0.orcquest.services.diceService.DiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrapCardService {
    // Variables instantiation
    @Autowired
    DiceService diceService;
    @Autowired
    DebuffService debuffService;

    /* Factory methods to create unique card models */
    Card machoires(){
        return new Card(5, "Machoires", CardType.Trap, 1,
                false, 2, debuffService.loseOneGoldOneHealth(),
                true, diceService.doubleGreenDices());
    }

    Card pointes(){
        return new Card(6, "Pointes", CardType.Trap, 2,
                false, 3, debuffService.loseAllOneCardTwoHealth(),
                true, diceService.oneGreenOneYellow());
    }

    Card bouleGeante(){
        return new Card(7, "Boule géante", CardType.Trap, 2,
                false, 7, debuffService.loseAllTwoGoldThreeHealth(),
                true, diceService.doubleRedDices());
    }

    Card pendule(){
        return new Card(8, "Pendule", CardType.Trap, 2,
                false, 5, debuffService.loseTwoCardThreeHealth(),
                true, diceService.doubleYellowDices());
    }

    Card cage(){
        return new Card(9, "Cage", CardType.Trap, 2,
                false, 8, debuffService.loseAllYourGoldOneHealth(),
                true, diceService.oneYellowOneRed());
    }
}
