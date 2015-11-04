public class RandomNumber
{
	private int LowNum;
	private int HighNum;
/*	
	public int GetANumber(int high2)
	{
		
		int randomNumber = 0 + (int) (Math.random() * high2);
		return randomNumber;
	}
	*/
	public int GetANumber()
	{
		
		int randomNumber = 0 + (int) (Math.random() * 10);
		return randomNumber;
	}
/*	public int GetANumber(int lo, int hi)
	{
		
		int randomNumber = lo + (int) (Math.random() * (hi - lo));
		return randomNumber;		
	}
	

	
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
	
	public int GetANumberSec()
	{
	
		int randomNumber = GetLowNumber() + (int) (Math.random() * GetHighNumber());
		return randomNumber;
	} */
	
	/*
	Lab 5 Begin
	
	public RandomNumber (int high)
	{
		HighNum = high;
	}
	public void setHighNum (int high)
	{
		HighNum = high;
	}
	public int getHighNum()
	{
		return HighNum;
	}
	
	// Lab 5 End
	*/
	
	public RandomNumber (int lo, int hi)
	{
		LowNum = lo;
		HighNum = hi;		
	}
	
	public int getLowNum ()
	{
		return LowNum;
	}

	public int getHighNum ()
	{
		return HighNum;
	}
	
	public int GetANumber(int lo,int hi)
	{
		int RandomNumber= LowNum + (int) (Math.random()*(HighNum - LowNum+1));
		return RandomNumber;
	}

	
 }