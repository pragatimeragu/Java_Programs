public class swap_max_min_no_array {

    static void swap(int arr[])
    {
        
        int minIndex=0;
        int maxIndex=0;;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i] < arr[minIndex])
            {
                minIndex=i;
            }
            if(arr[i]>arr[maxIndex]) 
            {
                maxIndex=i;
            }
            
        }
        System.out.println("Array before swapping:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.println("minimum no from array:"+ arr[minIndex]);
        System.out.println("maximun no from array:"+ arr[maxIndex]);

        int temp = arr[minIndex];
        arr[minIndex]=arr[maxIndex];
        arr[maxIndex]=temp;

        System.out.println("Array After swapping");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,12,8,0};
        swap(arr);

    }
}
