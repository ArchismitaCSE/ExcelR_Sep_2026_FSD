package day2;
import java.util.Scanner;
public class AdditionOfTwoAges {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter age of person1");
		int age1 =sc.nextInt();
		System.out.println("Please enter age of person2");
		int age2 =sc.nextInt();
		
		int sumAge=age1+age2;
		System.out.println("The sum of age is"+ sumAge);
	}
}
