public class Quadrato {
    public int lato;
    public final int NUMERO_LATI = 4;

    public Quadrato(int l) {
        lato = l;
    }

    public int perimetro() {
        return lato * NUMERO_LATI;
    }

    public int area() {
        return lato * lato;
    }

    public String dammiDettagli() {
        return "Dettagli di questo Quadrato\nLato      : " + lato 
                                        + "\nPerimetro : " + perimetro()
                                        + "\nArea      : " + area();
    }
    
    public void stampaDettagli() {
        System.out.println(dammiDettagli());
        //System.out.println("Lato     : " + lato);
        //System.out.println("Area     : " + this.area());
        //System.out.println("Perimetro: " + this.perimetro());
    }
}