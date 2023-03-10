import java.util.Scanner;

public class DivisibleBy2and3And5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int N = s.nextInt();
        int num = 1;
        while (num < N)
        {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0)
                System.out.print(num + " ");
            num++;
        }


    }
}
