import java.util.*;
class prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();


		for(int n=2;n<=limit;n++)
		{
				boolean isprime=true;
				for(int i=2;i*i<=n;i++)
				{
					if(n%i==0)
					{
						isprime=false;
						break;
					}
				}
		if(isprime){
			System.out.println(n + " ");
		}
		}
		
	}
}