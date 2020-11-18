/* Sum of prime digits in a number*/


import java.util.Scanner;

public class C {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int sum=0;
		int ld;
		
		while(num>0)
		{
			ld=num%10;
			if(isPrime(ld))
			{
			 sum=sum+ld;
			}
			num=num/10;
		}
		System.out.println("sum of prime digits "+sum);
		s.close();
	}

	private static boolean isPrime(int ld) 
	{
		boolean flag=true;
		for(int i=2;i<=ld/2;i++)
		{
			if(ld%i==0)
			{
				flag=false;
				break;
			}
		}
		
		return flag;
	}

}
