import java.util.Scanner;
class GreatestOfTwoNumbers1{
    int a, b;
}

public class GreatestOfTwoNumbersExample1 {
    public static void main(String[] args){
        System.out.println("Greatest of Two Numbers");
        Scanner sc = new Scanner(System.in);
        GreatestOfTwoNumbers1 obj = new GreatestOfTwoNumbers1();
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
        if(obj.a > obj.b){
            System.out.println(obj.a + " is greater than " + obj.b);
        }
        else{
            System.out.println(obj.b + " is greater than " + obj.a);
        }
    }
}
