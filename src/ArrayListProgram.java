//Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store
//        even numbers from 2 to N, where N is a integer which is passed as a parameter to the
//        method saveEvenNumbers().
//        The method should return the ArrayList (A1) created. In the same class create a method
//        printEvenNumbers()which iterates through the arrayList A1 in step 1, and It should
//        multiply each number with 2 and display it in format 4,8,12....2*N. and add these
//        numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
//        Create a method printEvenNumber(int N) parameter is a number N. This method should
//        search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it should
//        return the Number else return zero.Hint: Use instance variable for storing the ArrayList
//        A1 and A2. NOTE: You can test the methods using a main method.

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

    List<Integer> saveEvenNumbers(int N){
        List<Integer> al=new ArrayList<Integer>();
        for(int i=2;i<=N;i++){
            if(i%2==0){
                al.add(i);
            }
        }
        System.out.println(al);
       return al;
    }




      List<Integer>  printEvenNumbers(int N){
        List<Integer> al2=saveEvenNumbers(N);

       for(int j=0; j < al2.size(); j++){
           al2.set(j, 2 * al2.get(j));
       }
        System.out.println(al2);
        return al2;
    }



     int printEvenNumber(int N){
        List<Integer> al3=saveEvenNumbers(N);
        return al3.contains(N) ? N : 0;


    }
    public static void main(String[] args) {
        ArrayListProgram alp = new ArrayListProgram();
        List<Integer> l2 =   alp.printEvenNumbers(40);
        System.out.println(alp.printEvenNumber(39));
    }
}


