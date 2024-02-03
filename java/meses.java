import java.util.Scanner;
public class meses{
	public static void main (String[]args){
        System.out.print("Introduzca numero de mes: ");
        Scanner scan =new Scanner(System.in);
		int mes = scan.nextInt();
		switch(mes){
			case 1:
				System.out.println("Dias de mes"+ " " +mes + ": 31");
				break;
			case 3:
				System.out.println("Dias de mes"+ " " +mes + ": 31");
				break;
			case 5:
				System.out.println("Dias de mes"+ " " +mes + ": 31");
				break;
			case 7:
				System.out.println("Dias de mes"+ " " +mes + ": 31");
				break;
			case 8:
				System.out.println("Dias de mes"+ " " +mes + ": 31");
				break;
			case 10:
				System.out.println("Dias de mes"+ " " +mes + ": 31");
				break;
			case 12:
				System.out.println("Dias de mes"+ " " +mes + ": 31");
				break;
			case 4:
				System.out.println("Dias de mes"+ " " +mes + ": 30");
				break;
			case 6:
				System.out.println("Dias de mes"+ " " +mes + ": 30");
				break;
			case 9:
				System.out.println("Dias de mes" +mes + ": 30");
				break;
			case 11:
				System.out.println("Dias de mes"+ " " +mes + ": 30");
				break;
			case 2:
				System.out.println("Dias de mes"+ " " +mes + ": 28, 29 o tu sabras");
				break;	
			default:
				System.out.println("Prueba con otro numero");
		}
}
}
