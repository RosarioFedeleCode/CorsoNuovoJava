public class Multipli3 {
    public static void main(String args[]) {
        final String STR = "Numero multiplo di 3 = "; 
        for (int i = 0, count = 0; count < 10; i++){
            if( (i > 0) && (i % 3 == 0)) {
                System.out.println(STR + i);
                count++;
            }
        }
    }
}
