import java.util.Scanner;

public class EsercizioW{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Quanti numeri vuoi inserire?");
        int size = keyboard.nextInt();
        
        double numbers[] = new double[size];
        
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numbers[i] = keyboard.nextDouble();
        }
        
        System.out.println("Quale operazione vuoi eseguire?");
        System.out.println("+) Somma");
        System.out.println("*) Moltiplicazione");
        System.out.println(">) Maggiore");
        System.out.println("<) Minore");
        
        String scelta = keyboard.next();
        
        StranaCalcolatrice stranaCalcolatrice = new StranaCalcolatrice();
        
        System.out.println(
        switch(scelta) {
            case "+" -> "La somma è " + stranaCalcolatrice.addizione(numbers);
            case "*" -> "Il prodotto è " + stranaCalcolatrice.moltiplicazione(numbers);
            case ">" -> "Il numero maggiore è " + stranaCalcolatrice.maggiore(numbers);
            case "<" -> "Il numero minore è " + stranaCalcolatrice.minore(numbers);
            default  -> "Scelta non disponibile!!!";
        });        
    }
}
