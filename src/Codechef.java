import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        for (int i = 0; i < X; i++){
            int n = scan.nextInt();
             if (n <= 100) {
                 System.out.println(n);
             } else if (n > 100 && n <= 1000) {
                 System.out.println(n - 25);
             } else if (n > 1000 && n <= 5000) {
                 System.out.println(n - 100);
             } else {
                 System.out.println(n - 500);
            }
        }
    }
}
