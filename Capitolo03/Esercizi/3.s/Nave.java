public class Nave {
    public Auto autoArray[];
    int indice = 0;
    
    public Nave () {
        autoArray = new Auto[100];
    }
    
    public void caricaAuto (Auto auto) {
        autoArray[indice] = auto;
        System.out.println("Auto: " + auto.tipo + " caricata");
        indice++;
    }
}
