package day2;
import java.util.Scanner;
public class CheckAdultOrMinor {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		
		int Age=sc.nextInt();
		if(Age>=18)
		{
			System.out.println("You are an Adult");
		}
		else
		{
			System.out.println("You are a Minor");
		}
		System.out.println("Thankyou");
	}
}
