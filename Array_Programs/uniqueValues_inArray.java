public class uniqueValues_inArray {

    
    static void findUnique(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        if(count == 1)
        {
            System.out.print(arr[i]+" ");
        }
        }
       
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5,66,8,45,3,3};
        findUnique(arr);

    }
}
