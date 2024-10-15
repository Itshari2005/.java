import java.util.Scanner;

class LeapYearOrNot{
    int year;
}

public class LeapYearOrNotExample1 {
    public static void main(String[] args){
        System.out.println("Finding Leap Year or Not");
        Scanner sc = new Scanner(System.in);
        LeapYearOrNot leap = new LeapYearOrNot();
        leap.year = sc.nextInt();
        if(leap.year % 400 == 0 || (leap.year % 4 == 0 && leap.year % 100 !=0)){
            System.out.println(leap.year + " is a Leap year");
        }
        else{
            System.out.println(leap.year + " not a Leap year");
        }
    }
}
