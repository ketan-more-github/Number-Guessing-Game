package numberguess;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class server {
	
		private static void getiterate(ArrayList<Integer> arr)
		{
			System.out.println();
			System.out.print(" Your Previous Choices Are :  ");
			arr.forEach(i -> {
				
				System.out.print(+i + " ");
				
			});
			System.out.println();
			
			
		}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("*********Welcome to number Gussing game********");
		System.out.println();
		System.out.println("We have selected a random number between 1 and 100.");
		System.out.println("See if you can guess it in 10 turns or fewer.");
		System.out.println("We'll tell you if your guess was too high or too low.");
		Random rn = new Random();
		Scanner sc  = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		final int ServerChoice = rn.nextInt(100);
		
		
		int chances = 10;
		
		while(chances!=0)
		{
			System.out.println();
			System.out.println("  <><><><><>Enter Your Choice<><><><><> ");
			int user_ch = sc.nextInt();
			
			if(user_ch==ServerChoice)
			{
				System.out.println("***********Congratulations You WON THE GAME***************");
				break;
			}
			else if(user_ch>=ServerChoice)
			{
				System.out.println(" ++++++Enterd Number is to large++++++++");
				ar.add(user_ch);
				chances--;
				getiterate(ar);
				continue;
				
			}
			else if(user_ch<=ServerChoice)
			{
				System.out.println("-----Enterd Number is to small--------");
				ar.add(user_ch);
				chances--;
				getiterate(ar);
				continue;
			}
			
			
		
			
		}
		
		 if(chances==0)
		{
			 System.out.println();
			System.out.println("You lost the game");
		}
		
		
	
	}
	
}
