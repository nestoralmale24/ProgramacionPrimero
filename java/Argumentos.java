public class Argumentos {
    private static int maximo = 5; static int minimo = 0;
    public static void main (String[]args){
        if (args.length == minimo) {

            System.err.println ("No ha escrito argumento para al ejecutar el codigo");

        } else if (args.length > maximo) {

            System.err.println ("ha escrito demasiados argumentos");

        } else if (args.length > minimo){
            
            System.out.println("Hay " +args.length + " argumentos");
    }
}
}