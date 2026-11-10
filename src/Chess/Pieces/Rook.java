package Chess.Pieces;

import Chess.Cell;
import Chess.Color;

public class Rook extends Piece{
    public Rook(Color color){
        super(PieceType.ROOK, color);
    }
    public Boolean move(Cell from, Cell to) {
        //if possible
        return true;
    }
}
