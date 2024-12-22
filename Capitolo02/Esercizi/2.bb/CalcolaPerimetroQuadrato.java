import java.util.Scanner;

public class CalcolaPerimetroQuadrato {
    public static void main(String args[]) {
        int lunghezzaLatoQuadrato = 17;
        int numeroLati = 4;
        
        int perimetroQuadrato = lunghezzaLatoQuadrato * numeroLati;
        
        System.out.println("Il perimetro del quadrato è " + perimetroQuadrato);
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserire la lunghezza del lato: ");
        lunghezzaLatoQuadrato = keyboard.nextInt();
        perimetroQuadrato = lunghezzaLatoQuadrato * numeroLati;
        System.out.println("Il perimetro del quadrato è " + perimetroQuadrato);
    }
}
