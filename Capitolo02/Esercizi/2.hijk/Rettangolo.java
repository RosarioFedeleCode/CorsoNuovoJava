public class Rettangolo {
    public int base, altezza;
    public final int NUMERO_LATI_UGUALI = 2;
    
    public Rettangolo (int b, int h) {
        base = b;
        altezza = h;
    }
    
    public int perimetro () {
        return (base + altezza) * NUMERO_LATI_UGUALI;
    }
    
    public int area() {
        return base * altezza;
    }
    
    public String dammiDettagli() {
        return "Dettagli di questo Rettangolo\nBase      : " + base 
                                          + "\nAltezza   : " + altezza 
                                          + "\nPerimetro : " + perimetro()
                                          + "\nArea      : " + area();
    }
    
    public void stampaDettagli() {
        System.out.println(dammiDettagli());
        //System.out.println("Base     : " + base);
        //System.out.println("Altezza  : " + altezza);
        //System.out.println("Area     : " + area());
        //System.out.println("Perimetro: " + perimetro());
    }
}