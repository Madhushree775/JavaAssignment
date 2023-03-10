import java.util.Scanner;

public class Checkthenumber {

    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=myobj.nextInt();
        if(n>0){
            System.out.println("Positive number");
        } else if (n<0) {
            System.out.println("Negative number");
        }else{
            System.out.println("Zero");
        }


    }
}
