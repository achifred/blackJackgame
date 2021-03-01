package com.blackgame.cards;

import com.blackgame.enums.CardName;

import java.util.HashMap;
import java.util.Map;

public class MapCardToValue {
    public static Map<CardName,Integer>mapCardTovalue = new HashMap<>();
    public static void setCardToValue(){
        mapCardTovalue.put(CardName.TWO,2);
        mapCardTovalue.put(CardName.THREE,3);
        mapCardTovalue.put(CardName.FOUR,4);
        mapCardTovalue.put(CardName.FIVE,5);
        mapCardTovalue.put(CardName.SIX,6);
        mapCardTovalue.put(CardName.SEVEN,7);
        mapCardTovalue.put(CardName.EIGHT,8);
        mapCardTovalue.put(CardName.NINE,9);
        mapCardTovalue.put(CardName.TEN,10);
        mapCardTovalue.put(CardName.JACK,10);
        mapCardTovalue.put(CardName.QUEEN,10);
        mapCardTovalue.put(CardName.KING,10);
        mapCardTovalue.put(CardName.ACE,11);
    }
}
