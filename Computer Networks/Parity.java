package LAB;
import java.util.*;
public class Parity {
	static void computeParity(String str) {
		char arr[] = new char[20];
		arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				count++;
			}
		}
		if (count % 2 == 0) {
			System.out.println("Parity Bit: 0");
		} else {
			System.out.println("Parity Bit: 1");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str = sc.next();
		computeParity(str);

	}

}
