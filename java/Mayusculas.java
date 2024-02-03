public class Mayusculas{
    private static int maximo = 5; static int minimo = 0; static String args;
    static String a = args;
    public static void main (String[]args){
        if (args.length < maximo) {

            System.out.println (a.toUpperCase());

        } else if (args.length > maximo) {

            System.out.println (a.toLowerCase());
    }
}
}