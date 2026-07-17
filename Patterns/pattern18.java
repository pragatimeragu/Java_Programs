/*

E 
D E 
C D E 
B C D E 
A B C D E

*/

class pattern18 {
    static public void pattern18(int n) {

         for(int i = 1; i <= n; i++)
        {
            char ch = (char)('A' + n - i);

            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern18(5);
    }
}