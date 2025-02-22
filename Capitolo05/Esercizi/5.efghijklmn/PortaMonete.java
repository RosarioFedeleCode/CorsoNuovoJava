/**
 * Astrae il concetto di portamonete che può contenere un numero limitato di
 * monete.
 * 
 * @author Rosario Fedele
 */
public class PortaMonete {
    /**
     * Un array che contiene un numero limitato di monete.
     */
    private final Moneta[] monete = new Moneta[10];
    
    /**
     * Crea un oggetto portamonete vuoto
     * 
     */
    public PortaMonete(){
    }
    
    /**
     * Crea un oggetto portamonete contenente monete i cui valori sono 
     * specificati dal varargs valori. 
     * 
     * @param valori
     *          un varargs di valori di monete.
     */
    public PortaMonete(int... valori){
        setMonete(valori);
    }
    
    /**
     * Restituisce il valore della variabile d'istanza monete.
     * 
     * @return 
     *          il valore della variabile d'istanza monete.
     */
    public Moneta[] getMonete() {
        return monete;
    }
    
    /**
     * Imposta la variabile d'istanza monete.
     *
     * @param varargs valori delle monete da inserire nel portamonete
     */
    public void setMonete(int... valori) {
        for(int i = 0; i < valori.length; i++){
            if(i >= monete.length) {
                System.out.println("Raggiunta capienza massima del portamonete...");
                break;
            }
            
            monete[i] = new Moneta(valori[i]);
        }
    }

    /**
     * Aggiunge una moneta al portamonete. Se questo è pieno la moneta non è 
     * aggiunta e viene stampato un errore significativo.
     * 
     * @param moneta 
     *          la moneta da aggiungere.
     */
    public void aggiungi(Moneta moneta) {
        System.out.println("Proviamo ad aggiungere una " +
          moneta.getDescrizione());
          
        int indice = primoIndiceLibero();
        
        if (indice == -1) {
            System.out.println("Portamonete pieno! La moneta " +
              moneta.getDescrizione() + " non è stata aggiunta...");
        } else {
            monete[indice] = moneta;
            System.out.println("E' stata aggiunta una " +
              moneta.getDescrizione());
        }
        
    }
    
    /**
     * Restituisce il primo indice libero nell'array delle monete o -1 se il
     * portamonete è pieno.
     * 
     * @return 
     *          il primo indice libero nell'array delle monete o -1 se il
     *          portamonete è pieno.
     */
    private int primoIndiceLibero() {
        int indice = -1;
        for (int i = 0; i < monete.length; i++) {
            if (monete[i] == null) {
                indice = i;
                break;
            }
        }
        return indice;
    }
    
    /**
     * Stampa il contenuto del portamonete.
     */
     public void stato() {
         if (primoIndiceLibero() == 0) {
             System.out.println("Il portamonete e' vuoto...");
         } else {
             System.out.println("Il portamonete contiene: ");
             for(Moneta moneta : monete) {
                 if(moneta != null) {
                     System.out.println("Una " + moneta.getDescrizione());
                 }
             }
         }
     }
     
    /**
     * Esegue un prelievo della moneta specificata dal portamonete corrente. Nel
     * caso non sia presente la moneta specificata, un errore significativo 
     * verrà stampato e null verrà ritornato.
     * 
     * @param moneta
     *          la moneta da prelevare.
     * @return 
     *          la moneta trovata o null se non trovata.
     */
     public Moneta preleva(Moneta monetaDaPrelevare) {
         System.out.println("Proviamo a prelevare una " +
          monetaDaPrelevare.getDescrizione());
         
         Moneta monetaTrovata = null;
         
         if (primoIndiceLibero() == 0) {
             System.out.println("Il portamonete e' vuoto...");
         } else {
             int indice = primoIndiceMoneta(monetaDaPrelevare.getValore());
             
             if (indice == -1) {
                 System.out.println("La " + monetaDaPrelevare.getDescrizione() + " non è presente nel portamonete...");
             } else {
                 monetaTrovata = monete[indice];
                 monete[indice] = null;
                 System.out.println("Una " + monetaDaPrelevare.getDescrizione() + " e' stata prelevata");
             }
         }
         
         return monetaTrovata;
     }
     
    /**
     * Restituisce il primo indice corrispondente alla moneta del valore
     * specificato o -1 se non è presente una moneta del valore specificato.
     * 
     * @param valore 
     *          il valore della moneta da cercare.
     * @return 
     *          il primo indice nell'array della moneta del valore corrispondente al parametro valore o -1 se il
     *          la moneta non è presente.
     */
    private int primoIndiceMoneta(int valore) {
        int indice = -1;
        for (int i = 0; i < monete.length; i++) {
            if (monete[i].getValore() == valore) {
                indice = i;
                break;
            }
        }
        return indice;
    }
}
