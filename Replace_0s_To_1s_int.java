import java.util.Scanner;
public class Replace_0s_To_1s_int{
    public static void main(String[] args) {
        int num;
        System.out.println("Replacing all 0's with 1's in a given Integer");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        int modifiedNumber = replacingFunction(num);
        System.out.print("The result is : " + modifiedNumber);
    }
    static int replacingFunction(int num){
        int result = 0, placeValue = 1;
        if(num==0)
            return 1;
        while(num!=0){
            int digit = num % 10;

            if(digit == 0)
                digit = 1;

            result = digit * placeValue + result;
            num /= 10;
            placeValue *=10;
        }
        return result;
    }
}
