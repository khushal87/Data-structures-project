import java.util.Scanner;

public class Merge_sorted_array {
    private int arr[];

    private Merge_sorted_array(int size) {
        arr = new int[size];
    }

    private void accept(int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private Merge_sorted_array merge(int[] arr1, int[] arr2, int size, int size1) {
        Merge_sorted_array ans = new Merge_sorted_array(size + size1);
        int i = 0, j = 0, k = 0;
        while (i < size && j < size1) {
            if (arr1[i] < arr2[j])
                ans.arr[k++] = arr1[i++];
            else
                ans.arr[k++] = arr2[j++];
        }
        while (i < size) {
            ans.arr[k++] = arr1[i++];
        }
        while (j < size1) {
            ans.arr[k++] = arr2[j++];
        }
        return ans;
    }

    void display(int arr_main[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr_main[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter size of two arrays");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        Merge_sorted_array m1 = new Merge_sorted_array(size1);
        Merge_sorted_array m2 = new Merge_sorted_array(size2);
        System.out.println("Enter elements of the first array - ");

        m1.accept(size1);
        System.out.println("Enter elements of the second array - ");
        m2.accept(size2);
        Merge_sorted_array ans = m1.merge(m1.arr, m2.arr, size1, size2);
        ans.display(ans.arr, size1 + size2);
    }
}
