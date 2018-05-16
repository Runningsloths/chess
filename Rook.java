public class Rook implements Piece{
	Position pos;
	boolean alive;
	boolean c;
	int move;
	public Rook(int x, int y, boolean color){
	  pos = new Position(x, y);
	  alive = false;
	  c = color;
	  move = 0;
	}
	public void implementMove(){
		move++;
	}
	public ArrayList<Position> getMoves(Piece[][] board){
  		boolean blocked = false;
		int Rows = board.length;
		int Cols = board[0].length;
		ArrayList<Position> m = new ArrayList<Position>();
  	  	int counterR = pos.getX()-1;
	    	int counterC = pos.getY();
		while(counterR>= 0&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
          			m.add(new Position(counterR, counterC));
      			}	
      			else{
     			     blocked = true;
      			}
    			counterR = counterR--;
    		}
    		counterR = pos.getX()+1;
    		while(counterR < Rows&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
          			m.add(new Position(counterR, counterC));
      			}
      			else{
     			     blocked = true;
      			}
      			counterR = counterR++;
    		}
    		counterR = pos.getX();
   		counterC = pos.getY()+1;
    		while(counterC<Cols&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
         			 m.add(new Position(counterR, counterC));
      			}
      			else{
          			blocked = true;
      			}
      			counterC = counterC++;
    		}
    		counterC = pos.getY()-1;
    		whilecounterC>=0&&!blocked){
      			if(board[counterR][counterC] == null||board[counterR][counterC].bOrW() == !c){
          			m.add(new Position(counterR, counterC));
      			}
      			else{
          			blocked = true;
      			}
      			counterC = counterC--;
    		}
	}
	public int getID(){
		return 5;
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
		return "Rook";
	}
}

