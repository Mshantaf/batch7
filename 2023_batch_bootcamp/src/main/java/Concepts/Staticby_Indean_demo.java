package Concepts;

 class emp{   // Create another class inside the main class and defined all variables without values   
	 static int eid;
	static int salry;
	// String ceo;// using non static variable==>it well print the values in the main class(demo)
	static String ceo; // using non static variable==>it well print only one values in the main class(demo)
	
	public static void pri() { // creating method or function and call it from main class
		System.out.println(eid  + " ,  " + salry + " ,  " +ceo);
	}
	
	static { // static block
		
		ceo="larry";
		System.out.println("static");
	}
//	public emp(){  // creating contractor block (it has to be inside the sub-class)
//		eid=5;
//		salry= 9;
//		//ceo="hana"; // its not-useful because it well use the static(line 7) 
//		System.out.println("contractor");
//	}
}



public class Staticby_Indean_demo {

	public static void main(String[] args) {
		
		emp navin=new emp();
		navin.eid=10;
		navin.salry=4000;
//		navin.ceo="aaa";
		
		emp asma = new emp();
		asma.eid=8;
		asma.salry=5000;
//		asma.ceo="kkk";
		
		//asma.ceo="SSS"; // static variable called from the sup-class
		//emp.ceo="SSS"; // static variable called from the sup-class,and because its Static we can call the class (we dont need object}
		emp.pri(); 
		emp.pri();
	}

}
