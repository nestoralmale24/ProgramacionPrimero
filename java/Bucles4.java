public class Bucles4 {
    public static void main (String [] args) {
        if(args.length < 1){
            System.err.println("NO HAY ARGUMENTOS");
        }
        else{
        System.out.println ("Se han encontrado "+ args.length +" argumentos:");
        String FIN = "fin";
        int i = 0 ;
        int p = 1;
        do {
            System.out.println(p + ")" + args[i]);
            i++;
            p++;
        }
        while (i < args.length);{
                i++;
                p++;
            System.out.println(FIN);
        }   
    }
}
}