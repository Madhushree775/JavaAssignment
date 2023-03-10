import java.util.Scanner;

public class IsPalindrome {
    public static void main(String args[]){
        int r,sum=0,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not a palindrome");
    }

}
