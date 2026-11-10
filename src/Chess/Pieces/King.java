package Chess.Pieces;

import Chess.Cell;
import Chess.Color;

public class King extends Piece{
    public King(Color color){
        super(PieceType.KING, color);
    }
    public Boolean move(Cell from, Cell to) {
        //if possible
        return true;
    }
}
