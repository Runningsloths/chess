public class Position
{
	private int x;
	private int y;
	public Position(int _x, int _y)
	{
		x = _x;
		y = _y;
	}
	public int getRow()
	{
		return x;
	}
	public int getCol()
	{
		return y;
	}
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
}
