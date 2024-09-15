public class bp3{
	public static void main(String[] a){
			int increaseMe=6;
			int decreaseMe=10;
			int newIncrease=increaseMe;
			increaseMe+=decreaseMe;
			decreaseMe-=newIncrease;
			System.out.println("Final value of Increase Me: "+increaseMe);
			System.out.println("Final value of Decrease Me: "+decreaseMe);
	}
}