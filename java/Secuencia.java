import java.util.jar.Attributes.Name;

public class Secuencia {
    private static int VARIABLES = 5;
    public static void main (String[]args){
        int VARIABLES=5;
        for (int a=0;a < args.length; a++){
            String e=args[a];
        if (args[a].length()<= VARIABLES){
            System.out.println(e +" " +e +" " +e +" " +e);
        }
        else if(args[a].length() > VARIABLES){
            System.out.println(e +" " +e);
        }
        }
    }
}