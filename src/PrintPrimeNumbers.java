public class PrintPrimeNumbers {

    static boolean isPrime(int n){

        if(n==1||n==0)return false;


        for(int i=2; i*i<=n; i++){

            if(n%i==0)return false;
        }

        return true;
    }



    public static void main (String[] args)
    {
        int N = 99;

        for(int i=10; i<=N; i++){

            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
