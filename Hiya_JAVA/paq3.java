import java.util.Scanner;
public class paq3{
	public static void main(String[] args){
		boolean firstStarted;
		int played1,played2;
		int winner=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter score of player 1: ");
		played1=sc.nextInt();
		System.out.print("Enter score of player 2: ");
		played2=sc.nextInt();
		System.out.print("Did player 1 play first?(true/false): ");
		firstStarted=sc.nextBoolean();
		if (played1>played2)
			winner=1;
		else if(played1<played2)
			winner=2;
		else if(played1==played2){
			if(firstStarted==true)
				winner=2;
			else
				winner=1;
		}
		System.out.println("Winner: "+winner);
	}
}