import java.util.Scanner;
public class FuelPostfixSum {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of delivery points: ");
    int m = scanner.nextInt(), Fuel[] = new int[m], PostfixSum[] = new int[m];
    
    System.out.println("Enter fuel consumption at each point:");
    for (int i = 0; i < m; i++) Fuel[i] = scanner.nextInt();
    PostfixSum[m - 1] = Fuel[m - 1]; // Last element remains the same
    for (int i = m - 2; i >= 0; i--)
    PostfixSum[i] = Fuel[i] + PostfixSum[i + 1];
    System.out.print("PostfixSum[] = ");
    for (int sum : PostfixSum) System.out.print(sum + " ");
    scanner.close();
    }
    }