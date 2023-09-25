package Concepts;

public class overriding_main {

	public static void main(String[] args) {
		
		
        M1();

		overriding_1 ob = new overriding_2();     // Inhered overriding_2 from overriding_1       overriding_2 extends overriding_1 
		ob.M1();
		
		
		
//		overriding_2 ob2 = new overriding_2();
//		ob2.M1();
	
		
	}
	public static  void M1(){
		
		System.out.println("seconed hi");
		
	}
}
