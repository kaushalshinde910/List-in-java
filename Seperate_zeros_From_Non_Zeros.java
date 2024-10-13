package list;

public class Seperate_zeros_From_Non_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0, 1, 0, 3, 12};

        separateZeros(a);

        // Print the separated array
        System.out.println("Array after separating zeros from non-zeros:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    // Function to separate zeros from non-zeros in an integer array
    public static void separateZeros(int[] a) {
        int left = 0;
        int right = a.length - 1;

        // Move non-zero elements to the left and zero elements to the right
        while (left < right) {
            // Find the first non-zero element from the left
            while (left < right && a[left] != 0) {
                left++;
            }

            // Find the first zero element from the right
            while (left < right && a[right] == 0) {
                right--;
            }

            // Swap non-zero element with zero element
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
	}

}
