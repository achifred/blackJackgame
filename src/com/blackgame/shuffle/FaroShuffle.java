package com.blackgame.shuffle;

import com.blackgame.cards.Card;
import com.blackgame.interfaces.ShuffleDeck;

import java.util.List;

public class FaroShuffle implements ShuffleDeck {
    @Override
    public void shuffleCardDeck(List<Card> cards) {
        int halfOfDeckLength = cards.size()/2;
        //TODO complete implementation of faro shuffle;
    }
}
