import java.util.Scanner;
public class Sum_Of_Array_Elements {
    public static void main(String[] args) {
        System.out.println("Calculation Sum of Array Elements");
        System.out.print("Enter the array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        if(arr.length <=0){
            System.out.println("Array size should be greater than zero");
            return;
        }
        System.out.println("Enter the array elements : ");
        for(int i = 0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
            sum +=arr[i];
        System.out.print("The sum is : " + sum);
    }
}
