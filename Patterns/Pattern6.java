// 12345
// 1234
// 123
// 12
// 1

class Pattern6 {
    static public void pattern6(int n) {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
     
    }
    public static void main(String[] args) {
        pattern6(5);
    }
}