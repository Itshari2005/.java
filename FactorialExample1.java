import java.util.Scanner;

class Factorial{
    int num;
}

public class FactorialExample1 {
    public static void main(String[] args) {
        int result = 1, i;
        System.out.println("Factorial of a number");
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        Factorial fact = new Factorial();
        fact.num = sc.nextInt();
        for(i=2; i<=fact.num; i++){
            result *=i;
        }
        System.out.println("The Factorial of "+ fact.num + " is " + result);
    }
}
