import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n - 2; i++) {
            if (i == 0) {
                System.out.print("0 ");
            }
            if (i == 1) {
                System.out.print("1 ");
            }
            sum = a + b;
            a = b;
            b = sum;
            System.out.print((sum) + " ");

        }
    }
}
