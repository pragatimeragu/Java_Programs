import java.util.Scanner;

public class UniqueCharFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int len = input.length();  // interviewer usually allows this
        char[] str = new char[len];

        for (int i = 0; i < len; i++) {
            str[i] = input.charAt(i);
        }

        boolean[] visited = new boolean[len];

        for (int i = 0; i < len; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < len; j++) {
                if (str[i] == str[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (str[i] == ' ')
                System.out.print("(space)" + count);
            else
                System.out.print(str[i] + "" + count);
        }
    }
}
