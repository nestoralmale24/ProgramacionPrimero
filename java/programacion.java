import java.util.Scanner;
public class programacion {
    public static void main(String[] args) {
        System.out.print("Introduzca un valor: ");
        Scanner lectura =new Scanner(System.in);
		
		
        int valor = args.length-1;
        System.out.println("El ultimo valor introducido es:"+valor);
    }
}