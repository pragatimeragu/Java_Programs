class bin_to_Dec {
    static public int bin_to_Dec(int bin_no) {
        int ans = 0;
        int pow = 1; // 2^0=1
        while (bin_no > 0) {
            int rem = bin_no % 10;

            ans += rem * pow;
            bin_no = bin_no / 10;
            pow = pow * 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int dec = bin_to_Dec(1010);
        System.out.println("Binary Number:" + dec);
    }
}