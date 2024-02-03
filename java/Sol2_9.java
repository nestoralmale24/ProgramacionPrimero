public class Sol2_9 {
    public static void main (String [] args){
        if (args.length ==1){
            int num = Integer.valueOf(args[0]);
            int res = 1;
            while (num > 0){
                res *= num;
                num --;
            }
            System.out.println("El resultado es " +res);
        }else{
            System.err.println("Necesito un argumento");
        }
    }
}