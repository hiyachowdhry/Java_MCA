import java.util.Scanner;
public class paq4{
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		System.out.print("Hailstone sequence: ");
		while(n!=1){
			System.out.print(n+" ");
			if(n%2==0) //if even
				n=n/2;
			else
				n=3*n+1;
		}
		System.out.println(n);
	}
}