package week3.day3;

public class CharOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
	int count=0;
	// convert the string into char array
	char[] cha=str.toCharArray();
	
				//get the length of the array
	int length=cha.length;
	
	
				// traverse from 0 till the array length 
					for(int i=0;i<length;i++)
					// Check the char array has the particular char in it 
				if(cha[i]=='n')
					// if is has increment the count
						count++;
					System.out.println(count);
					
					// print the count out of the loop
						
	
	
	
	
	}

}
