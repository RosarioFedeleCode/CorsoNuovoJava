import java.util.Scanner;

public class GiocoTestaOCroce{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int vittorie = 0, sconfitte = 0;
        
        System.out.println("Indicare il numero di lanci da eseguire: ");
        int numeroLanci = keyboard.nextInt();
        String buffer = keyboard.nextLine();
        
        TestaOCroce moneta = new TestaOCroce();
        
        for(int i = 0; i < numeroLanci; i++) {
            System.out.println("Lancio " + (i + 1) + ") Testa O Croce?");
            String scelta = keyboard.nextLine();
            if(scelta.equalsIgnoreCase(moneta.dammiTestaOCroce())){
                vittorie++;
                System.out.println("Indovinato!!!");
            } else {
                sconfitte++;
                System.out.println("NON hai indovinato");
            }
        }
        
        if(vittorie >  sconfitte) {
            System.out.println("Hai Vinto!!!");
        } 
        else if (vittorie == sconfitte) {
            System.out.println("Hai Pareggiato!!!");
        } else {
            System.out.println("Hai Perso!!!");
        }
    }
}