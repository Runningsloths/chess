public class Pawn implements Piece{
	int Rows;
	int Cols;
	Pos pos;
	boolean alive;
	boolean c;
	int move;
	public Pawn(int x, int y, boolean color){
	  Rows = x;
	  Cols = y;
	  pos = new Pos(Rows, Cols);
	  alive = false;
	  c = color;
	  move = 0;
	}
	public void implementMove(){
		move++;
	}
	public ArrayList<Pos> getMoves(Piece[][] board){
		ArrayList<Pos> m = new ArrayList<Pos>();
		if(c){
			if(move == 0){
				if(board[pos.getX()-2][pos.getY()] == null){
					m.add(new Pos(pos.getX()-2, pos.getY()));
				}
			}
			if(pos.getX()-1<=0){
				if(board[pos.getX()-1][pos.getY()] == null){
					m.add(new Pos(pos.getX() - 1, pos.getY()));
				}
				if(pos.getY()-1<=0||pos.getY()+1<Cols){
					if(board[pos.getX()-1][pos.getY()+1] != null&&board[pos.getX()-1][pos.getY()+1].bOrW() != c){
						m.add(new Pos(pos.getX()-1, pos.getY()+1));
					}
					if(board[pos.getX()-1][pos.getY()-1] != null&&board[pos.getX()-1][pos.getY()-1].bOrW() != c){
						m.add(new Pos(pos.getX()-1, pos.getY()-1));
					}
				}
			}
		}
	}
	public int getID(){
		return 1;
	}
	public Pos getPos(){
		return pos;
	}
	public void move(Pos p){
		pos = p;
	}
	public boolean isAlive(){
		return alive;
	}
	public void setStatus(boolean s){
		alive = s;
	}
	public boolean bOrW(){
		return c;
	}
}

