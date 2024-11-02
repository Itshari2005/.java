import java.util.Scanner;
public class Largest_element_inArray {
    public static void main(String[] args) {
        System.out.println("Finding Largest element in an Array");
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("The largest element in tha array is " + max);
    }
}
