import java.util.Scanner;

class Armstrong{
    int num;
}
public class ArmstrongExample1 {
    public static void main(String[] args) {
        int digits = 0, rem =0, sum=0, temp;
        Scanner sc = new Scanner(System.in);
        Armstrong arm = new Armstrong();
        System.out.println("Enter a number: ");
        arm.num = sc.nextInt();
        temp = arm.num;
        while(temp !=0){
            temp /=10;
            digits++;
        }

        temp = arm.num;

        while(temp !=0){
            rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        if(arm.num == sum){
            System.out.println(arm.num + " is an Armstrong number");
        }
        else{
            System.out.println(arm.num + " is not an Armstrong number");
        }
        sc.close();
    }
}
