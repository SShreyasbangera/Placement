import java.util.Scanner;
public class SalesPrefixSum {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of hours: ");
int n = scanner.nextInt(), Sales[] = new int[n], PrefixSum[] = new int[n];
System.out.println("Enter sales for each hour:");
for (int i = 0; i < n; i++) {
Sales[i] = scanner.nextInt();
PrefixSum[i] = Sales[i] + (i > 0 ? PrefixSum[i - 1] : 0);
}
System.out.print("PrefixSum[] = ");
for (int sum : PrefixSum)
System.out.print(sum + " ");
scanner.close();
}
}