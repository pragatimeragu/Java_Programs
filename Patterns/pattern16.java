/*
A
BB
CCC
DDDD
EEEEE
*/
class pattern16 {
     static public void pattern16(int n) {
         char ch='A';
         for(int i=1;i<=n;i++)
        {
           
            for(int j=0;j<i;j++)
            {
                System.out.print(ch);
               
            }
             ch++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern16(5);
    }
}