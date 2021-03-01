import com.blackgame.game.Game;

import java.util.Scanner;

public class Main {
    private static int numberOfPlayers=0;
    public static void setNumber(int num){
        if(num>1 && num<=6){
            numberOfPlayers=num;
        }else{
            System.out.println("Only 2 tp 6 players can play this game");
            numberOfPlayers=3;
        }



    }
    public static void main(String[] args) {
        System.out.println("Welcome to the game of Black jack");
        System.out.println("Enter number of players: ");

        Scanner scanner = new Scanner(System.in);
        setNumber(Integer.parseInt(scanner.nextLine()));

        Game game = new Game();
        game.startGame(numberOfPlayers);

    }
}
