package stringfunctions;

public class Palindrome {

	public static void main(String[] args) 
	{
		//to find out given string is palindrome i.e a word, phrase, or sequence that reads the same backwards 
		//as forwards, e.g. madam 
		String name="Rotatori";
		String s2= name.toLowerCase();
		String reverse= "";
				
		for (int i=s2.length()-1;i>=0;i--)
		{
			char c1= s2.charAt(i);
			reverse= reverse+c1;
		}
		System.out.println(reverse);
		boolean c2 = s2.equals(reverse);
		
		if (c2==true)
		{
			System.out.println("the given string is palindrome");
		}
		
		else 
		{
			System.out.println("the given string is not palindrome");
		}
	}

}
