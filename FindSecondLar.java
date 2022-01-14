package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list1=new ArrayList();
list1.add(3);
list1.add(2);
list1.add(11);
	list1.add(4);
	list1.add(6);
	list1.add(7);

	Collections.sort(list1);
	System.out.println(list1);
	
	List<Integer> list3 = new ArrayList<Integer>(list1);
	int size=list3.size();
	System.out.println(list3.get(size-2));

	
	}

}
