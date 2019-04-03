package com.frigg0.orcquest.services.deckService;

import com.frigg0.orcquest.models.cards.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckService {
    // Variables instantiations
    @Autowired
    CaptureCardService captureCardService;
    @Autowired
    TrapCardService trapCardService;
    @Autowired
    MagicItemService magicItemService;
    @Autowired
    TreasureCardService treasureCardService;

    // Constructing the deck with all cards
    /*public List<Card> constructingStartingDeck(){
        List<Card> deckList = new ArrayList<>();


    } */

    // Populating the deck with the capture cards
    private List<Card> constructingCaptureCards(List<Card> deckList){
        // adding the different cards
        deckList.add(captureCardService.chopeLaPoulette());
        deckList.add(captureCardService.chopeLaPoulette());
        deckList.add(captureCardService.chopeLaBiquette());
        deckList.add(captureCardService.chopeLaVachette());
        deckList.add(captureCardService.chopeLaPrincesse());

        return deckList;
    }

    // Populating the deck with the trap cards
    private List<Card> constructingTrapCards(List<Card> deckList){
        // adding the different cards
        deckList.add(trapCardService.machoires());
        deckList.add(trapCardService.machoires());
        deckList.add(trapCardService.machoires());
        deckList.add(trapCardService.pointes());
        deckList.add(trapCardService.pointes());
        deckList.add(trapCardService.cage());
        deckList.add(trapCardService.pendule());
        deckList.add(trapCardService.bouleGeante());

        return deckList;
    }

    // Populating the deck with the magic item cards
    private List<Card> constructingMagicItemCards(List<Card> deckList){
        // adding the different cards
        deckList.add(magicItemService.chickenGoldenEggs());
        deckList.add(magicItemService.findBackStick());
        deckList.add(magicItemService.findBackStick());
        deckList.add(magicItemService.tadubolNeckless());
        deckList.add(magicItemService.tadubolNeckless());
        deckList.add(magicItemService.rogueTools());
        deckList.add(magicItemService.rogueTools());
        deckList.add(magicItemService.ultraDeathMace());
        deckList.add(magicItemService.superDeathMace());
        deckList.add(magicItemService.superMace());
        deckList.add(magicItemService.kipikDagger());
        deckList.add(magicItemService.kipikDagger());
        deckList.add(magicItemService.tepulaCape());
        deckList.add(magicItemService.tepulaCape());
        deckList.add(magicItemService.trollGnole());
        deckList.add(magicItemService.trollGnole());
        deckList.add(magicItemService.brokenMirror());

        return deckList;
    }

    // Populating the deck with the treasure cards
    private List<Card> constructingTreasureCards(List<Card> deckList){
        // adding the different cards
        deckList.add(treasureCardService.treasureChest());
        deckList.add(treasureCardService.goldenTooth());
        deckList.add(treasureCardService.painfulPurse());
        deckList.add(treasureCardService.stickySocks());
        deckList.add(treasureCardService.stickySocks());

        return deckList;
    }
}
