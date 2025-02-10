 class InversionCount2{ 
    // Function to count inversion pairs using recursion
    public static int countInversions(int[] processingTimes, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return 0;
        }
        
        int middleIndex = (startIndex + endIndex) / 2;
        
        int leftInversions = countInversions(processingTimes, startIndex, middleIndex);
        int rightInversions = countInversions(processingTimes, middleIndex + 1, endIndex);
        int splitInversions = mergeAndCount(processingTimes, startIndex, middleIndex, endIndex);
        
        return leftInversions + rightInversions + splitInversions;
    }
    
    // Merge function to count inversions and sort the array
    private static int mergeAndCount(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0, count = 0;
        
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);  // Count the number of inversions
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        
        System.arraycopy(temp, 0, arr, start, temp.length);
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] processingTimes = {30, 45, 25, 60, 20};
        int inversionCount = countInversions(processingTimes, 0, processingTimes.length - 1);
        System.out.println("The inversion count is " + inversionCount);
    }
}