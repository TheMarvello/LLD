package Chess.Pieces;

import Chess.Cell;
import Chess.Color;

public class Bishop extends Piece{
    public Bishop(Color color){
        super(PieceType.BISHOP, color);
    }
    public Boolean move(Cell from, Cell to) {
        //if possible
        return true;

    }
}
