package Patterns;

public class StarExecution {

	public static void main(String[] args) {
		StarPattern pt1= new StarPattern();
		pt1.pattern1(5);
		System.out.println("new Pattern ");
		StarPattern pt2= new StarPattern();
		pt2.pattern2(5); 
		System.out.println("new Pattern ");
		StarPattern pt3= new StarPattern();
		pt3.square(5);
		System.out.println("new Pattern ");
		StarPattern pt4= new StarPattern();
		pt4.righttriangle(5);
		System.out.println("new Pattern ");
		StarPattern pt5= new StarPattern();
		pt5.reversepyramid(5);
		System.out.println("new Pattern ");
		StarPattern pt6= new StarPattern();
		pt6.pyramid(5);
		System.out.println("new Pattern ");
		StarPattern pt7= new StarPattern();
		pt7.rhombus(5);
	}
}
