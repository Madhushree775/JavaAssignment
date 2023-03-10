public class Commandlineargs {

    public static void main(String args[]){

        if(args.length >0){
            System.out.println("The command line"
                    + " arguments are:");
            for(int i=0; i< args.length; i++)
            {
                System.out.print(args[i]);
                if(i < args.length - 1)
                    System.out.print(",");
            }

        }else{
            System.out.println("No Values");
        }
    }
}
