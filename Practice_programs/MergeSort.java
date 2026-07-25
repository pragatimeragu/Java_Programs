class MergeSort
{
	public static void Divide(int arr[],int si,int ei)
	{
			if(si>=ei)
			{
				return;
			}
			int mid =si+(ei-si)/2;
			Divide(arr,si,mid); // 1 st half array start to mid
			Divide(arr,mid+1,ei); // 2nd half part mid+1 to end 
			conquer(arr,si,ei,mid); 
		
	}
	public static void conquer(int arr[],int si,int ei,int mid)
	{
		int newarr[]=new int[ei-si+1]; // to merge the parts we use new array 
		int i=si;
		int j=mid+1;
		int k=0;//new array pointer
		while(i<=mid && j <=ei)
		{
			if(arr[i]<arr[j]){ // if arr[i] is less than j then arr[i] elemt is added to newarray first 

				newarr[k]=arr[i];
				i++;
				k++;//newarray points to next position 
			}
			else{ // otherwise arr[j] elemnt is added to newarray
				newarr[k]=arr[j];
				j++;
				k++;
			}
		}

		// if all the elemts in first array i,e 0 to mid are inserted in new array but elemts 
		//another part are remained then they will aded to newarray 
		if(i>mid){
			while(j<=ei){
				newarr[k]=arr[j];
				j++;
				k++;
			}
		}
		else{ // vice versa
			while(i<=mid){
				newarr[k]=arr[i];
				i++;
				k++;
			}
		}

		
        for(int x = 0, y = si; x < newarr.length; x++, y++)
        {
            arr[y] = newarr[x];//transfering the new array sorted into orignial array
        }
	}
	
	public static void main(String[] args) {
		int arr[]={2,5,1,8,3};
		int n=arr.length;

		Divide(arr,0,n-1);

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}