import java.util.Scanner;
public class Voluntario {
 
    public static void main(String[] args) {
         
        try (Scanner datos = new Scanner(System.in)) {
            System.out.println("Escriba un numero de columnas");
            int columnas=datos.nextInt();

            System.out.println("Escriba un numero de filas");
            int filas=datos.nextInt();

            int matriz[][] = new int[filas][columnas];

            System.out.println("Resultado: "); 
            for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[0].length; j++ ){
                    matriz[i][j]=i*i+j;
                    
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println(""); 
            }
        } 
    }
     
}