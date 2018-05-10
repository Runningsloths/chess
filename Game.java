import java.util.ArrayList;
public class Game
{
	public static final BOARD_LENGTH = 8;
	public piece[][] board;
	public Game(){
		board = new Piece[BOARD_LENGTH][BOARD_LENGTH];
		for(int a = 0; a < BOARD_LENGTH; a++){
			for(int b = 0; b < BOARD_LENGTH; b++){
				board[a][b] = null;
			}
		}
	}
}
