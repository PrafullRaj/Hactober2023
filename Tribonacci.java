public class Tribonacci {
    
    public static void main(String[] args) {
        int n = 10; // Change this number to get more or fewer Tribonacci numbers
        System.out.println("First " + n + " Tribonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(tribonacci(i));
        }
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int t3;

        for (int i = 3; i <= n; i++) {
            t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }

        return t2;
    }
}
