import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        int n, r, pre, deno,fact1 = 1, fact2 = 1;
        System.out.println("Permutations");
        System.out.print("Enter the n value : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter the r value : ");
        r = sc.nextInt();
        if( r>n || n < 0 || r <0){
            System.out.println("Invalid input : Ensure that n>=r and both are non-negative");
            return;
        }
        for(int i = n; i>1; i--){
            fact1 *= i;
        }
        deno = n - r;
        for(int i = deno; i>1; i--){
            fact2 *= i;
        }
        pre = fact1 / fact2;

        System.out.println(pre + " ways");
    }
}
