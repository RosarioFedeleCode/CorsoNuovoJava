public class CalcolatriceSemplificata {
    public double somma(double addendo1, double addendo2) {
        return addendo1 + addendo2;
    }
    
    public double sottrazione(double minuendo, double sottraendo) {
        return minuendo - sottraendo;
    }
    
    public double moltiplicazione(double fattore1, double fattore2) {
        return fattore1 * fattore2;
    }
    
    public double divisione(double dividendo, double divisore) {
        return dividendo / divisore;
    }
    
    public double modulo(double dividendo, double divisore) {
        return dividendo % divisore;
    }
    
    public double maggiore(double operando1, double operando2) {
        return operando1 > operando2 ? operando1 : operando2;
    }
    
    public double minore(double operando1, double operando2) {
        return operando1 < operando2 ? operando1 : operando2;
    }
    
    public double media(double operando1, double operando2) {
        return (operando1 + operando2)/2;
    }
}