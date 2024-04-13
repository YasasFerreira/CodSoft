import java.util.Scanner;

public class SGCApp{
	
	public static void Grade(double Avg){
		if(Avg >= 90 && Avg<=100){
			System.out.println("You got 'A+' grade!!");
		}
		else if(Avg>=75){
			System.out.println("You got 'A' grade!!");
		}
		else if(Avg >=60){
			System.out.println("You got 'B' grade!!");
		}
		else if(Avg >=45 ){
			System.out.println("You got 'C' grade!!");
		}
		else{
			System.out.println("You got 'E' grade!!");
		}
	}
	
	public static void main(String args[]){
		
		//StudentGradeCalculator SGC =new StudentGradeCalculator();
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter the number of subjects : ");
		int count = sc.nextInt();
		
		int sum = 0;
		int marks = 0;
		double average = 0;
		
		for (int i=0;i<count;i++){
			System.out.print("Enter the marks for subject "+(i+1)+" : ");
			marks = sc.nextInt();
			sum = sum+marks;
		}
		
		average =sum/count;
		System.out.println("The total marks : "+sum);
		System.out.println("The Average marks : "+average);
		Grade(average);
		System.out.print(count);
	}
}