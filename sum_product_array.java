class sum_product_array
{
    static void sum(int arr[])
    {
        int n=arr.length-1;
        int sum=0;
        int product=1;
        for(int i=0;i<=n;i++)
        {
            sum=sum+arr[i];
            product=product*arr[i];

        }
        System.out.println("Sum :" + sum);
        System.out.println("Product :" + product);
    }
    public static void main(String args[])
    {
        
        int[] arr = {1,2,3,4};
        sum(arr);
    }
}