import java.util.Scanner;

class PrimeNumber{
    int num;
}

public class PrimeNumbersExample1 {
    public static void main(String[] args){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        PrimeNumber prime = new PrimeNumber();
        prime.num = sc.nextInt();
        int count = 0;
        if(prime.num < 2){
            System.out.println(prime.num + " is not a Prime number");
            return;
        }
        for(int  i = 1; i<prime.num; i++){
            if(prime.num % i == 0){
                count += 1;
            }
        }
        if(count > 2){
            System.out.println(prime.num + " is not a Prime number");
        }
        else{
            System.out.println(prime.num + " is a Prime number");
        }
    }
}
