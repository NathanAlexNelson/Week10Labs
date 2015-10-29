import java.util.Scanner;



public class GuessANumber {
	public static void main(String[] args) {
		
		int high;
		int print;
		int print2;
		int print3;
		int RanNum;
		int lo;
		int hi;
		
		Scanner input = new Scanner(System.in);

		System.out.println("What is your upper bound for your first roll?");
		high = input.nextInt();
		System.out.println("What is your lower bound for your third roll?");
		lo = input.nextInt();
		System.out.println("What is your upper bound for your third roll?");
		hi = input.nextInt();
		
		RandomNumber Limit = new RandomNumber();
		
		
			RandomNumber diceRoll = new RandomNumber();
			
			RanNum = diceRoll.GetANumber(high);
			print = Limit.GetANumber(high);
			System.out.println(print);
			
			RanNum = diceRoll.GetANumber();
			print2 = Limit.GetANumber();
			System.out.println(print2);
			
			RanNum = diceRoll.GetANumber(lo, hi);
			print3 = Limit.GetANumber(lo, hi);
			System.out.println(print3);
		}
	}