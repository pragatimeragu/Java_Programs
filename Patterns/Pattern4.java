// 1
// 22
// 333
// 4444
// 55555

class Pattern4 {
    static public void pattern4(int n) {
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
     
    }
    public static void main(String[] args) {
        pattern4(6);
    }
}