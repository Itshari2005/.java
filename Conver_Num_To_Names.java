import java.util.Scanner;
public class Conver_Num_To_Names {
    public static void main(String[] args){
        int num;
        System.out.println("Converting given number into Names");
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Number : " + num);
        System.out.println("In words : " + convertToWords(num));
    }

    static String convertToWords(int num){
        if(num == 0)
            return "Zero"; 
        
        String result = "";
        int thousandCounter = 0;

        while(num > 0){
            int remainder = num % 1000;
            if(remainder> 0){
                String part = convertBelowThousand(remainder);
                if(!part.isEmpty()){
                    result = part + " " + thousand[thousandCounter] + " " + result;
                }
            }
            thousandCounter++;
            num/=1000;
        }
        return result.trim();
    }
    static String convertBelowThousand(int num){
        String result = "";
        if(num >=100){
            result +=units[num/100] + " Hundred ";
            num %=100;
        }
        if(num >=20){
            result += tens[num/10] + " ";
            num%=10;
        }
        if(num > 0){
            result += units[num] + " ";
        }
        return result.trim();
    }
    static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static final String[] thousand = {"", "Thousand", "Million", "Billion"};
}
