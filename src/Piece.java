public abstract class Piece {
    private boolean isAlive;
    Player player;

    public Piece(Player player) {
        this.player=player;
    }

    abstract boolean isMoveValid(int x1, int y1, int x2, int y2);

}
