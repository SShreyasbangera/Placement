import java.util.Arrays;
import java.util.Scanner;

public class UniqueDigitsEasy {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int k = scanner.nextInt();
    StringBuilder allDigits = new StringBuilder();
    System.out.println("Enter the numbers:");
    for (int i = 0; i < k; i++) {
    allDigits.append(scanner.next()); // Read number as a string and append
    }
    char[] digitsArray = allDigits.toString().toCharArray();
    Arrays.sort(digitsArray); // Sort digits
    System.out.print("Distinct digits: [");
    System.out.print(digitsArray[0]); // Print first digit
    for (int i = 1; i < digitsArray.length; i++) {
    if (digitsArray[i] != digitsArray[i - 1]) { // Avoid duplicates
    System.out.print(", " + digitsArray[i]);
    }
    }
    System.out.println("]");
    scanner.close();
    }
    }