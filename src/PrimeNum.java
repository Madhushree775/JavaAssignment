import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is a prime number");
        }else if(number ==0) {
            System.out.println("0 is neither prime nor composite");
         }else if(number ==1) {
            System.out.println("1 is neither prime nor composite");
        }else{
            System.out.println(number + " is not a prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }


}
