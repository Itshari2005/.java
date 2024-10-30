import java.util.Scanner;
public class Occurrence_Of_Digit {
    public static void main(String[] args) {
        int digit, rem, count = 0;
        long num;
        System.out.println("Occurrence of a digit in a given number");
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();
        System.out.print("Enter the digit to be searched : ");
        digit = sc.nextInt();
        long tempNum = num;
        while(tempNum !=0){
            rem = (int) (tempNum % 10);
            if(rem == digit)
                count++;
            tempNum /=10;
        }
        System.out.println("The digit " + digit + " occurs " + count + " times in the number " + num);
        sc.close();
    }
}
