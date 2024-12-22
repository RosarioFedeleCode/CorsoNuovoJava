public class Multipli3 {
    public static void main(String args[]) {
        final String STR = "Numero multiplo di 3 = ";
        int i = 0, count = 0;
        
        while(count < 10){
            if((i > 0) && (i % 3 == 0)) {
                System.out.println(STR + i);
                count++;
            }
            i++;
        }
    }
}