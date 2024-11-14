import java.util.Scanner;
public class Second_smallest {
    public static void main(String[] args){
        System.out.println("Finding Second Smallest Element in array");
        System.out.print("Enter the array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length < 2)
            System.out.println("Array needs atleast 2 elements");
        
        int smallest = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        int second_smallest = Integer.MAX_VALUE;
        Boolean bool = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] !=smallest && arr[i] < second_smallest){
                second_smallest = arr[i];
                bool = true;
            }
        }
        if(!bool){
            System.out.println("No second smallest element is found..!!");
        }
        if(second_smallest != Integer.MAX_VALUE)
            System.out.print("The Second smallest element in the array is : " + second_smallest);
    }
}
