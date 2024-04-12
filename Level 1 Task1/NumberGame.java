import java.util.Scanner;
import java.util.Random;

public class NumberGame{
	public static void main(String args[]){
		
		Random random = new Random();//create random object
		Scanner sc = new Scanner(System.in);//create scanner object
		
		int num =0;
		int user_num = 0;
		boolean Dec = true;
		int score = 0;
		
		while (Dec == true){
			
			System.out.println("You have 10 chances to guess the number!! ");
			num = random.nextInt(100);//limit the range of random numbers
			int count = -1;
			
			for(int i =0;i<10;i++){
				
				count = count+1;
				System.out.print("\nRound "+(i+1)+" : ");
				user_num = sc.nextInt();
				
				if (num == user_num){
					System.out.println("You guess the number correctly");
					break;
				}
				//if user enter number less than the generated number
				else if(user_num<num){
					System.out.println("Too Low!!");
					System.out.println("You had "+(10-(i+1))+" chances to try!");
					if (i<9){
						System.out.println("Please try again!!");
					}
				}
				//if user enter number greater than the generated number
				else if(user_num>num){
					System.out.println("Too High!!");
					System.out.println("You had "+(10-(i+1))+" chances to try!");
					if (i<9){
						System.out.println("Please try again!!");
					}
				}
			
			
			}
			//create the score
			
			int j = 10;
			score = (j-count)*10;
			System.out.println("You got "+score+" marks ");
			System.out.println("\n\nNeed to try again :[True/False]");
			Dec = sc.nextBoolean();
			if (Dec == false){
				System.out.println("Thank you");
			}
		}
		
	}
}