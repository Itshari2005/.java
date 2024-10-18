import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        System.out.println("Abundance Number");
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum > num){
            System.out.println(num + " is an Abundant Number");
            System.out.println("The Abundance is : " + (sum - num));
        }
        else{
            System.out.println(num + " is not an Abundant Number");
        }
    }
}
