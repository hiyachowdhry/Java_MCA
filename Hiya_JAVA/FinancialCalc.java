import java.util.*;
import java.lang.Math;

public class FinancialCalc{
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		double P=sc.nextDouble();
		System.out.println("Enter the interest rate: ");
		double I=sc.nextDouble();
		System.out.println("Enter the number of years: ");
		int Y=sc.nextInt();
		double ans=computeFinalValue(P,I,Y);
		System.out.println(ans);
	}
	static double computeFinalValue(double principal, double interestRate, int numOfYears){
		double V;
		V=principal*(Math.pow(1+interestRate,numOfYears));
		return V;
	}
}