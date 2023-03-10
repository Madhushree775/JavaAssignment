import java.util.Scanner;

public class ReverseNumber {
    static int reverse(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int rev = 0;
        int rem;

        while(n>0){

            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        return rev;
    }


    public static void main (String[] args) {


        System.out.print("Reversed Number is "+ reverse());
    }
}
