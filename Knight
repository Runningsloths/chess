public class Knight()
{
	int rows;
	int cols;
	Position pos;
	boolean alive;
	boolean c;
	public Knight(int x, int y, boolean color)
	{
		rows = x;
	 	cols = y;
	 	pos = new Position(rows, cols);
	 	alive = true;
	 	c = color;
	}
	public String getID(){
		return "knight";
	}
	public Pos getPosition(){
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
	public ArrayList<Position> getMoves(Piece[][] board){
		ArrayList<Position> m = new ArrayList<Position>();
		
		int x = p.getX();
		int y = p.getY();
		
		if (x + 2 >= 0 && x + 2 < cols)
		{
			if (y + 1 >= 0 && y + 1 < rows)
			{
				if(board[x+2][y+1] == 0)
					moves.add(new Position(x + 2,y + 1));
			}
			if (y - 1 >= 0 && y - 1 < rows)
			{
				if(board[x+2][y-1] == 0)
					moves.add(new Position(x + 2,y - 1));
			}
		}
		if (x - 2 >= 0 && x - 2 < cols) 
		{
			if (y + 1 >= 0 && y + 1 < rows)
			{
				if(board[x-2][y+1] == 0)
					moves.add(new Position(x - 2,y + 1));
			}
			if (y - 1 >= 0 && y - 1 < rows)
			{
				if(board[x-2][y-1] == 0)
					moves.add(new Position(x - 2,y - 1));		
			}
		}
		if (x + 1 >= 0 && x + 1 < cols)
		{
			if (y + 2 >= 0 && y + 2 < rows)
			{
				if(board[x+1][y+2] == 0)
					moves.add(new Position(x + 1,y + 2));
			}
			if (y - 2 >= 0 && y - 2 < rows)
			{
				if(board[x+1][y-2] == 0)
					moves.add(new Position(x + 1,y - 2));
			}
		}
		if (x - 1 >= 0 && x - 1 < cols) 
		{
			if (y + 2 >= 0 && y + 2 < rows)
			{
				if(board[x-1][y+2] == 0)
					moves.add(new Position(x - 1,y + 2));
			}
			if (y - 2 >= 0 && y - 2 < rows)
			{
				if(board[x-1][y-2] == 0)
					moves.add(new Position(x - 1,y - 2));		
			}
		}
		return moves;
	}
}
