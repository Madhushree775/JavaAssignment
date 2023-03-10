
public class Question6 {
    public static void main(String[] args) {
String gender = args[0];
int age = Integer.parseInt(args[1]);
System.out.println("age" + age + " gender" + gender);
float Interest;
        if(gender.equals("Female") && age>0 && age<58){
            System.out.println("Interest is 8.2%");
        }else if(gender.equals("Male") && age>0 && age<=60) {
            System.out.println("Interest is 9.2%");
        }else if(gender.equals("Female") && age>59 && age<120) {
            System.out.println("Interest is 7.6%");
        } else{
            System.out.println("Interest is 8.3%");
        }
    }

}
