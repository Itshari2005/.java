import java.util.Scanner;
public class Days_In_Given_Month {
    public static void main(String[] args){
        int month, year;
        System.out.println("Counting number of days in a given month of a year");
        System.out.print("Enter the month (1-12): ");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        System.out.print("Enter the year : ");
        year = sc.nextInt();
        if(month <1 || month > 12){
            System.out.println("Invalid month! Please enter a valid month (1-12)");
            return;
        }
        if(month == 2 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))){
            System.out.println("Number of days in February " + year + " is 29");
        }
        else if (month == 2 ) {
            System.out.println("Number of days in February " + year + " is 28");
        }
        else if(month == 1 || month ==3 || month ==5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("Number of days in " + monthName(month) + " " + year +" is 31");
        }
        else {
            System.out.println("Number of days in " + monthName(month) + " " + year + " is 30");
        }
        sc.close();
    }
    static String monthName(int month){
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"};
        return months[month-1];
    }
}

