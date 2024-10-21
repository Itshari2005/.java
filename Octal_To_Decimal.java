import java.util.Scanner;
public class Octal_To_Decimal {
    public static void main(String[] args) {
        int octal, rem, decimal = 0, base = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Octal to Decimal Conversion");
        System.out.print("Enter a binary number: ");
        octal = sc.nextInt();
        decimal = 0;
        base = 1; 

        while (octal > 0) {
            // Get the last digit (either 0 or 1)
            rem = octal % 10;
            decimal += rem * base;
            base *= 8;
            octal /= 10;
        }

        System.out.println("Decimal number: " + decimal);
        sc.close();
    }
}


