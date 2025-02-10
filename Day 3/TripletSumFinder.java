import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TripletSumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();
        
        int[] array = new int[arraySize];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();
        
        Set<String> triplets = findTripletsWithSum(array, targetSum);
        
        if (!triplets.isEmpty()) {
            System.out.println("Triplets with the sum of " + targetSum + " are:");
            for (String triplet : triplets) {
                System.out.println(triplet);
            }
            System.out.println("Number of triplets: " + triplets.size());
        } else {
            System.out.println("No triplets found with the sum of " + targetSum);
        }
        
        scanner.close();
    }

    public static Set<String> findTripletsWithSum(int[] arr, int targetSum) {
        Set<String> triplets = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        // Create a sorted string representation of the triplet
                        String triplet = arr[i] + "," + arr[j] + "," + arr[k];
                        triplets.add(triplet); // Add the triplet to the set
                    }
                }
            }
        }

        return triplets;
    }
}