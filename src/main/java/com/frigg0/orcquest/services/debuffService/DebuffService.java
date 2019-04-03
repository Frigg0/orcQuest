package com.frigg0.orcquest.services.debuffService;

import com.frigg0.orcquest.models.cards.CardDebuff;
import org.springframework.stereotype.Service;

@Service
public class DebuffService {
    public CardDebuff loseOneGoldOneHealth(){
        return new CardDebuff(1, 1);
    }

    public CardDebuff loseAllOneCardTwoHealth(){
        return new CardDebuff(2, 1, true);
    }

    public CardDebuff loseAllTwoGoldThreeHealth(){
        return new CardDebuff(true, 2, 3);
    }

    public CardDebuff loseTwoCardThreeHealth(){
        return new CardDebuff(3, 2, false);
    }

    public CardDebuff loseAllYourGoldOneHealth(){
        return new CardDebuff(true, 1);
    }

    public CardDebuff loseTwoHealth(){
        return new CardDebuff(2);
    }

    public CardDebuff loseOneHealth(){
        return new CardDebuff(1);
    }
}
