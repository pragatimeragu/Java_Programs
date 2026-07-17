class Dec_to_bin
{
    static public int dec_to_bin(int dec_no)
    {
        int ans=0;
        int pow=1;  //10^0=1
        while(dec_no>0)
        {
            int rem=dec_no%2;
            dec_no=dec_no/2;
            ans+=(rem*pow);
            pow=pow*10;
        }
        return ans;
    } 
    public static void main(String[] args) {
        int bin=dec_to_bin(42);
        System.out.println("Binary Number:"+bin);
    }
}