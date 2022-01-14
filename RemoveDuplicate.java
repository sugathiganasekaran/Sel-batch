package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";	
	
	String[] sss=text.split(" ");
	Set<String> dupname =new LinkedHashSet<String>();
for(String s: sss) {
	dupname.add(s);
}
System.out.println(dupname);
	}

}
