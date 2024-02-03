public class Bucles2 {
    public static void main (String [] args) {
        System.out.println ("Se han encontrado "+ args.length +" argumentos:");
        String FIN = "fin";
        int i = 0 ;
        int p = 1;
        do {
            System.out.println(p + ")" + args[i]);
            i++;
            p++;
        }
        while (i < args.length && !args[i].equals(FIN));
            System.out.println(p + ")" + args[i]);
    }
}