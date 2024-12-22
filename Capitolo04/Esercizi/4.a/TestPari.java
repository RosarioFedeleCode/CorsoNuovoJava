public class TestPari {
    // Versione 1
    /*
    public static void main(String args[]) {
        int i = 1, cont = 0;
        while(true) {
            if(i % 2 == 0) {
                System.out.println(i);
                cont++;
            }
            
            if(cont == 5) {
                break;
            }
            
            i++;
        }
    }
    */
    
    // Versione Libro
    public static void main(String args[]) {
        int i = 0;
        while(true) {
            i++;
            if(i > 10) {
                break;
            }
            
            if((i % 2) != 0) {
                continue;
            }
            
            System.out.println(i);
        }
    }
}
