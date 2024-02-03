public class MA {
    private static final int maximo= 5;
        public static void main (String[] args) {
        for(String s :args) {
                if (s.length() < maximo ){
                    System.out.println(s.toUpperCase());
                    } else {
                     System.out.println(s.toLowerCase());
                    }
        }
     }
}