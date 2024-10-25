import java.util.Scanner;

class Adding_Of_Two_Fractions {
    public static void main(String[] args) {
        int num, deno;
        System.out.println("Adding of Two Fractions");
        System.out.print("Enter 1st no's numerator : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter 1st no's denominator : ");
        int deno1 = sc.nextInt();
        System.out.print("Enter 2nd no's numerator : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 2nd no's denominator : ");
        int deno2 = sc.nextInt();
        if(deno1 == deno2){
            num = num1 + num2;
            deno = deno1;
        }
        else{
            num = (num1 * deno2) + (num2 * deno1);
            deno = deno1 * deno2;
        }
        int x;
        if(num > deno)
            x = num;
        else
            x = deno;

        for(int i = 1; i<=x; i++){
            if(num%i==0 && deno%i==0){
                num /= i;
                deno /= i;
            }
        }
        int n = 1;
        int p =num;
        int q = deno;
        if(num==deno){
            num = 1;
            deno = 1;
        }
        else{
            while(n!=0){
                n = num%deno;
                if(n!=0){
                    num = deno;
                    deno = n;
                }
            }
        }
        System.out.println("(" + p/deno + "/" + q/deno + ")");
        sc.close();   
    }
}