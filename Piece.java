public interface Piece
{
	public ArrayList<Pos> getMoves();
	public Position getPos();
	public void move(Pos p);
	public boolean isAlive();
	public String getID();
}

