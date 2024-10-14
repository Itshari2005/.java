import java.util.Scanner;

class Factors{
    int num;
}

public class FactorsOfNumberExample1 {
    public static void main(String[] args) {
        int i;
        System.out.println("Factors of a Number :");
        Scanner sc = new Scanner(System.in);
        Factors fact = new Factors();
        fact.num = sc.nextInt();
        for(i=1; i<=fact.num; i++){
            if(fact.num % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
