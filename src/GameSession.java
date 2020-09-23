public class GameSession {
    Player a;
    Player b;
    ChessBoard chessBoard;
    public GameSession() {
        a = new Player("Smith");
        b = new Player("Jhon");
        chessBoard = ChessBuilder.build(a,b);
    }

    private void demo() {

        chessBoard.print();
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;

        try {
            chessBoard.move(x1, y1, x2, y2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        chessBoard.print();




    }

    public static void main(String[] args){
        GameSession session = new GameSession();
        session.demo();

    }


}
