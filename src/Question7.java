
//Write a program to convert from upper case to lower case and vice versa of an alphabet
//        and print the old character and new character

import java.util.Scanner;

public class Question7 {
    public static void main (String[] args)
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character:");
        char a=s.next().charAt(0);
        char b;
        if(Character.isLowerCase(a))
            b= Character.toUpperCase(a);
        else
            b= Character.toLowerCase(a);
        System.out.println(a+"->"+b);

    }


}
