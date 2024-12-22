public class Semaforo {
    public String stato;
    
    public void cambiaColore(Colore colore) {
        stato = switch(colore) {
            case VERDE  -> "La luce � verde";
            case GIALLO -> "La luce � gialla"; 
            case ROSSO -> "La luce � rossa"; 
            default -> "Caso imprevisto";
        };
    }
    
    public void stampaStato() {
        System.out.println(stato);
    }
}
