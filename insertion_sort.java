package list;

public class insertion_sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = { 10, 15, 12, 14, 16 };

        int temp, j;

        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;

            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
