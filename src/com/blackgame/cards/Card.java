package com.blackgame.cards;

import com.blackgame.enums.CardName;
import com.blackgame.enums.Suit;

public class Card {
    private Suit suit;
    private CardName cardName;
    private int cardValue;
    public Card(Suit suit,CardName cardName){
        this.suit = suit;
        this.cardName =cardName;
        this.cardValue=MapCardToValue.mapCardTovalue.get(cardName);
    }

    public Suit getSuit() {
        return suit;
    }

    public CardName getCardName() {
        return cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", cardName=" + cardName +
                ", cardValue=" + cardValue +
                '}';
    }
}
