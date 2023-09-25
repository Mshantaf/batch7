

// 1- open sub class (empty class)
// 2- at the sub class create the variables 
// 3- at the sub class create the constructor and use the same sub class name start with public() {}
// 4- create any method as you want start with public void 
// 5- create and open main class
// 6- create the object 
// 7- add the methods which u create it .




package Concepts;

 class car{   //variables 
	String newcolor;
	String newSize;
	
	public car(String color, String Size) {  //constructor
		
		newcolor= color;
		newSize=Size;
	}
	public void show() { 
		
		System.out.println(" color is "  +newcolor +  ", "  +" size is " +newSize);
	}
}

public class car_constructor { 

	
	public static void main(String[] args) {
		car ob =new car ("red","suv");
		ob.show();
		
	}

}
