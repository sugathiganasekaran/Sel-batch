package week3.day3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Intersection {

	public static void main(String[] args) {
		
		List list1=new ArrayList();
		List list2=new ArrayList();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
	
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
	
		Collections.sort(list1);
		System.out.println(list1);
		Collections.sort(list2);;
	System.out.println(list2);
	list1.retainAll(list2);
	System.out.println(list1);
	
	
	}
	
	
	
	
}