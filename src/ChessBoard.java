public class ChessBoard {
    private Spot[][] matrix;
    private Player playerA;
    private Player playerB;


    public ChessBoard(Player a, Player b) {
        matrix=new Spot[8][8];
        playerA = a;
        playerB = b;
    }


    public Piece getPiece(int x,int y){
        //System.out.println("x = " + x);
        //System.out.println("y = " + y);
        if(matrix[x][y]==null) return null;
        return matrix[x][y].getPiece();
    }

    public void setPiece(int x,int y,Piece piece){

        matrix[x][y] = new Spot(x,y,piece);
        return  ;
    }

    public void move(int x1,int y1,int x2, int y2) throws Exception {
        if(getPiece(x1,y1)==null)
            throw new Exception("Selected Blank Square!!!");
        if(!matrix[x1][y1].getPiece().isMoveValid(x1, y1, x2, y2))
            throw new Exception("Selected Blank Square!!!");

        setPiece(x2,y2,getPiece(x1,y1));
        setPiece(x1,y1,null);

    }

    public void print() {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                Piece piece = getPiece(i, j);
                if(piece==null) System.out.print("0 ");
                else System.out.print(piece.getClass().getName().substring(0,1)+" ");
            }
            System.out.println();
        }
    }
}
