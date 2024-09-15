import java.util.*;
public class pq5{
	public static void main(String[] args){
			int n;
			Scanner sc=new Scanner(System.in);
			int pos=0,neg=0,z=0;
			char ans='y';
			System.out.println("Enter numbers: ");
			while (ans!='n'){
				n=sc.nextInt();
				if(n>0)
					pos++;
				else if(n==0)
					z++;
				else if(n<0)
					neg++;
				System.out.print("Do you wish to continue(y/n): ");
				ans=sc.next().charAt(0);
			}
			System.out.print("Positive numbers: "+pos+" Zeroes: "+z+" Negative numbers: "+neg);
	}	
}