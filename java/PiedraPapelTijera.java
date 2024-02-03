import java.util.Scanner;
 
public class PiedraPapelTijera
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("BIENVENIDO AL PIEDRA, PAPEL O TIJERA (pulse enter para empezar)");
        teclado.nextLine();
        System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera, 4=Salir]: ");
        int seleccion = teclado.nextInt();
        
        int seleccionCompu = (int)(Math.random() * 3) + 1;
 
        System.out.print("El ordenador ha escogido: ");
        switch ( seleccionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( seleccion )
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Usted gana!"); break;
                   case 3: System.out.println("El ordenador gana!"); break;
                   case 4: exit(); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( seleccion )
                {
                   case 1: System.out.println("El ordenador gana!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Usted gana!"); break;
                   case 4: exit(); break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( seleccion )
                {
                   case 1: System.out.println("Usted gana!"); break;
                   case 2: System.out.println("El ordenador gana"); break;
                   case 3: System.out.println("Empate!"); break;
                   case 4: exit(); break;
                }
                break; 
        }
    } 
    private static void exit() {
    }
}