import java.util.Scanner;

public class HarshadNumberExample1 {
    public static void main(String[] args) {
        int num;
        int result = 0;
        System.out.println("Harshad Number");
        System.out.println(" Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int copy = num;
        while(num !=0){
            int pickLast = num % 10;
            result += pickLast;
            num/=10;
        }
        if(copy % result == 0){
            System.out.println(copy + " is a Harshad number");
        }
        else{
            System.out.println(copy + " is not a Harshad number");
        }
    }
}
