import java.util.Scanner;

public class Esercizio4Q {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int giorni = 0, minuti = 0;
        final int ORE_GIORNO = 24, MINUTI_ORA = 60;
        
        System.out.println("Digita il numero di giorni passati dall'ultima vacanza");
        giorni = keyboard.nextInt();
        System.out.println("Hai digitato " + giorni + " giorni!");
        
        minuti = giorni * (ORE_GIORNO * MINUTI_ORA);
        System.out.println("Quindi sono passati " + minuti + " minuti!");
    }
}
