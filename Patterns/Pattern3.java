// 1
// 12
// 123
// 1234
// 12345

class Pattern3 {
    static public void pattern3(int n) {
         for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
     
    }
    public static void main(String[] args) {
        pattern3(6);
    }
}