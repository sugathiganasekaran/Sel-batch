package week3.day3;

public class ReverseEven {

	public static void main(String[] args) {
		String even="I am a software tester"; 
		 String arr[]=even.split(" ");
		 for(int i=0;i<arr.length;i++)
		 if(i%2==0)
		 {
			 System.out.println(arr[i]);
			 System.out.println(" ");
			 
		 }
		char reverse[]=even.toCharArray();
		
		for(int g=(reverse.length)-1;g>=0;g--) {
			System.out.println(reverse[g]);
		}
		System.out.println(" ");
		
		
		
		 
		 
		 
		 
}}