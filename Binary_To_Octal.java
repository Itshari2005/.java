import java.util.Scanner;
public class Binary_To_Octal {
    public static void main(String[] args) {
        int binary, decimal = 0, rem, n=0;
        System.out.println("Binary to Octal Conversion");
        System.out.print("Enter a Binary value : ");
        Scanner sc = new Scanner(System.in);
        binary = sc.nextInt();
        while(binary > 0){
            rem = binary % 10;
            int power = 1;
            for(int i=0; i<n; i++){
                power *=2;
            }
            decimal += rem * power;
            binary /= 10;
            n++;
        }

        int octal[] = new int[20];
        int index=0;

        while(decimal > 0){
            octal[index++] = decimal % 8;
            decimal /=8;
        }
        System.out.print("The Octal value is : ");
        for(int j = index-1; j>=0; j--){
            System.out.print(octal[j] + " ");
        }
        sc.close();
    }
}
