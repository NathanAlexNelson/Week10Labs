public class RandomNumber
{
	public int GetANumber(int high)
	{
		
		int randomNumber = 0 + (int) (Math.random() * high);
		return randomNumber;
	}
	public int GetANumber()
	{
		
		int randomNumber = 0 + (int) (Math.random() * 10);
		return randomNumber;
	}
	public int GetANumber(int lo, int hi)
	{
		
		int randomNumber = lo + (int) (Math.random() * hi);
		return randomNumber;		
	}
}