package com.blackgame.game;

import com.blackgame.cards.Card;
import com.blackgame.cards.CardDeck;
import com.blackgame.cards.MapCardToValue;
import com.blackgame.enums.PlayerStatus;
import com.blackgame.player.Player;
import com.blackgame.shuffle.RandomizedCardDeck;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private CardDeck cardDeck;
    private List<Player> players;

    public Game(){
        MapCardToValue.setCardToValue();
         this.cardDeck = new CardDeck();
         this.cardDeck.shuffleDeckAlgorithm(new RandomizedCardDeck());
         players = new ArrayList<>();
    }
    public void initializeGame(int numberOfPlayers){
        this.cardDeck.shuffleDeckAlgorithm(new RandomizedCardDeck());
        for (int i = 0; i <numberOfPlayers ; i++) {
            players.add(new Player(Integer.toString(i+1)));

        }
    }


    public void dealtCards(){
        for(Player player:players){
            System.out.println("player"+player.getName()+" is dealt: ");
            for (int i = 1; i <=2 ; i++) {
                Card card = cardDeck.getACard();
                System.out.println(card);
                player.cardsHit(card);
            }
        }
    }

    public void nextHit(){
        for (Player player:players){
            if (player.getPlayerStatus().equals(PlayerStatus.HIT)){
                Card card = cardDeck.getACard();
                System.out.println(card);
                player.cardsHit(card);
            }
        }
    }

    public Player findWinner(){
        Player gameWinner = null;
        int winnerScore =0;
        for (Player player:players){
            if(player.getPlayerStatus().equals(PlayerStatus.STICK) && (player.getPlayersScore()>winnerScore))
                gameWinner = player;
                winnerScore = player.getPlayersScore();

        }
        return gameWinner;
    }

    public Boolean isGameEnded(){
        for(Player player:players){
            if (player.getPlayerStatus().equals(PlayerStatus.HIT))
                return true;
        }
        return false;
    }

    public void startGame(int numberOfPlayers){
        Player gameWinner =null;
        initializeGame(numberOfPlayers);
        dealtCards();
        while(gameWinner==null){
            System.out.println();
            printGamersStatus();
            if(isGameEnded()){
                nextHit();
            }else{
                gameWinner =findWinner();
                System.out.println("Player"+gameWinner.getName()+" won the game "+gameWinner.getPlayersScore());
            }
        }


    }

    private void printGamersStatus() {
        for (Player player:players)
            System.out.println("Player"+player.getName()+" "+player.getPlayerStatus());
    }

}
