import java.util.Scanner;
public class temperatura {
    public static void main (String [] args){
		System.out.print("Introduzca la temperatura: ");
        Scanner temperatura =new Scanner(System.in);
        int temp = temperatura.nextInt();
        System.out.print("La temperatura es de: ");
        if (temp>0){
            System.out.print(temp + " C positiva");
        }else{
            System.out.print(temp + " C bajo cero");}
    }
}


