/* Count of special characters in a string*/


import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')))
             {
				count++;
             }
         }
		System.out.println(count);
		s.close();
		}

}
