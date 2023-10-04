import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year (YYYY): ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        
        Period age = Period.between(birthdate, currentDate);
        
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");
        
        scanner.close();
    }
}
