public class temperatura2 {
    public static void main(String [] args){
            int temp = Integer.valueOf(args[0]);
        System.out.println("La temperatura es de: ");
        if (temp>0){
            System.out.println(temp + " C positiva.");
        }else{
            System.out.println(temp + " C bajo cero.");}
    }


}

