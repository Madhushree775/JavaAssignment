import java.util.Scanner;

public class PrimeNumber {
    static boolean IsPrime() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args){
        if (IsPrime())
            System.out.println("true");
        else
            System.out.println("false");
    }
}