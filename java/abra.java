import java.util.Scanner;
public class abra{
    public static final String CLAVE = "abracadabra";
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String palabra;
        do{
            System.out.println("¡HOLA!, por favot, escribe" + CLAVE + ":");
            palabra = scanner.nextLine();
        }while(!palabra.equals(CLAVE));
        System.out.println("TU:" +palabra);
        System.out.println("YO:" +palabra);
    }
}