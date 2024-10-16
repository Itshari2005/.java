import java.util.Scanner;

class ReverseNumber{
    int num;
}

public class ReverseNumberExample1 {
    public static void main(String[] args){
        System.out.println("Reversing a Number");
        int reverse = 0;
        int rem = 0;
        Scanner sc = new Scanner(System.in);
        ReverseNumber rev = new ReverseNumber();
        rev.num = sc.nextInt();
        while(rev.num !=0){
            rem = rev.num % 10;
            reverse = reverse * 10 + rem;
            rev.num /= 10;
        }
        System.out.println("Reversed Number is : " + reverse);
    }
}
