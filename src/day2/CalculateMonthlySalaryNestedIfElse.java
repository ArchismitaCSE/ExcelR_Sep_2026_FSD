/*percentage>=75,000 Excellent
 * percentage>=60 Very Good
 * percentage>=50 Good
 * percentage>=40 OK
 * Percentage<40 Not OK
 */
package day2;
import java.util.Scanner;
public class CalculateMonthlySalaryNestedIfElse {
	public static void main(String[]Args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary");
		
		double salary=sc.nextDouble();
		
		if(salary>=75000.0)
		{
			System.out.println("Excellent");
		}
		else if(salary>=60000.0)
		{
			System.out.println("Very Good");
		}
		else if(salary>=50000.0)
		{
			System.out.println("Good");
		}
		else if(salary>=25000)
		{
			System.out.println("OK");
		}
		else
		{
			System.out.println("Not OK");
		}
		System.out.println("Thank you");
	}
}
