class countDigit {
    int digit = 0;

    public int countDigit(int n) {
        while (n > 0) {
            int rem = n % 10;
            digit = rem + (digit*10);
            n=n/10;
           
        }
        return digit;
    }

    public static void main(String[] args) {
        countDigit d = new countDigit();
        System.out.print(d.countDigit(56));
    }

}
