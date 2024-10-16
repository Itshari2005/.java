import java.util.Scanner;

public class SumOfNumbersInGivenRange {
    public static void main(String[] args) {
        int a, b, sum=0;
        System.out.println("Sum of numbers in a guven range");
        System.out.println("Enter the numbers : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        a = sc.nextInt();
        System.out.println("b : ");
        b = sc.nextInt();
        for( int i=a; i<=b; i++){
            sum += i;
        }
        System.out.println("The sum is : " + sum);
    }
}
2