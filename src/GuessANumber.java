import java.util.Scanner;



public class GuessANumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int high2;
		int print;
		int print2;
		int print3;
		int RanNum;
		int Low;
		int High;
		int set;
		int hibound;
		int lobound;
		int LowNum;
		int HighNum;
		int randomNumber;
		int lo = 0;
		int hi = 0;
		int compRoll;
		
		
		
		
		
		
		
/*		System.out.println("What is your upper bound for your first roll?");
		high2 = input.nextInt();
		
		System.out.println("What is your lower bound for your second roll?");
		Low = input.nextInt();
		
		System.out.println("What is your upper bound for your second roll?");
		High = input.nextInt();
		

		Limit.SetLowNumber(Low);
		Limit.SetHighNumber(High);
		
		System.out.println("What is your lower bound for your third roll?");
		lo = input.nextInt();
		System.out.println("What is your upper bound for your third roll?");
		hi = input.nextInt();
		
		
		
			RandomNumber diceRoll = new RandomNumber();
			
			RanNum = diceRoll.GetANumber(high);
			print = Limit.GetANumber(high);
			System.out.println(print);
			
			RanNum = diceRoll.GetANumber();
			print2 = Limit.GetANumber();
			System.out.println(print2);
			
			RanNum = diceRoll.GetANumber(lo, hi);
			print3 = Limit.GetANumber(lo, hi);
			System.out.println(print3);*/
						
			System.out.println("Please pick the lowest number you can roll.");
			lo=input.nextInt();
			System.out.println("Please pick the highest number you can roll.");
			hi=input.nextInt();
			
			RandomNumber RandomNumberroll = new RandomNumber(lo, hi);
			compRoll = RandomNumberroll.GetANumber();

			
			System.out.println(lo);
			System.out.println(hi);
			System.out.println(compRoll);
		}
	}