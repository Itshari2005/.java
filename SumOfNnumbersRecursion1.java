import java.util.Scanner;

class SumOfNumbersRecursion {
    int num;  
}

public class SumOfNnumbersRecursion1 {
    public static void main(String[] args) {
        System.out.println("Sum Of Natural Numbers");
        Scanner sc = new Scanner(System.in);

        SumOfNumbersRecursion obj = new SumOfNumbersRecursion();
        obj.num = sc.nextInt();

        int sum = getSum(obj.num);
        System.out.println("The sum is: " + sum);
    }
    static int getSum(int num) {
        if (num == 0) { 
            return 0;
        }

        return num + getSum(num - 1);
    }
}
z