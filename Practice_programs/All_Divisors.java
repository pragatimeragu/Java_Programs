class All_Divisors {
    static public int[] divisors(int n) {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                return new int[] {i};
            }
        }
    }
    public static void main(String[] args) {
        divisors(8);
    }
}