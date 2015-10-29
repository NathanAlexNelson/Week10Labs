public class RandomNumber
{
	public int GetANumber(int high)
	{
		
		int randomNumber = 0 + (int) (Math.random() * high);
		return randomNumber;
	}
	public int GetANumberOrig()
	{
		
		int randomNumber = 0 + (int) (Math.random() * 10);
		return randomNumber;
	}
	public int GetANumber(int lo, int hi)
	{
		
		int randomNumber = lo + (int) (Math.random() * (hi - lo));
		return randomNumber;		
	}
	
	private int LowNum;
	private int HighNum;
	
	public void SetLowNumber(int Low)
	{
		LowNum = Low;
		
	}
	public void SetHighNumber(int High)
	{
		HighNum = High;
		
	}
	
	public int GetLowNumber()
	{
		return LowNum;
	}
	
	public int GetHighNumber()
	{
		return HighNum;
	}
	
	public int GetANumber()
	{
	
		int randomNumber = GetLowNumber() + (int) (Math.random() * GetHighNumber());
		return randomNumber;
	}
}