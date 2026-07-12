import java.util.Arrays;

public class swap_without3rd_Var {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};

        int i=0;
        int j=3;

        arr[i]=arr[i]+arr[j]; //10+40=50
        arr[j]=arr[i]-arr[j];//50-40=10
        arr[i]=arr[i]-arr[j];//50-10=40

        System.out.println(Arrays.toString(arr));
    }
}
