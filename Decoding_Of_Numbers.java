import java.util.Scanner;
public class Decoding_Of_Numbers {
    public static void main(String[] args) {
        String num;
        System.out.println("Possible Decoding of a Digit Sequence");
        System.out.print("Enter a digit sequence : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        System.out.println("Count Of Decodings : " + decoding(num));
    }
    static int decoding(String num){
        if(num == null || num.length() == 0 || num.charAt(0) == '0')
            return 0;
        
        int n = num.length();
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = (num.charAt(0) !='0') ? 1 : 0;

        for(int i = 2; i<=n; i++){
            int oneDigit = Integer.parseInt(num.substring(i-1, i));
            int twoDigit = Integer.parseInt(num.substring(i-2, i));
            
            if(oneDigit >=1)
                dp[i] += dp[i-1];
        
            if(twoDigit >=10 && twoDigit <=26)
                dp[i] += dp[i-2];  
        }
        return dp[n];
    }
}
