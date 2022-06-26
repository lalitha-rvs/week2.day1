package week2.day1;

public class ReverseEvenWords {



		public static void main(String[] args) {

		String s="java is a high level language";

		String result=reverseAltWords(s);//function reverse even words ina string

		System.out.println(result.substring(1));
		

		}

		public static String reverseAltWords(String s)

		{

		String[] str=s.split(" ");
	

		String r="";

		for(int i=0;i<str.length;i++)

		{

		if(i%2==1)

		{

		str[i]=reverse(str[i]);

		}

		r=r+" "+str[i];

		}

		return r;

		}

		public static String reverse(String s)

		{

		String rev="";

		for(int i=s.length()-1;i>=0;i--)

		{

		rev=rev+s.charAt(i);

		}

		return rev;
		}}
		