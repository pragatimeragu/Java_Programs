/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/
class pattern20 {
     static public void pattern20(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //right pattern
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //right pattern
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern20(5);
    }
}