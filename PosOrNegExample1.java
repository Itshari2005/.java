import java.util.Scanner;

class PosOrNegExample1{
    int a;
    public static void main(String[] args) {
        System.out.println("Finding Positive or Negative number..!!");
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        PosOrNegExample1 obj = new PosOrNegExample1();
        obj.a = sc.nextInt();
        if(obj.a==0){
            System.out.println("The number is Zero i.e either positive nor negative");
        }
        else if(obj.a>0){
            System.out.println("The number " + obj.a + " is Positive");
        }
        else{
            System.out.println("The number " + obj.a + " is Negative");
        }
    }
}
