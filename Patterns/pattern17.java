/*

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/

class pattern17 {
    static public void pattern17(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            // Decreasing characters
            ch = (char) ('A' + i - 2);

            for (int j = 1; j < i; j++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern17(5);
    }
}