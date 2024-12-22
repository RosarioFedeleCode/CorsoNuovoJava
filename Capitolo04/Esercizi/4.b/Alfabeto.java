public class Alfabeto {
    // Versione 1
    /*
    public static void main (String args[]) {
        char lettera = 'a';
        
        do {
            System.out.println(lettera);
            lettera++;
        } while(lettera <= 'z');
    }
    */
    
    // Versione Libro
    public static void main (String args[]) {
        char lettera = 'a';
        
        for(int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            System.out.println(c);
        }
    } 
}
