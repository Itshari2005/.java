import java.util.Scanner;

class RangeOfPrimeNumbers {
    int lowest, highest;
}

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the lowest number: ");
        RangeOfPrimeNumbers range = new RangeOfPrimeNumbers();
        range.lowest = sc.nextInt();    
        System.out.print("Enter the highest number: ");
        range.highest = sc.nextInt();   

        for (int i = range.lowest; i <= range.highest; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        sc.close(); 
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false; 
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}
