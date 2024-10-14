import java.util.Scanner;

class ThreeNumbers{
    int a, b, c;
}

public class GreatestOfThreeNumbersExample1 {
    public static void main(String[] args){
        System.out.println("Greatest of Three Numbers");
        Scanner sc = new Scanner(System.in);
        ThreeNumbers numThree = new ThreeNumbers();
        numThree.a = sc.nextInt();
        numThree.b = sc.nextInt();
        numThree.c = sc.nextInt();
        int temp = numThree.a > numThree.b ? numThree.a : numThree.b;
        int result = temp > numThree.c ? temp : numThree.c;
        System.out.println("The greatest number is " + result);
    }
}
