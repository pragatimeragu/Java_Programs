import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isprime=true;

		if(n<2){
			isprime=false;
		}
		else {
			for(int i=2;i*i<=n;i++)
			{
				if(n%i==0)
				{
					isprime=false;
					break;
				}
			}
		}

		if(isprime){
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}