import java.util.Arrays;

public class NextGreaterElement {

    // Recursive function to find the next greater element for each index
    public static void findNextGreater(int[] arr, int[] result, int index) {
        // Base case: If the index reaches the end of the array, stop recursion
        if (index == arr.length) {
            return;
        }

        // Default value if no greater element is found
        result[index] = -1;  

        // Iterate through the remaining elements to find the next greater element
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] > arr[index]) {  // If a greater element is found
                result[index] = arr[j]; // Store it in the result array
                break;  // Stop searching further
            }
        }

        // Recursive call for the next index
        findNextGreater(arr, result, index + 1);
    }

    // Wrapper function to initialize the result array and start the recursion
    public static int[] nextGreaterElements(int[] arr) {
        int[] result = new int[arr.length]; // Create an array to store results
        findNextGreater(arr, result, 0);   // Start recursion from index 0
        return result;  // Return the final result array
    }

    public static void main(String[] args) {
        // Test case 1: General case with mixed numbers
        int[] arr1 = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(nextGreaterElements(arr1))); // Output: [8, -1, 1, 3, -1]

        // Test case 2: Mixed values, should return the next greater elements correctly
        int[] arr2 = {1, 3, 2, 4};
        System.out.println(Arrays.toString(nextGreaterElements(arr2))); // Output: [3, 4, 4, -1]

        // Test case 3: Increasing order, each element has a greater element
        int[] arr3 = {10, 20, 30, 50};
        System.out.println(Arrays.toString(nextGreaterElements(arr3))); // Output: [20, 30, 50, -1]

        // Test case 4: Decreasing order, no greater elements exist
        int[] arr4 = {50, 40, 30, 10};
        System.out.println(Arrays.toString(nextGreaterElements(arr4))); // Output: [-1, -1, -1, -1]
    }
}
