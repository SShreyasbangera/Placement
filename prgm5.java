public class prgm5 {
    public static void main(String[] args) {
        // Sample array of product ratings
        int[] ratings = {4, 5, 3, 4, 5, 4, 2, 5, 5, 3, 4};

        int mostFrequent = ratings[0]; // Assume first rating is the most frequent
        int maxCount = 0;

        // Loop through each rating to count its occurrences
        for (int i = 0; i < ratings.length; i++) {
            int count = 0;

            // Count how many times ratings[i] appears in the array
            for (int j = 0; j < ratings.length; j++) {
                if (ratings[i] == ratings[j]) {
                    count++;
                }
            }

            // Update most frequent rating if this one appears more
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ratings[i];
            }
        }

        // Print the most frequent rating
        System.out.println("The most frequent rating is: " + mostFrequent);
    }
}
