package SnakeAndLadderGame;

import java.util.List;
import java.util.Scanner;

public class Game {
    Board board;
    List<Player> players;
    Game (Board board, List<Player> players) {
        this.board = board;
        this.players = players;
    }
    public void startGame(){
        while(!isGameOver()){
            for(Player player: players){
                System.out.println(player.getName() + "'s turn. Current position: " + player.getPosition());
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine(); // Wait for user input to roll the dice
                int diceValue = player.rollDice();
                player.move(diceValue, board.getCell().getRow(), board.getCell().getCol());
                System.out.println(player.getName() + " rolled a " + diceValue + ". New position: " + player.getPosition());
                //game logic here
                //if its a snake or ladder, move the player to the new position
                if(player.getPosition() == board.getWinningPosition()){
                    System.out.println(player.getName() + " has won the game!");
                    return;
                }
            }
        }
    }
    public boolean isGameOver(){
        for(Player player: players){
            if(player.getPosition() == board.getWinningPosition()){
                return true;
            }
        }
        return false;
    }
}
