import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class Decimal_To_Binary {
    public static void main(String[] args){
        int decimal, rem, index = 0;
        int binary[] = new int[32];
        System.out.println("Decimal To Binary conversion");
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
        if(decimal == 0){
            System.out.println("Binary number : 0");
            return;
        }
        while(decimal > 0){
            binary[index++] = decimal % 2;
            decimal /=2;
        }
        
        System.out.print("Binary number : ");
        for(int i= index - 1; i >=0; i--){
            System.out.print(binary[i] + " ");
        }
        sc.close();
    }
}
