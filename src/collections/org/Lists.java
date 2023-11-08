package collections.org;

import java.util.*;
import java.util.function.Predicate;

public class Lists {
	 static List l=new ArrayList<>();
	 static List l2=new LinkedList<>();
	 public void linearSearch(List l22) {
		 int count=0;
		 for(int i=0; i<l22.size();i++) {
	        	
	        	if(l22.get(i).equals(23))
	        	{
	        		
	        	System.out.println(i);
	        	}
	      count++;  }
	        System.out.println(l22);
		}
		// 
	
	
	public static void main(String[] args) {
		l.add("arvind");
		l.add(23);
		
		l2.add("madddy");
		l2.add(24);
		l2.add("civil");
		l2.addAll(l);
		System.out.println(l2.get(0));
		Lists l1=new Lists();
		l1.linearSearch(l2);
		

		
//		Predicate<String> condition = str -> str.startsWith("a");
//        try {
//		System.out.println(l2.removeIf(condition));}
//        catch (Exception e) {
//			// TODO: handle exception
//        	System.out.println("enna elavu da idu");
//		
//		}
//        
}}
