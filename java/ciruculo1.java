import java.util.Scanner;
public class ciruculo1 {
    public static void main(String[] args) {
        int pi= (int) Math.PI;
        System.out.print("Introduzca su radio: ");
        Scanner lectura =new Scanner(System.in);
        int r = lectura.nextInt();
        int c=2*pi*r;
        int a=pi*r^2;
        System.out.println("El resultado del area es:"+a);
        System.out.println("El resultado de la circunferencia es:"+c);
    }
}