package boardgame;

public abstract class Piece {

    protected Position position;

    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }
    
    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        // metodo concreto que ultiliza o metodo abstrato : metodo que faz gancho com a subclasse
        // metodo que retorna matriz na linha e coluna que eu desejo;
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for(int i = 0 ; i < mat.length ; i++) {
            for(int j = 0; j < mat.length; j++) {
                if( mat[i][j] ) {
                    return true;
                }
            }
        }
        return false;
    }
}
