import java.util.Scanner;

public class SumOfDigits {
    int num;
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Sum of the Digits");
        System.out.println("Enter a Number : \n");
        Scanner sc = new Scanner(System.in);
        SumOfDigits num1 = new SumOfDigits();
        num1.num = sc.nextInt();
        while(num1.num !=0){
            sum += num1.num % 10;
            num1.num = num1.num / 10;
        }
        System.out.println("The sum is : " + sum);
    }
}
