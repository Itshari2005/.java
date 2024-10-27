import java.util.Scanner;
public class Prime_one_to_hundred {
    public static void main(String[] args) {
        int a = 1, b = 100;
        System.out.println("Prime Numbers from 1 to 100");
        for(int i = a; i<=b; i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean checkPrime(int i){
        if(i<2)
            return false;
        else{
            for(int j = 2; j<=i/2; j++){
                if(i%j==0)
                    return false;
            }
        }
        return true;
    }
}
