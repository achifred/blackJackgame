package com.blackgame.player;

import com.blackgame.cards.Card;
import com.blackgame.enums.PlayerStatus;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private PlayerStatus playerStatus = PlayerStatus.HIT;
    private int playersScore =0;
    private List<Card>playersCard = new ArrayList<>();

    public Player(String name){
        this.name=name;
    }
    public PlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public int getPlayersScore() {
        return playersScore;
    }
    public void cardsHit(Card card){
    playersCard.add(card);
        this.playersScore+=card.getCardValue();
        this.setPlayerStatus();
    }
    public void setPlayerStatus(){
        playerStatus = (playersScore<17)?playerStatus:PlayerStatus.STICK;
        if(playersScore>21)
            playerStatus=PlayerStatus.GO_BURST;
    }



    public String getName() {
        return name;
    }
}
