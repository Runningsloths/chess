public class Bishop implements Piece{
	int Rows;
	int Cols;
	Position pos;
	boolean alive;
	boolean c;
	int move;
	public Pawn(int x, int y, boolean color){
	  Rows = x;
	  Cols = y;
	  pos = new Position(Rows, Cols);
	  alive = false;
	  c = color;
	  move = 0;
	}
	public void implementMove(){
		move++;
	}
	public ArrayList<Position> getMoves(Piece[][] board){
  		boolean blocked = false;
		ArrayList<Position> m = new ArrayList<Position>();
  	  	int counterR = pos.getX()-1;
	    	int counterC = pos.getY()-1;
		while(counterR>= 0&&counterC>=0&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
          			m.add(new Position(counterR, counterC));
      			}	
      			else{
     			     blocked = true;
      			}
    			counterR = counterR--;
      			counterC = counterC--;
    		}
    		counterR = pos.getX()-1;
    		counterC = pos.getY()+1;
    		while(counterR >= 0&&counterC<Cols&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
          			m.add(new Position(counterR, counterC));
      			}
      			else{
     			     blocked = true;
      			}
      			counterR = counterR--;
      			counterC = counterC++;
    		}
    		counterR = pos.getX()+1;
   		counterC = pos.getY()+1;
    		while(counterR < Rows&&counterC<Cols&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
         			 m.add(new Position(counterR, counterC));
      			}
      			else{
          			blocked = true;
      			}
      			counterR = counterR++;
      			counterC = counterC++;
    		}
    		counterR = pos.getX()+1;
    		counterC = pos.getY()-1;
    		while(counterR < Rows&&counterC>=0&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
          			m.add(new Position(counterR, counterC));
      			}
      			else{
          			blocked = true;
      			}
      			counterR = counterR++;
      			counterC = counterC--;
    		}
	}
	public int getID(){
		return 4;
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
		return "Bishop";
	}
}

