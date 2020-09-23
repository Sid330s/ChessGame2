public class Spot {

    Piece piece;
    int x;
    int y;
    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Spot(int x,int y,Piece piece) {
        this.piece = piece;
        this.x=x;
        this.y=y;
    }


}
