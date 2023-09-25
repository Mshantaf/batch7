package Concepts;

public class Overloading_ {

	public static void main(String[] args) {
		int sum1=  hi (5,6); 
		double sum2 =hi( 5.5,  6.2);
		System.out.println(sum2);
		System.out.println(sum1);
		MMM();
		
}
	
	public static int hi(int a, int b) {
		
		return a +b ;
		
	}
    public static double  hi(double a, double b) {
		
		return a +b ;
		
	}
    public static void MMM () {
		
		int A= 99;
		int B= 1;
		int sum3= A+B;
		System.out.println(sum3);
	}
	
	
	
	}