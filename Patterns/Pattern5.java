// *****
// ****
// ***
// **
// *
class Pattern5 {
    static public void pattern5(int n) {
        for(int i=n;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     
    }
    public static void main(String[] args) {
        pattern5(5);
    }
}