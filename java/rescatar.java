import java.util.Scanner;
public class rescatar {
    public static void main(String[] args) {
        System.out.print("Introduzca su radio: ");
        Scanner lectura =new Scanner(System.in);
        int radio = lectura.nextInt();
        System.out.println("El resultado del area es:"+radio);
    }
}