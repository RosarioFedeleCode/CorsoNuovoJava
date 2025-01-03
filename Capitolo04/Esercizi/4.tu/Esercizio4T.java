public class Esercizio4T {
    public static void main(String args[]){
        CalcolatriceSemplificata calcolatriceSemplificata = new CalcolatriceSemplificata();
        System.out.println("42.7 + 47.8 = " + calcolatriceSemplificata.somma(42.7, 47.8));
        System.out.println("42.7 - 47.8 = " + calcolatriceSemplificata.sottrazione(42.7 , 42.8));
        System.out.println("42.7 x 47.8 = " + calcolatriceSemplificata.moltiplicazione(42.7, 47.8));
        System.out.println("42.7 : 47.8 = " + calcolatriceSemplificata.divisione(42.7, 47.8));
        System.out.println("il resto della divisione tra 42.7 e 47.8 è " + calcolatriceSemplificata.modulo(42.7, 47.8));
        System.out.println("Il massimo tra 42.7 e 47.8 è " + calcolatriceSemplificata.maggiore(42.7, 47.8));
        System.out.println("Il minimo tra 42.7 e 47.8 è " + calcolatriceSemplificata.minore(42.7, 47.8));
        System.out.println("La media tra 42.7 e 47.8 è " + calcolatriceSemplificata.media(42.7, 47.8));
    }
}