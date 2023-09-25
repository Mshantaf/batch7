package batch_bootcamp._batch_bootcamp;

import java.util.ArrayList;

public class grades_of_the_student {

	public static void main(String[] args) {
		
		ArrayList <Integer>grades = new ArrayList();
		grades.add(95);
		grades.add(88);
		grades.add(70);
		grades.add(60);
		grades.add(10);
		
		
		//int size=grades.size();
//     int [] grades=new int [3];
//	 grades [0]=95	;
//	 grades [1]=88	;
//	 grades [2]=70	;
	
	for(int grade : grades) {
		
		if(grade>=90) {System.out.println(grade + " grade is" + ":" + " A");
		}
		else if (grade>=80) {System.out.println(grade+ " grade is" + ":"+ " B");
		}
		else {System.out.println(grade + " grade is" + ":" + " C");}
		
	}
		
//	int [] grades= {95,88,70,60};
//    for(int i=0;i<size;i++)	{
//	int grade=(int) grades.get(i);
//	if(grade>=90) {System.out.println(grade + " grade is" + ":" + " A");
//	}
//	else if (grade>=80) {System.out.println(grade+ " grade is" + ":"+ " B");
//	}
//	else {System.out.println(grade + " grade is" + ":" + " C");}
//	
	

}	
	
	}
	
