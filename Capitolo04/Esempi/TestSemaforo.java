public class TestSemaforo {
    public static void main (String args[]) {
        Semaforo semaforo = new Semaforo();
        semaforo.cambiaColore(Colore.ROSSO);
        semaforo.stampaStato();
        semaforo.cambiaColore(Colore.GIALLO);
        semaforo.stampaStato();
        semaforo.cambiaColore(Colore.VERDE);
        semaforo.stampaStato();
        semaforo.cambiaColore(Colore.NERO);
        semaforo.stampaStato();
    }
}
