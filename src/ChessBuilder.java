public class ChessBuilder {
    public static ChessBoard build(Player a, Player b){
        ChessBoard chessBoard = new ChessBoard(a,b);

        chessBoard.setPiece(0,0,new Rook(a));
        chessBoard.setPiece(0,1,new Knight(a));
        chessBoard.setPiece(0,2,new Bishop(a));
        chessBoard.setPiece(0,3,new King(a));
        chessBoard.setPiece(0,4,new Queen(a));
        chessBoard.setPiece(0,5,new Bishop(a));
        chessBoard.setPiece(0,6,new Knight(a));
        chessBoard.setPiece(0,7,new Rook(a));

        chessBoard.setPiece(1,0,new Pawn(a));
        chessBoard.setPiece(1,1,new Pawn(a));
        chessBoard.setPiece(1,2,new Pawn(a));
        chessBoard.setPiece(1,3,new Pawn(a));
        chessBoard.setPiece(1,4,new Pawn(a));
        chessBoard.setPiece(1,5,new Pawn(a));
        chessBoard.setPiece(1,6,new Pawn(a));
        chessBoard.setPiece(1,7,new Pawn(a));

        chessBoard.setPiece(6,0,new Pawn(b));
        chessBoard.setPiece(6,1,new Pawn(b));
        chessBoard.setPiece(6,2,new Pawn(b));
        chessBoard.setPiece(6,3,new Pawn(b));
        chessBoard.setPiece(6,4,new Pawn(b));
        chessBoard.setPiece(6,5,new Pawn(b));
        chessBoard.setPiece(6,6,new Pawn(b));
        chessBoard.setPiece(6,7,new Pawn(b));

        chessBoard.setPiece(7,0,new Rook(b));
        chessBoard.setPiece(7,1,new Knight(b));
        chessBoard.setPiece(7,2,new Bishop(b));
        chessBoard.setPiece(7,3,new King(b));
        chessBoard.setPiece(7,4,new Queen(b));
        chessBoard.setPiece(7,5,new Bishop(b));
        chessBoard.setPiece(7,6,new Knight(b));
        chessBoard.setPiece(7,7,new Rook(b));



        return chessBoard ;
    }

}
