import java.util.Scanner;
public class Maximum_No_Of_Handshakes {
    public static void main(String[] args) {
        int num, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of people : ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid input: The number of people cannot be negative.");
            return;
        }
        total = num * (num - 1)/2;
        System.out.println("For " + num + " people, there will be " + total + " handshakes");
    }
}
