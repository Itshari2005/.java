import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Friendly Pairs");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        num2 = sc.nextInt();

        int sum1 = getFactorsSum(num1);
        int sum2 = getFactorsSum(num2);

        if(sum1 / num1 == sum2 / num2){
            System.out.println(num1 + " & " + num2 + " are friendly pair");
        }
        else{
            System.out.println(num1 + " & " + num2 + " are not friendly pair");
        }

    }

    public static int getFactorsSum(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum +=i;
            }
        }
        return sum;
    }
}
