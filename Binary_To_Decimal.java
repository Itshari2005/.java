import java.util.Scanner;
public class Binary_To_Decimal {
    public static void main(String[] args){
        int num, rem, decimal = 0, base = 1;
        System.out.println("Binary to Decimal Conversion");
        System.out.print("Enter a binary number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num > 0){
            rem = num % 10;
            decimal += rem * base;
            base *=2;
            num /=10;
        }
        System.out.println("The decimal number is : " + decimal);
    }
}
