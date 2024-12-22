import java.util.Scanner;

public class SommaTreInteri {
    public static void main(String args[]) {
        System.out.println("Ciao, so sommare tre numeri interi.");
        System.out.println("Scrivi il primo valore e premi invio");
        Scanner keyboardScanner = new Scanner(System.in);
        int input1;
        input1 = keyboardScanner.nextInt();
        System.out.println("Scrivi il secondo valore e premi invio");
        int input2 = keyboardScanner.nextInt();
        System.out.println("Scrivi il terzo valore e premi invio");
        int input3 = keyboardScanner.nextInt();
        int risultato = input1 + input2 + input3;
        System.out.println("Il risultato è:");
        System.out.println(risultato);
    }
}