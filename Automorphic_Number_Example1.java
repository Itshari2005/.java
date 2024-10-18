class Automorphic_Number_Example1 {
    public static void main(String[] args) {
        long x = 625;    
        long y = x * x; 
        long temp = x;
        long digits = 1;

        while (temp > 0) {
            digits *= 10;
            temp /= 10;
        }

        if (y % digits == x)
            System.out.println(x + " is automorphic.");
        else
            System.out.println(x + " is not automorphic.");
    }
}
