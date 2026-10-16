import java.util.Scanner;

public class _30A {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        for (int x = -1000; x <= 1000; x++) {
            if (Math.pow(x, n) * a == b) { 
                System.out.println(x);
                sc.close();
                return;
            }
        }
        
        System.out.println("No solution");
        sc.close();
    }
}
