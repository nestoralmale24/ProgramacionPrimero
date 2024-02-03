import java.util.Scanner;
public class circulo1 {
    public static void main(String[] args) {
        int pi= (int) Math.PI;
        System.out.println("Escriba el radio");
        Scanner lectura =new Scanner(System.in);
        int r = lectura.nextInt();
        int c=2*pi*r;
        int a=pi*r^2;
        System.out.println("El resultado del área es:"+a);
        System.out.println("El resultado de la circunferencia es:"+c);
    }
}