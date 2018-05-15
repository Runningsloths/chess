public interface Piece
{
	public ArrayList<Position> getMoves();
	public Position getPos();
	public void move(Position p);
	public boolean isAlive();
	public String getID();
	public boolean borW(); //0 = black; 1 = white
	public String toString();
	public void implementMove();
}

