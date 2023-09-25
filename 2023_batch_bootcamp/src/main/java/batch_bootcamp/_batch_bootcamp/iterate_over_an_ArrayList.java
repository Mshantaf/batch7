package batch_bootcamp._batch_bootcamp;

import java.util.ArrayList;
import java.util.Iterator;

public class iterate_over_an_ArrayList {


		public static void main(String[] args) {
			ArrayList<String> names=new ArrayList();
			names.add("kkk");
			names.add("ccc");
			names.add("ddd");
			
//			int size = names.size(); 
//	        for (int i = 0; i < size; i++) {
//	            String name = names.get(i); 
//	            System.out.println(name);
//	        }
			
			for (String name: names){
			System.out.println(name);
			}
			

}}

