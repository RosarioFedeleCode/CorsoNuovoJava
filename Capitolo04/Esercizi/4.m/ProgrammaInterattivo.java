import java.util.Scanner;

public class ProgrammaInterattivo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        System.out.println("Digita qualcosa e batti enter, oppure scrivi \"fine\" per terminare il programma");
        while(!(stringa = scanner.next()).equals("fine")) {
            stringa = moderaStringa(stringa);
            System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
        };
        System.out.println("Fine programma!");
    }
    
    private static String moderaStringa(String stringa) {
        return switch(stringa.toLowerCase()){
          case "accipicchiolina", "perbacco", "stupidino", "giulivo", "giocondo", "perdindirindina" -> "CENSURATA!";
          default -> stringa;
        };
    }
}
