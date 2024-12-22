public class Esercizio3S {
    public static void main(String args[]) {
        Nave nave = new Nave();
        Auto auto1 = new Auto("Toyota Yaris");
        Auto auto2 = new Auto("VW Golf");
        Auto auto3 = new Auto("Lancia Y");
        
        nave.caricaAuto(auto1);
        nave.caricaAuto(auto2);
        nave.caricaAuto(auto3);
    }
}
