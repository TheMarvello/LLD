package Chess;

import Chess.Pieces.Piece;

public class Cell {
    Boolean isEmpty;
    Piece piece;
    Position pos;

    public Cell() {
        isEmpty=true;
    }
    public Cell(Piece piece) {
        isEmpty = false;
        this.piece = piece;
    }
    public void addPiece(Piece piece) {
        if(!isEmpty) {
            System.out.println("Cell already occupied!!");
            return;
        }
        isEmpty = false;
        this.piece = piece;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void removePiece() {
        piece = null;
        isEmpty = true;
    }
    public void move(Cell to){
        Cell from = this;
        if(from.isEmpty()){
            System.out.println("From cell is empty!!");
            return;
        }
        Piece piece = from.piece;
        Boolean isPossible = from.piece.move(from, to);
        if(isPossible) {
            from.removePiece();
            if(!to.isEmpty()) {
                System.out.println("Piece captured on Position: "+pos.X+", "+pos.Y);
                to.removePiece();
            }
            to.addPiece(piece);
        } else {
            System.out.println("Move not possible");
            return;
        }
    }
}
