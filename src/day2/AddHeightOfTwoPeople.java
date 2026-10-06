package day2;
import java.util.Scanner;
public class AddHeightOfTwoPeople {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter height of person1");
		double height1 = sc.nextDouble();
		System.out.println("Please enter height of person2");
		double height2 = sc.nextDouble();
		
		double sumHeight = height1+height2;
		System.out.println("The Sum of Height is"+ sumHeight);
		
	}
}
