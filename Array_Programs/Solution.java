//Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
class Solution {
    public int whileLoop(int d) {
        // Your code goes here
        int i=1;
        int sum=0;
        int count=0;
        while(count<50)
        {
            
            int rem=i%10;
            if(rem==d)
            {
                sum+=i;
                count++;
            }
            i++;
        }
        return sum;
    }
}