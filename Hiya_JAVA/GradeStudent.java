import java.util.*;
public class GradeStudent{
	public static double calGrade(double quizScore,double homeworkScore,double testScore){
		double grade=(((40*quizScore)/100)+((30*homeworkScore)/100)+((30*testScore)/100))*100;
		return grade;
	}
	
	public static void main(String[] args){
		double q,h,t,grade;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the quiz score: ");
		q=sc.nextDouble();
		System.out.print("Enter the quiz score: ");
		h=sc.nextDouble();
		System.out.print("Enter the test score: ");
		t=sc.nextDouble();
		grade=calGrade(q,h,t);
		System.out.println("The Grade is: "+grade);
	}
}