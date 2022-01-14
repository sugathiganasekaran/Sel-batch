package week3.day3;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		//a) Convert the String to character array
		
		char[] ch=test.toCharArray();
		int length=ch.length;
		System.out.println(length);
	for(int i=0;i<length;i++) {
	if(Character.isLetter(ch[i]))
	letter++;
	else
	if(Character.isDigit(ch[i]))
	num++;
	else
	if(Character.isSpaceChar(ch[i]))
		space++;
	else
		specialChar++;
	
	}
	System.out.println("letter: " + letter);
	System.out.println("space: " + space);
	System.out.println("number: " + num);
	System.out.println("specialCharcter: " + specialChar);
	
	
	
	
	}
	
	
	

}
