package Chess.Pieces;

import Chess.Cell;
import Chess.Color;

public class Queen extends Piece{
    public Queen(Color color){
        super(PieceType.QUEEN, color);
    }
    public Boolean move(Cell from, Cell to) {
        //if possible
        return true;
    }
}
