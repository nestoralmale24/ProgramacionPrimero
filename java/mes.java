public class mes{
    public static void main(String[] args){
    if (args.length == 1){
        int mes = Integer.valueOf(args[0]);
        if (mes < 1 || mes > 12){
            System.err.println(mes + "no es un mes valido");
        } else {
            int dias = calculaDias(mes);
            System.out.println("El mes "+ " "+ mes+ " " + "tiene "+ dias +" dias");
            
        } //if mes
    } //  if args
    
    }
    private static int calculaDias(int mes){
        int dias;
        switch (mes){
            case 2:
            dias = 28;
            break;
            case 4: case 6: case 9: case 11:
            dias= 30;
            break;
            default:
            dias = 31;
            break;
        }// swich
        return dias;
    }//  calculo dias
}