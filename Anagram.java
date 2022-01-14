package week3.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t1 = "stops";
		
		String t2 = "potss"; 
		int length1=t1.length()-1;
		System.out.println(length1);
		int length2=t1.length()-1;
		System.out.println(length2);
		char[] ch=t1.toCharArray();
		char[] ch1=t2.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		Arrays.sort(ch1);
		System.out.println(ch1);
		
		System.out.println(t1.equalsIgnoreCase(t2));
		
	}}




