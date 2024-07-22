package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList ob=new ArrayList();
     System.out.println("the zero of the arraylist"+"" +ob.size());
     ob.add(2)	;
     ob.add('a');
     ob.add(22.35);
     System.out.println("the elements of the array are"+ob);
     System.out.println("check the element is there or not" +ob.contains (22.35));
     System.out .println("the elements to be removed are" +ob.remove(0));
     System.out.println("the elements of the array are" + ob);
     ArrayList<String> ob1 =new ArrayList<String>();
     ob1.add("bangalore");
     ob1.add("mysore");
     ob1.add("hassan");
     System.out.println("the elements are"+ob1);
     Collections.sort(ob1);
     System.out.println("sorted is"+ob1);
     Iterator<String> i=ob1.iterator();
     while(i.hasNext()) {
    	String nm=i.next(); 
    	ob1.remove(0);
    	System.out.println(nm);
     }
     
	}
	
}

