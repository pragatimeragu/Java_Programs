
// *********
//  *******
//   *****
//    ***
//     *


class Pattern8 {
    static public void pattern8(int n) {

        for(int i=n;i>0;i--)
        {
            //space printing
            for(int j=1;j<=n-i;j++)
            {
             System.out.print(" ");

            }
         
            //star printing
            for(int j=1;j<=2*i-1;j++)
            {
                 
                System.out.print("*");
 
                
            }
            System.out.println();

           
        }
      
     
    }
    public static void main(String[] args) {
        pattern8(5);
    }
}