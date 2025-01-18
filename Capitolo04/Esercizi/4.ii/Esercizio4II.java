public class Esercizio4II {
    public static void main(String args[]) {
        char alfabeto [] = new char[26];
        
        for(int i = 0; i < alfabeto.length; i++){
            alfabeto[i] = (char) ('a' + i);
        }
        
        // Versione Libro
        /*
        for (char c = 'a'; c <= 'z'; c++, i++) {
           alfabeto[i] = (char)c;
        }
        */
        
        System.out.println(alfabeto);
    }
}
