public class ceros{
public static void main (String args[]){
    int myNumber = 99;
    String cambiar = String.format("%%0%dd", 3);
    String formattedString = String.format(cambiar, myNumber);
    System.out.println(formattedString);
}
}