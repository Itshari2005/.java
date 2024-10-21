import java.util.Scanner;
public class Hexa_To_Decimal {
    public static void main(String[] args) {
        int decimal = 0, value, base = 1;
        String hexa;
        System.out.println("Hexadecimal to Decimal conversion");
        System.out.println("Enter a Hexadecimal Value : ");
        Scanner sc = new Scanner(System.in);
        hexa = sc.nextLine().toUpperCase();
        for(int i = hexa.length() - 1; i>=0; i--){
            char hexaDigit = hexa.charAt(i);
            value = (hexaDigit >= '0' && hexaDigit <='9') ? hexaDigit - '0' : hexaDigit - 'A' + 10;
            decimal += value * base;
            base *=16;
        }
        System.out.println("Th decimal number is : " + decimal);
        sc.close();
    }
}
