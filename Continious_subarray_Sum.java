package list;

public class Continious_subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 4, 20, 3, 10, 5};
	        // Given sum
	        int targetSum = 33;

	        System.out.println("Continuous subarrays with sum equal to " + targetSum + ":");
	        findContinuousSubarrays(arr, targetSum);
	    }

	    // Function to find continuous subarrays with the given sum
	    public static void findContinuousSubarrays(int[] arr, int targetSum) {
	        int currentSum = arr[0];
	        int start = 0;

	        // Iterate through the array to find subarrays
	        for (int i = 1; i <= arr.length; i++) {
	            // If current sum exceeds the target sum, remove elements from the start
	            while (currentSum > targetSum && start < i - 1) {
	                currentSum -= arr[start];
	                start++;
	            }

	            // If current sum equals the target sum, print the subarray
	            if (currentSum == targetSum) {
	                System.out.println("Subarray found between indexes " + start + " and " + (i - 1));
	                return;
	            }

	            // Add current element to the current sum
	            if (i < arr.length) {
	                currentSum += arr[i];
	            }
	        }
	        System.out.println("No subarray found with sum equal to " + targetSum);
	}

}
