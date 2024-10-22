import java.util.Scanner;
public class Octal_To_Binary {
    public static void main(String[] args) {
        int octal, rem, n = 0, decimal = 0;
        System.out.println("Octal to Binary conversion");
        System.out.print("Enter an Octal value : ");
        Scanner sc = new Scanner(System.in);
        octal = sc.nextInt();
        while(octal > 0){
            rem = octal % 10;
            int power = 1;
            for(int i=0; i<n; i++){
                power *= 8;
            }
            decimal += rem * power;
            octal /=10;
            n++;
        }

        int binary[] = new int[20];
        int index = 0;

        while(decimal > 0){
            binary[index++] = decimal % 2;
            decimal /=2;
        }
        System.out.println("The Binary Value is : ");
        for(int j = index - 1; j >=0; j--){
            System.out.print(binary[j]);
        }
    }
}

