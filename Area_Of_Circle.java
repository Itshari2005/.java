import java.util.Scanner;
public class Area_Of_Circle {
    public static void main(String[] args) { 
        double radius, result;
        System.out.println("Area Of Circle");
        System.out.print("Enter the radius : ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        if(radius < 0)
            System.out.println("Error :  Radius can't be negative");
        else{
            result = 3.14 * ( radius * radius);
            System.out.println("The Area is : " + result);
        }
        sc.close();
    }
}
