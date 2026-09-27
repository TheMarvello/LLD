package SnakeAndLadderGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    int id;
    String name;
    List<Integer> position;
    Player(int id, String name){
        this.id = id;
        this.name = name;
        this.position = new ArrayList<Integer>(List.of(0,0));
    }
    public void updatePosition(int x, int y){
        this.position.set(0, x);
        this.position.set(1, y);
    }
    public int rollDice(){
        return (int)(Math.random() * 6) + 1;
    }
    public List<Integer> getPosition(){
        return this.position;
    }
    public String getName() {
        return this.name;
    }
    public void move(int diceValue, int row, int col){
        // Implementation for moving the player based on dice value
        int curPos = this.position.get(0)*col + this.position.get(1);
        int newPos = curPos + diceValue;
        int newX = (newPos)%col;
        int newY = (newPos)/col;
        this.updatePosition(newX, newY);
    }
}
