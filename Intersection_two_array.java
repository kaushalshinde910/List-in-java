package list;
import java.util.*;
public class Intersection_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {3, 4, 5, 6, 7};

        System.out.println("Intersection of the two arrays:");
        int[] intersection = findIntersection(a1, a2);
        if (intersection.length == 0) {
            System.out.println("No intersection found.");
        } else {
            for (int num : intersection) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Function to find the intersection of two arrays
    public static int[] findIntersection(int[] a1, int[] a2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : a1) {
            set1.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : a2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }

        return intersection;
    }

}
