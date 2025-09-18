package chesslayer;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chesslayer.enums.Color;

public  abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount() {
        moveCount += 1;
    }
    public void decreaseMoveCount() {
        moveCount--;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position) {
            ChessPiece p = (ChessPiece) getBoard().piece(position);
            return p != null && p.getColor() != color;
    }
}
