import java.util.Arrays;

class All_Divisors {
    static public int[] divisors(int n) {
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }

        int[] divisors = new int[count];
        int index=0;

         for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                divisors[index]=i;
                index++;
            }
        }
        return divisors;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(8)));
        System.out.println(Arrays.toString(divisors(18)));
    }
}