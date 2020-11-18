/* Read number of products and temperature of each product, and print count pf -ve temperatures*/


import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of products");
		int no_products=s.nextInt();
		int[]a=new int[no_products];
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
		   System.out.println("Enter temperature of product "+(i+1));
		   a[i]=s.nextInt();
		   if(a[i]<0)
		   {
			    count++;
		   }
		}
		System.out.println("Count of -ve temperatures "+count);

	}

}
