package Chess.Pieces;

import Chess.Cell;
import Chess.Color;

public class Knight extends Piece{
    public Knight(Color color){
        super(PieceType.KNIGHT, color);

    }
    public Boolean move(Cell from, Cell to) {
        //if possible
        return true;
    }
}
