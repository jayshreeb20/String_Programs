package stringfunctions;

import java.util.Arrays;

public class ContainsEndsWith {
	
	static int count_of_digit=0;
	static int count_of_alphabet=0;
	static int count_of_spaces=0;
	static int count_of_specialCharaters=0;
	
	public static void main(String[] args) 
	{	
		//String function Contains
		String name= "I am Jayshree";
		boolean answer= name.contains("Jay");
		System.out.println(answer);
		
		//String function endsWith
		String name1= "ojal";
		boolean answer1= name1.endsWith("al");
		System.out.println(answer1);
		
		//toCharArray
		String s1= "PRAVIN80 IS ON LEAVE FOR 20 DAYS *****!!!!!";
		char c1[]= s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		//System.out.println(c1[3]);
		
		//to check if the value is numeric on particular position
		//boolean d1= Character.isDigit(c1[6]); 
		//System.out.println(d1);
		
		//To find how many are numeric value present in a long string we make use of for loop
		
		for(int i=0;i<s1.length();i++)
		{
			boolean b1= Character.isDigit(c1[i]);
			//System.out.println(b1);
		
		if(b1==true)
		{
			count_of_digit++;
			
		}
		boolean b2= Character.isAlphabetic(c1[i]);
		
		if(b2==true)
		{
			count_of_alphabet++;
		}
		
		boolean b3= Character.isSpaceChar(c1[i]);
		
		if(b3==true)
		{
			count_of_spaces++;
		}
		
		if (!b1 && !b2 && !b3)
		{
			count_of_specialCharaters++;
		}
		
		}
		System.out.println("No of digits in give string are-->" + count_of_digit);
		System.out.println("No of alphabets in give string are-->" + count_of_alphabet);
		System.out.println("No of spaces in give string are-->" + count_of_spaces);
		System.out.println("No of spaces in give string are-->" + count_of_specialCharaters);
		
		
		
		
	}

	

}
