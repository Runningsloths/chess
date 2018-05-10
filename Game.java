import java.util.ArrayList;
public class Game
{
	public piece[][] board;
	public Game(){
		board = new Piece[8][8];
		for(int a = 0; a < 8; a++){
			for(int b = 0; b < 8; b++){
				board[a][b] = null;
			}
		}
	}
}
