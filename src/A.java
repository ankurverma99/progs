

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		long num=s.nextInt();
		long oddSum=0;
		long evenSum=0;
		long ld;
		while(num>0)
		{
			ld=num%10;
			if(ld%2==0)
			{
				evenSum=evenSum+ld;
			}
			else
			{
				oddSum=oddSum+ld;
			}
			num=num/10;
		  
		}
		long product=evenSum*oddSum;
		System.out.println(product);

	}

}
