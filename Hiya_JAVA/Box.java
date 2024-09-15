public class Box{
	public static double Volume(double length,double breadth,double height){
		double vol;
		vol=length*breadth*height;
		return vol;
	}
	
	public static void main(String[] args){
		double v1,v2;
		Box b1=new Box();
		Box b2=new Box();
		v1=b1.Volume(12,2,3.2);
		v2=b2.Volume(2,3,4);
		System.out.println("The volume of box 1: "+v1);
		System.out.println("The volume of box 2: "+v2);
	}
}