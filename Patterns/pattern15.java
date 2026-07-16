/*
ABCDE
ABCD
ABC
AB
A
 */
class pattern15 {
     static public void pattern15(int n) {
         for(int i=n;i>=0;i--)
        {
            char ch='A';
            for(int j=0;j<i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern15(5);
    }
}