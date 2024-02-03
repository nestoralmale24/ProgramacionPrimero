public class Secuencia2 {
    public static void main (String[]args){
        int VARIABLES = 10;
        int a = 1;
        int i= 0;
        
        for( String c: args){
            if(args.length < VARIABLES){
                System.out.println("TODAS SON CORRECTAS");
            }
            if (args.length >= VARIABLES){
                System.out.println("TODAS SON ");
            }
        }
    }
}