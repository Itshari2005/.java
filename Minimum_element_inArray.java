import java.util.Scanner;
public class Minimum_element_inArray {
    public static void main(String[] args) {
        System.out.println("Finding Largest element in an Array");
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Error: Array size should be a positive integer.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("The Minimum element in tha array is " + min);
    }
}
