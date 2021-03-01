package com.blackgame.shuffle;

import com.blackgame.cards.Card;
import com.blackgame.interfaces.ShuffleDeck;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomizedCardDeck implements ShuffleDeck {
    @Override
    public void shuffleCardDeck(List<Card> cards) {
        Collections.shuffle(cards,new Random());
    }
}
