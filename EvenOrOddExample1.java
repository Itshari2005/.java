import java.util.Scanner;

class EvenOrOddExample1{
    int b;
    public static void main(String[] args){
        System.out.println("Even or Odd");
        Scanner sc = new Scanner(System.in);
        EvenOrOddExample1 eo = new EvenOrOddExample1();
        eo.b = sc.nextInt();
        if(eo.b % 2 == 0){
            System.out.println(eo.b + " is Even number");
        }
        else{
            System.out.println(eo.b + " is Odd number");
        }
    }
}