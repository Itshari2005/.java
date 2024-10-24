import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args){
        int x, y;
        System.out.println("Finding the Quadrant in which the coordinates lie");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate : ");
        x = sc.nextInt();
        System.out.print("Enter Y coordinate : ");
        y = sc.nextInt();
        if(x>0 && y>0)
            System.out.println("The coordinates " + x + " and " + y + " are Quadrant 1");
        else if(x<0 && y>0)
            System.out.println("The coordinates " + x + " and " + y + " are Quadrant 2");
        else if(x<0 && y<0)
            System.out.println("The coordinates " + x + " and " + y + " are Quadrant 3");
        else if(x>0 && y<0)
            System.out.println("The coordinates " + x + " and " + y + " are Quadrant 4");
        else if(x == 0 && y == 0)
            System.out.println("The coordinates " + x + " and " + y + " lies on Origin");
        else if(x ==0 && y!=0)
            System.out.println("The coordinates " + x + " and " + y + " lies on Y-axis");
        else if(y==0 && x!=0)
            System.out.println("The coordinates " + x + " and " + y + " lies on X-axis");
    }
}
