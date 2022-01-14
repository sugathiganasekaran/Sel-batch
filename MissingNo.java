package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNo {

	public static void main(String[] args) {
		List list1=new ArrayList();
		List list2=new ArrayList();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	list1.add(7);
	list1.add(6);
	list1.add(8);
	Collections.sort(list1);
	System.out.println(list1);
for(int i=1;i<=8;i++)
	list2.add(i);
	list2.remove(list1);
	System.out.println("The missing no:" +list2);
	
	}

}
