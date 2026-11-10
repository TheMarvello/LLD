package Chess;

import Chess.Pieces.*;

public class Board {
    Cell[][] cells;

    Board() {
        initialize();
    }

    private void initialize() {
        cells = new Cell[8][8];
        //row 1(white) and row 6(black) will have pawns
        for(int i = 0; i<8; i++) {
            cells[1][i].addPiece(new Pawn(Color.WHITE));
            cells[6][i].addPiece(new Pawn(Color.BLACK));
        }
        //add rooks
        cells[0][0].addPiece(new Rook(Color.WHITE));
        cells[0][7].addPiece(new Rook(Color.WHITE));
        cells[7][0].addPiece(new Rook(Color.BLACK));
        cells[7][7].addPiece(new Rook(Color.BLACK));
        //add Kinghts
        cells[0][1].addPiece(new Knight(Color.WHITE));
        cells[0][6].addPiece(new Knight(Color.WHITE));
        cells[7][1].addPiece(new Knight(Color.BLACK));
        cells[7][6].addPiece(new Knight(Color.BLACK));
        //add Bishops
        cells[0][2].addPiece(new Bishop(Color.WHITE));
        cells[0][5].addPiece(new Bishop(Color.WHITE));
        cells[7][2].addPiece(new Bishop(Color.BLACK));
        cells[7][5].addPiece(new Bishop(Color.BLACK));
        //add Queen
        cells[0][3].addPiece(new Queen(Color.WHITE));
        cells[7][3].addPiece(new Queen(Color.BLACK));
        //add King
        cells[0][4].addPiece(new King(Color.WHITE));
        cells[7][4].addPiece(new King(Color.BLACK));
    }
    public void move(int from_row, int from_col, int to_row, int to_col) {
        cells[from_row][from_col].move(cells[to_row][to_col]);
    }
}
