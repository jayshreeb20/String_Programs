package stringfunctions;

import java.util.Arrays;

public class EqualsIgnoreEndsWithIsEmpty {

	public static void main(String args[]) 
	{
		String s1= "Jayshree";
		String s9="pravin";
		boolean b1=		s9.equalsIgnoreCase(s1);
		System.out.println(b1);
		
		String s2=  "";  //"";
		System.out.println(s2.isEmpty());
				
		
		String s3="manish";
		System.out.println(s3.endsWith("h"));
		System.out.println(s3.endsWith("m"));
		
		String s4="my name is ram";
		String s5[]=s4.split(" ");
		//s5[0]=my
		//s5[1]=name
		//s5[2]=is
		//s5[3]=ram
	//	System.out.println(s5[0]);
		
		System.out.println(Arrays.toString(s5));
		
		String []s6=		s4.split("my", 2);
		System.out.println(Arrays.toString(s6));
		
		/*String q="software";
		String answer=	q.repeat(10);
		System.out.println(answer);
		
		String r= "I live in India";
		String r1[] = r.split(" ", 4);
		System.out.println(Arrays.toString(r1));*/
		
	}

}
