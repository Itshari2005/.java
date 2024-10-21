import java.util.Scanner;
class HCF_of_two_numbers{
    public static void main(String[] args) {
        int num1, num2, min, hcf = 0;
        System.out.println("HCF Of two numbers");
        System.out.print("Enter 1st number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();
        if(num1 < num2)
            min = num1;
        else
            min = num2;
        
        for(int i = 1; i<=min; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("The HCF is : " + hcf);
    }
}