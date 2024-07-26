package stringfunctions;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) 
	{
		String name="KESHAR";
		String s1 = name.toLowerCase();
		String reverse="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1= s1.charAt(i);
			reverse=reverse+ c1;
		}
		System.out.println(reverse);
		
		
		

	}

}

//*String s1="KESHAR";

//for(int i=s1.length()-1;i>=0;i--)
//{
	//System.out.println(s1.charAt(i));
//}/*