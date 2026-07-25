class BuubleSort
{
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int arr[]={16,14,5,6,8};

		for(int i=0;i<arr.length-1;i++)
		{
			int flag =0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			System.out.println("Loop runs at "+i+"Times");
			if(flag==0)
				break;
			
		}

		printArray(arr);
		
	}
}