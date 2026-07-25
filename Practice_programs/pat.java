import java.util.*;
class pat
{
	public static String[] printPatt(int n) {
    String[] result = new String[n];
    
    for (int i = n; i >= 1; i--) {
        String row = "";
        for (int j = 1; j <= i; j++) {
            row += "*";
        }
        result[n - i] = row;
    }
    return result;
}


	public static void main(String[] args) {
		int n = 4;
        String[] pattern = printPatt(n);

        for (String s : pattern) {
            System.out.println(s);
        }
	}
	
}