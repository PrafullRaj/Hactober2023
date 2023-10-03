import java.util.*;

public class reversedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 digit integer: ");
        int n = sc.nextInt();
        int first, second, third, forth, fifth, reverse;
        first = n / 10000;
        n = n % 10000;
        second = n / 1000;
        n = n % 1000;
        third = n / 100;
        n = n % 100;
        forth = n / 10;
        fifth = n % 10;
        reverse = first + second * 10 + third * 100 + forth * 1000 + fifth * 10000;
        System.out.println("Reversed Number is: " + reverse);
    }
}
