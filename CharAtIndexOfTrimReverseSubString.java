package stringfunctions;

public class CharAtIndexOfTrimReverseSubString {

	public static void main(String[] args) 
	{
		//charAt-- to find character at particular index
		String s1=" I love d my India";
		char c1= s1.charAt(11);
		System.out.println(c1);
		
		//Indexof-- To find index no. of a particular character
		int c2= s1.indexOf('y');
		System.out.println(c2);
		
		//Trim-- To remove space from start of the string and end of the string
		
		String c3= s1.trim();
		System.out.println(c3);
		
		//sub string with single parameter-- to fetch string from the index no. given
		String c4= s1.substring(7);
		System.out.println(c4);
		
		//sub string with double parameter-- to fetch string from the index no. given start and end. 
		//The end index no. will give result by -1 i.e if end index n, is 3 then actually it will execute 3-1 i.e till 2.
		String c5=s1.substring(0, 8);
		System.out.println(c5);

	}

}
