/* Sum of prime numbers in range 30 to 11*/


public class E {

	public static void main(String[] args) {
		int r1=30;
		int r2=11;
		int sum=0;
		
		for (int num=r1;num>=r2;num--)
		{
			boolean flag=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				 System.out.println(num);
				 sum=sum+num;
			}
		}
		System.out.println("sum is :"+sum);

	}

}
