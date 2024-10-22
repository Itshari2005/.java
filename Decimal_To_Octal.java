import java.util.Scanner;
public class Decimal_To_Octal {
    public static void main(String[] args) {
        int decimal, index = 0;
        int octal[] = new int[20];
        System.out.println("Decimal To Octal Conversion");
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
        if(decimal == 0)
            System.out.print("The Octal number is : 0 ");
        else{
            while(decimal > 0){
                octal[index++] = decimal % 8;
                decimal /= 8;
            }
    
            System.out.print("The Octal number is : ");
            for( int i = index - 1; i>=0; i--)
                System.out.print(octal[i]);
        }
        sc.close();
    }
}
