import java.util.Scanner;
public class LCM_of_two_numbers {
    public static void main(String[] args) {
        int num1, num2, max, lcm = 0;
        System.out.println("LCM of two numbers");
        System.out.print("Enter 1st number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();
        if(num1 > num2)
            max = num1;
        else
            max = num2;
        
        int i = max;
        while(true){
            if(i % num1 == 0 && i % num2 == 0){
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println("The LCM of " + num1 + " and " + num2 + " is : " + lcm);
    }
}
