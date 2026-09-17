import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int answer = 0;

        while (sc.hasNextLine()) {

            String s = sc.nextLine();

            if (s.length() == 0) {
                break;
            }

            if (s.charAt(0) == '+') {
                count++;
            }
            else if (s.charAt(0) == '-') {
                count--;
            }
            else {
                int colon = s.indexOf(':');
                String message = s.substring(colon + 1);

                answer += count * message.length();
            }
        }

        System.out.println(answer);

        sc.close();
    }
}