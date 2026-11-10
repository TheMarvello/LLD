package Chess.Pieces;

import Chess.Cell;
import Chess.Color;

public class Pawn extends Piece{
    public Pawn(Color color){
        super(PieceType.PAWN, color);
    }
    public Boolean move(Cell from, Cell to) {
        //if possible
        return true;
    }
}
