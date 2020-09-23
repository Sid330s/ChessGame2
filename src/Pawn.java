public class Pawn extends Piece {
    public Pawn(Player a) {
        super(a);
        this.player=a;
    }


    boolean isMoveValid(int x1, int y1, int x2, int y2){
        return true;
    }
}
