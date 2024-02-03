import java.util.Scanner;
public class fruta {
    public static void main(String[] args) {
		
        System.out.print("Introduzca numero de peras: ");
        Scanner peras =new Scanner(System.in);
		int p = peras.nextInt();

		
		System.out.print("Introduzca numero de manzana: ");
        Scanner manzanas =new Scanner(System.in);
		int m = manzanas.nextInt();
		
		int r= m+p;
		
		
        System.out.println("El total de fruta es: "+r);
    }
}