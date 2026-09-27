package SnakeAndLadderGame;

import java.util.List;

public class Board {
    Cell cell;
    List<Snake> snakes;
    List<Ladder> ladders;

    Board(int row, int col) {
        this.cell = new Cell(row, col);
    }
    public void addSnakes(Snake snake) {
        this.snakes.add(snake);
    }
    public void addLadder(Ladder ladder) {
        this.ladders.add(ladder);
    }
    public List<Integer> getWinningPosition(){
        return List.of(cell.getRow(), cell.getCol());
    }
    public Cell getCell() {
        return cell;
    }
}
