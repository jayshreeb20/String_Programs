package stringfunctions;

import java.util.Arrays;

public class Anagram_Function {

	public static void main(String[] args)
	{
		String s1= "taste";
		String s2 = "state";
				
		if (s1.length() != s2.length())
			
		{
			System.out.println("the given string is no anagram");
		}
		
		else 
		{
			System.out.println("the given string can be anagram but need to check");
		}
		
		char c1[]= s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean myfinalanswer= Arrays.equals(c1, c2);
		
		if (myfinalanswer==true)
		{
			System.out.println("the given string is anagram");
		}
		else
		{
			System.out.println("the given string is not anagram");
		}
	}

}
