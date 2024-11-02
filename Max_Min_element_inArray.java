import java.util.Scanner;
public class Max_Min_element_inArray { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the Smallest and Largest elements in an Array");
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Error: Array size should be a positive integer.");
            return; 
        }

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The smallest element in the array is: " + min);
        System.out.println("The largest element in the array is: " + max);
        sc.close(); 
    }
}
