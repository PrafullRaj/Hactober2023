import java.util.Scanner;

public class KelvinToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();

        // Convert Kelvin to Celsius
        double celsius = kelvin - 273.15;

        
        System.out.println("Temperature in Celsius: " + celsius + " °C");

        
        scanner.close();
    }
}
