/*
A
AB
ABC
ABCD
ABCDE
*/ 
class pattern14 {
    static public void pattern14(int n) {
        for(int i=0;i<n;i++)
        {
            char ch='A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern14(5);
    }
}