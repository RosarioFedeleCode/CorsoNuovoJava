public class TestRettangolo {
    public static void main (String args[]) {
        Rettangolo r1 = new Rettangolo(5, 6);
        Rettangolo r2 = new Rettangolo(8, 9);
        
        r1.stampaDettagli();
        //System.out.println("Perimetro Rettangolo1: " + r1.perimetro());
        //System.out.println("Area      Rettangolo1: " + r1.area());
        
        r2.stampaDettagli();
        //System.out.println("Perimetro Rettangolo2: " + r2.perimetro());
        //System.out.println("Area      Rettangolo2: " + r2.area());
    }
}