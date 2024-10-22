import java.util.Scanner;
public class Decimal_To_Hexa {
    public static void main(String[] args) {
        int index = 0;
        long decimal, rem;
        char hex[] = new char[20];
        System.out.println("Decimal to Hexadecimal conversion");
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        decimal = sc.nextLong();
        if(decimal == 0)
            System.out.println("The Hexadecimal value is : 0");
        else{
            while(decimal > 0){
                rem = decimal % 16;
                if(rem < 10){
                    hex[index++] = (char) (rem + '0');
                } 
                else{
                    hex[index++] = (char) (rem - 10 + 'A');
                }
                decimal /= 16;
            }
            System.out.println("The Hexadecimal value is : ");
            for(int i = index - 1; i>=0; i--){
                System.out.print(hex[i] + " ");
            }   
        }
        sc.close();
    }
}
