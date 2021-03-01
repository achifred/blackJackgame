package com.blackgame.cards;

import com.blackgame.enums.CardName;
import com.blackgame.enums.Suit;
import com.blackgame.interfaces.ShuffleDeck;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private ShuffleDeck shuffleDeckAlgo;
    public List<Card>deckOfCards = new ArrayList<>();
    public CardDeck(){
        for(CardName cardName:CardName.values()){
            for(Suit suit:Suit.values()){
                deckOfCards.add(new Card(suit,cardName));
            }
        }
    }
    public void shuffleDeckAlgorithm(ShuffleDeck shuffleDeckAlgo){
        this.shuffleDeckAlgo=shuffleDeckAlgo;
    }

    public Card getACard(){
        return deckOfCards.size()>0?deckOfCards.remove(0):null;
    }

}
