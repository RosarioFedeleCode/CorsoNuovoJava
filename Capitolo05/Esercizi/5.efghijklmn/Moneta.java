public class Moneta {
    /**
     * La valuta è una costante impostata al valore EURO.
     */
    public static final String VALUTA = "EURO";
    
    /**
     * Rappresenta il valore della moneta in centesimi.
     */
    private final int valore;
    
    /**
     * Costruttore che prende in input il valore della moneta.
     *
     * @param valore il valore della moneta.
     */
    public Moneta(int valore) {
        this.valore = valore;
        System.out.println("Creata una " + getDescrizione());
    }
    
    /**
     * Restituisce il valore della variabile d'istanza valore.
     * 
     * @return 
     *          il valore della variabile d'istanza valore.
     */
    public int getValore() {
        return valore;
    }
    
    /**
     * Imposta la variabile d'istanza valore.
     *
     * @param valore contiene il valore a cui deve essere impostato il valore
     * della variabile d'istanza valore.
     */
    /*
       Modifica per l'esercizio 5.f
    public void setValore(int valore) {
        this.valore = valore;
    }
    */
    
    public String getDescrizione() {
        return "moneta da " + formattaUnitaDiMisura(valore)
          + VALUTA;
    }
    
    private static String formattaUnitaDiMisura(int valore) {
        String stringaFormattata = " centesimi di ";
        
        if (valore > 99) {
            stringaFormattata = " ";
            valore /= 100;
        } else if (valore == 1) {
            stringaFormattata = " centesimo di ";
        }
        return valore + stringaFormattata;
    }
}