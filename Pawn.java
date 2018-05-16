public class Pawn implements Piece{
	Position pos;
	boolean alive;
	boolean c;
	int move;
	public Pawn(int x, int y, boolean color){
	  pos = new Position(x, y);
	  alive = false;
	  c = color;
	  move = 0;
	}
	public void implementMove(){
		move++;
	}
	public ArrayList<Position> getMoves(Piece[][] board){
		int Rows = board.length;
		int Cols = board[0].length;
		ArrayList<Position> m = new ArrayList<Position>();
		if(move == 0){
			if(board[pos.getX()-2][pos.getY()] == null){
				m.add(new Position(pos.getX()-2, pos.getY()));
			}
		}
		if(pos.getX()-1<=0){
			if(board[pos.getX()-1][pos.getY()] == null){
				m.add(new Position(pos.getX() - 1, pos.getY()));
			}
			if(pos.getY()-1<=0||pos.getY()+1<Cols){
				if(board[pos.getX()-1][pos.getY()+1] != null&&board[pos.getX()-1][pos.getY()+1].bOrW() != c){
					m.add(new Position(pos.getX()-1, pos.getY()+1));
				}
				if(board[pos.getX()-1][pos.getY()-1] != null&&board[pos.getX()-1][pos.getY()-1].bOrW() != c){
					m.add(new Position(pos.getX()-1, pos.getY()-1));
				}
			}
		}
	}
	public int getID(){
		return 1;
	}
	public Position getPos(){
		return pos;
	}
	public void move(Position p){
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
	public String toString(){
		return "Pawn";
	}
}

