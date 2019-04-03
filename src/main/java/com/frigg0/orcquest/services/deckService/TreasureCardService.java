package com.frigg0.orcquest.services.deckService;

import com.frigg0.orcquest.models.cards.Card;
import com.frigg0.orcquest.models.cards.CardType;
import org.springframework.stereotype.Service;

@Service
public class TreasureCardService {
    Card stickySocks(){
        return new Card(21, "Chaussette puante", CardType.Treasure,
                false, 0, true);
    }

    Card painfulPurse(){
        return new Card(22, "Bourse douloureuse", CardType.Treasure,
                false, 1, true);
    }

    Card goldenTooth(){
        return new Card(23, "Chicots d'or", CardType.Treasure,
                false, 2, true);
    }

    Card treasureChest(){
        return new Card(24, "Coffre à trésor", CardType.Treasure,
                true, 8, true);
    }
}
