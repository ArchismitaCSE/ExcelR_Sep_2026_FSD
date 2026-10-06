/*percentage>=75 DIST
 * percentage>=60 First Class
 * percentage>=50 Second Class
 * percentage>=40 Pass Class
 * Percentage<40 Not Pass
 */
package day2;
import java.util.Scanner;
public class NestedIfElse {
	public static void main(String[]Args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");
		
		double percentage=sc.nextDouble();
		
		if(percentage>=75.0)
		{
			System.out.println("DIST");
		}
		else if(percentage>=60)
		{
			System.out.println("First Class");
		}
		else if(percentage>=50)
		{
			System.out.println("Second Class");
		}
		else if(percentage>=40)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Not Pass");
		}
		System.out.println("Thank you");
	}
}
