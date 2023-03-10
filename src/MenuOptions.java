import java.util.Scanner;

public class MenuOptions {
    public static void main(String[] args) {
        int result;
        String repeat;
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("Select an option 1.Add  2.Sub ");
            int number= sc.nextInt();
            System.out.println("Enter the first numbers");
            int n1= sc.nextInt();
            System.out.println("Enter the second numbers");
            int n2= sc.nextInt();

            if(number==1){
                result=n1+n2;
                System.out.println("Add result is:"+ result);
            }else{
                result=n1-n2;
                System.out.println("Sub result is:"+ result);
            }
            System.out.println("Do you want to continue? If yes Press Y or y");
            repeat=sc.next();
        } while (repeat.toUpperCase().equals("Y"));



    }
}
