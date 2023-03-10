import java.util.Scanner;

public class FloydsStar {

    public static void main(String[] args)
    {
Scanner s=new Scanner(System.in);
        System.out.println("Please enter an integer number:");
        int n = s.nextInt();


        int i, j, k = 1;


        for (i = 1; i <= n; i++) {


            for (j = 1; j <= i; j++) {


                System.out.print("*" + "  ");


                k++;
            }


            System.out.println();
        }
    }
}
