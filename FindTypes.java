package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		String s="#Amazon is the no1 ecommerce company#";
		int letter=0,space=0,number=0,specialChar=0;//initialized the variables count to 0 
		char[] array=s.toCharArray();                //converting string to array
		for(int i=0;i<array.length;i++)  //loop to start the count of variables starting 
			                            //loop count  starts with  0 until arraylength       
		{ if(Character.isLetter(array[i]))    //count for letters in the string        
		{letter++;}
		else if(Character.isDigit(array[i]))//count for digits in the string 
		{number++;}
		else if(Character.isSpaceChar(array[i]))//count for spaces between the string 
		{space++;}
		else
		{specialChar++;}
		
		}//print the final count of variables 
		System.out.println("The number of letters are "+letter);
		System.out.println("the number of spaces are "+space++);
		System.out.println("the number of numbers are "+number);
		System.out.println("the number of special characters are "+specialChar);
		
		}
	
		
	}


