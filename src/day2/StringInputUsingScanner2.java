package day2;
import java.util.Scanner;
public class StringInputUsingScanner2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		char ch=sc.next().charAt(0);
		
		System.out.println(ch);
	}
}
