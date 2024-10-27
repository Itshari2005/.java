import java.util.Scanner;
public class Number_Of_Digits {
    public static void main(String[] args) {
        int num, lastDigit, digits = 0;
        System.out.println("Number of Digits in an integer");
        System.out.print("Enter the digit : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num == 0)
            digits = 1;
        else{
            while(num !=0){
                lastDigit = num % 10;
                digits++;
                num/=10;
            }
        }
        System.out.println("Number of digits are " + digits);
    }
}
