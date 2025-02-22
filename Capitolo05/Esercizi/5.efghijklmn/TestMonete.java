/**
 * Classe di test per le classi Moneta e PortaMonete.
 * 
 * @author Rosario Fedele
 */
public class TestMonete {
    public static void main(String args[]) {
        Moneta monetaDaUnCentesimo = new Moneta(1);
        Moneta monetaDaVentiCentesimi = new Moneta(20);
        Moneta monetaDaUnEuro = new Moneta(100);
        System.out.println("======================");
        // Creaiamo un portamonete con 11 monete
        PortaMonete portaMoneteInsufficiente  = new PortaMonete(2, 5, 100, 10, 50, 10, 100, 200, 10, 5, 2);
        System.out.println("======================");
        // Creaiamo un portamonete con 8 monete
        PortaMonete portaMonete  = new PortaMonete(2, 5, 100, 10, 50, 10, 100, 200);
        System.out.println("======================");
        portaMonete.stato();
        System.out.println("======================");
        // Aggiungiamo una moneta da 20 centesimi
        portaMonete.aggiungi(monetaDaVentiCentesimi);
        // Aggiungiamo la decima moneta da 1 centesimo.
        portaMonete.aggiungi(monetaDaUnCentesimo);
        // Aggiungiamo l'undicesima moneta (dovremmo ottenere un errore e la
        // moneta non sarà aggiunta)
        portaMonete.aggiungi(monetaDaUnEuro);
        System.out.println("======================");
        // Valutiamo lo stato del portamonete.
        portaMonete.stato();
        System.out.println("======================");
        // preleviamo 20 centesimi
        portaMonete.preleva(monetaDaVentiCentesimi);
        System.out.println("======================");
        // Aggiungiamo l'undicesima moneta
        portaMonete.aggiungi(monetaDaUnEuro);
        System.out.println("======================");
        portaMonete.stato();
        System.out.println("======================");
        //Cerchiamo una moneta non esistente (dovremmo ottenere una stampa di
        // errore)
        portaMonete.preleva(new Moneta(7));
        System.out.println("======================");
        // Creaiamo un portamonete vuoto
        PortaMonete portaMoneteVuoto  = new PortaMonete();
        portaMoneteVuoto.stato();
        System.out.println("======================");
        //Cerchiamo una moneta nel portamonete vuoto
        portaMoneteVuoto.preleva(monetaDaUnEuro);
        System.out.println("======================");
        portaMoneteVuoto.aggiungi(monetaDaUnEuro);
        System.out.println("======================");
        portaMoneteVuoto.stato();
        System.out.println("======================");
        portaMoneteVuoto.preleva(monetaDaUnEuro);
        System.out.println("======================");
        portaMoneteVuoto.stato();
        System.out.println("======================");
    }
}