public class Bucles3{
    public static void main(String[] args) {
        int i = 0;
        for( String a: args){
            System.out.println(i+ ")" + args[i]);
            i++;
        }
    }
}