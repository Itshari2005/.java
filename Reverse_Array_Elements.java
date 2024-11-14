import java.util.Scanner;

public class Reverse_Array_Elements {
    public static void main(String[] args) {
        System.out.println("Reversing the array elements");
        System.out.print("Enter the array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size should be greater than zero");
            return;
        }

        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
