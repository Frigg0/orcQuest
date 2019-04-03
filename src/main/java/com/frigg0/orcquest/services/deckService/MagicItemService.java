package com.frigg0.orcquest.services.deckService;

import com.frigg0.orcquest.models.cards.Card;
import com.frigg0.orcquest.models.cards.CardType;
import org.springframework.stereotype.Service;

@Service
public class MagicItemService {
    // Variables declarations

    /* Factory methods to create unique card models */
    Card brokenMirror(){
        return new Card(10, "Mirroir Cassé de Tyladanlos", CardType.MagicItem,
                true, "Echangez vos cartes en main avec celles d'un autre joueur!");
    }

    Card trollGnole(){
        return new Card(11, "Gnôle de troll", CardType.MagicItem,
                true, "Récupérez jusqu'à 5 coeurs perdus!");
    }

    Card tepulaCape(){
        return new Card(12, "Cape de Tépyla", CardType.MagicItem,
                true, "Défaussez une baston que vous venez de jouer!");
    }

    Card kipikDagger(){
        return new Card(13, "Dague de Kipik", CardType.MagicItem,
                true, "Ajoutez un dés vert pour jouer une baston!");
    }

    Card superMace(){
        return new Card(14, "Super Massue", CardType.MagicItem,
                true, "Réussisez automatiquement un dé vert!");
    }

    Card superDeathMace(){
        return new Card(15, "Super Massue de la Mort", CardType.MagicItem,
                true, "Réussisez automatiquement un dé jaune!");
    }

    Card ultraDeathMace(){
        return new Card(16, "Super Massue de la Mort qui Tue", CardType.MagicItem,
                true, "Réussisez automatiquement un dé rouge!");
    }

    Card rogueTools(){
        return new Card(17, "Outils de Rôdeur", CardType.MagicItem,
                true, "Ajoutez un dé vert pour jouer un piège!");
    }

    Card tadubolNeckless(){
        return new Card(18, "Amulette de Tadubol", CardType.MagicItem,
                true, "Défaussez un piège!");
    }

    Card findBackStick(){
        return new Card(19, "Baguette Retrouve-tout", CardType.MagicItem,
                true, "Récupérez la dernière carte défaussé!");
    }

    Card chickenGoldenEggs(){
        return new Card(20, "Oeufs dorés de la poulette", CardType.MagicItem,
                true, "Après que quelqu'un ait réussi" +
                " un défi 'chope la poulette!', placez cette carte dans vos gains!");
    }
}
