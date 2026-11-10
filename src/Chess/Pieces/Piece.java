package Chess.Pieces;

import Chess.Cell;
import Chess.Color;

public abstract class Piece {
    PieceType type;
    Color color;
    public Piece(PieceType type, Color color) {
        this.type = type;
        this.color = color;
    }


    public abstract Boolean move(Cell from, Cell to);
}
