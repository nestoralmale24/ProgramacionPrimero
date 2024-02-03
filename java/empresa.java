import java.util.Scanner;
public class empresa{

    public static void main(String[] args) {
		//PERSONAS__________________________________________________________
        System.out.print("Introduzca numero de clientes: ");
        Scanner clientes =new Scanner(System.in);
		int c = clientes.nextInt();

		System.out.print("Introduzca numero de empleados: ");
        Scanner empleados =new Scanner(System.in);
		int e = empleados.nextInt();
		
		int p = c+e;
        System.out.println("El total de personas es:"+p);
		
		//MUEBLES_____________________________________________________________
		System.out.print("Introduzca numero de sillas: ");
        Scanner sillas =new Scanner(System.in);
		int s = sillas.nextInt();

		
		System.out.print("Introduzca numero de mesas: ");
        Scanner mesas =new Scanner(System.in);
		int m = mesas.nextInt();
		
		int mo= m+s;
        System.out.println("El total de personas es:"+mo);
		
		//EXPEDIENTES_____________________________________________________________
		System.out.print("Introduzca numero de contratos: ");
        Scanner contratos =new Scanner(System.in);
		int co = contratos.nextInt();

		
		System.out.print("Introduzca numero de reclamaciones: ");
        Scanner reclamaciones =new Scanner(System.in);
		int r = reclamaciones.nextInt();
		
		int ex= r+co;
		System.out.println("El total de reclamaciones es:"+ex);
		
		//TOTAL___________________________________________________________________
		System.out.println("En la empresa hay " +mo + " muebles, "+p + " personas, y "  +ex + " reclamaciones");
    }
}
	