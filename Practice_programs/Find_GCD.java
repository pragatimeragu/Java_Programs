// GCD (Greatest Common Divisor) is the largest number that divides both numbers exactly.
class Find_GCD {
    static public int GCD(int n1, int n2) {
        int gcd=1;
     
        if(n2>n1)
        {
            int temp=n2;
            n2=n1;
            n1=temp;
        }
        //we will divide upto small no 
        for(int i=1;i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
            }
            
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.print(GCD(24,30));
    }
}

 //// We check divisors only up to the smaller number because any common divisor must divide both numbers, so it cannot be greater than the smaller number.