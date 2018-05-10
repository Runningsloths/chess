import java.util.ArrayList;
public class King implements Piece{
	int row, col;
	boolean alive;
	public King(int row, int col){
		this.row = row;
		this.col = col;
		alive = false;
	}
	public ArrayList<Position> moves(){
		Game game = new Game();
		Piece[][] board = game.board;
		ArrayList<Position> moves = new ArrayList<Position>();
		if(row > 0 && board[row-1][col] == null)//Top mid
			moves.add(board[row-1][col]);
		if(col > 0 && board[row][col-1] == null)//Mid left
			moves.add(board[row][col-1]);
		if(row < 8 && board[row+1][col] == null)//Bottom mid
			moves.add(board[row+1][col]);
		if(col < 8 && board[row][col+1] == null)//Mid right
			moves.add(board[row][col+1]);
		if(row > 0 && col > 0 && board[row-1][col-1] == null)//Top left
			moves.add(board[row-1][col-1]);
		if(row > 0 && col > 0 && board[row-1][col+1] == null)//Top right
			moves.add(board[row-1][col+1]);
		if(row < 8 && col > 0 && board[row+1][col-1] == null)//Bottom left
			moves.add(board[row+1][col-1]);
		if(row < 8 && col < 8 && board[row+1][col-1] == null)//Bottom right
			moves.add(board[row+1][col-1]);
	}
	public Position getPos(){
		return new Position(row, col);
	}
	public boolean isAlive(){
		return alive;
	}
	public int getID()
	{return 99;}
}
