class pattern9 {
    static public void pattern9(int n) {
        for(int i=0;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

             for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

             for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern9(5);
    }
}