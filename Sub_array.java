package list;

public class Sub_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []a = {1,2,3,4};
		 int size = a.length;

	        // Finding and printing the subarrays along with their sum
	        System.out.println("Subarrays and their sums:");
	        for (int i = 0; i < size; i++) {
	            int sum = 0;
	            for (int j = i; j < size; j++) {
	                sum += a[j];
	                System.out.print("[ ");
	                for (int k = i; k <= j; k++) {
	                    System.out.print(a[k] + " ");
	                }
	                System.out.println("] Sum: " + sum);
	            }
	        }
	    }
	
}

