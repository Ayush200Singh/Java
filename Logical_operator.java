package corejava;
// code written by Ayush Singh
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		//creating scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value :");
		int num1 = sc.nextInt();
		System.out.println("Enter second value :");
		int num2 = sc.nextInt();
		System.out.println("Enter third value :");
		int num3 = sc.nextInt();
		System.out.println("Performing OR operator");
//using logical AND to verify two constraints
		if((num1<num2)||(num2==num3))
		{
			int sum = num1+num2+num3;
			System.out.println("the sum is :"+sum);
		}
		else {
			System.out.println("false condition");
		}
		
		System.out.println("PerformingAND operation");
		//using logical AND to verify two constraints
		if((num1<num2)&&(num2==num3))
		{
			int sum=num1+num2+num3;
			System.out.println("the sum is:"+sum);
		}
		else {
			System.out.println("false condition");
			}
		
			System.out.println("performing NOT operation");
		// Performing NOT operator
		System.out.println("!(num1<num2)=" +!(num1<num2));
		System.out.println("!(num2<num3)=" +!(num2<num3));
		
	}
}
	
