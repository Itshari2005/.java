import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        int a, b, temp, rem, sum, digits;
        System.out.println("Armstrong Number in a given range");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        System.out.println("\n");
        for(int i=a; i<=b; i++){
            temp = i;
            sum=0;
            digits=0;
            while(temp!=0){
                temp/=10;
                digits++;
            }

            temp = i;

            while(temp!=0){
                rem = temp%10;
                sum += Math.pow(rem, digits);
                temp/=10;
            }

            if(i==sum){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
