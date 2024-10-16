import java.util.Scanner;

class Palindrome{
    int num;
}

public class PalindromeExample1 {
    public static void main(String[] args) {
        System.out.println("Palindrome");
        int rem, reverse = 0, temp;
        Scanner sc = new Scanner(System.in);
        Palindrome obj = new Palindrome();
        obj.num = sc.nextInt();
        temp = obj.num;
        while (temp != 0)
       {
     	rem = temp % 10;
     	reverse = reverse * 10 + rem;
     	temp /= 10;
       }

       if (obj.num == reverse){
        System.out.println (obj.num + " is Palindrome");
       }
       
        else{
            System.out.println (obj.num + " is not Palindrome");
        }
    }
}
