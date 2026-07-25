public class isArmstrong {
    static public boolean isArmstrong(int n) {
        int originalno=n;
        int sum=0;
        while(n>0)
        {
            int rem = n % 10 ;
            sum+=(int)Math.pow(rem,3);
            n=n/10;
        
        }
        if(sum==originalno)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(12));
        System.out.print(isArmstrong(153));
    }
}
