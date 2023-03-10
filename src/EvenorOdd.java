import java.util.Scanner;

public class EvenorOdd {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=myobj.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }


    }
}
