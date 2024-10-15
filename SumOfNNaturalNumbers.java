import java.util.Scanner;

class NaturalNumbers{
    int num;
}

public class SumOfNNaturalNumbers {
    public static void main(String[] args){
        System.out.println("Sum of N Natural Numbers");
        Scanner sc = new Scanner(System.in);
        NaturalNumbers myObj = new NaturalNumbers();
        int sum = 0;
        myObj.num = sc.nextInt();
        for(int i = 0; i<=myObj.num; i++){
            sum += i;
        }
        System.out.println("The sum is : " + sum);
    }
}
