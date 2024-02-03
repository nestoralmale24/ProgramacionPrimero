public class Bucles{
    public static void main(String[] args) {
        System.out.println("Se han recibido"+ " " + args.length+ " " +"argumentos: ");
        String FIN= "fin";
        int i= 0;
        int p= 1;

        while(i < args.length && !args[i].equals(FIN)) {
            System.out.println(p+ ")" + args[i]);
            i++;
            p++;
        }
        System.out.println("\"fin\"estaba en la posicion nº " +p);
    }
}