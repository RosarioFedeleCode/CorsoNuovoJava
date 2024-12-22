public class Esercizio2Z {
    public static void main(String args[]) {
        Nazione italia = new Nazione("Italia", new Citta("Roma"), 60_000_000);
        //italia.nome = "Italia";
        
        //Citta roma = new Citta("Roma");
        //roma.nome = "Roma";
        //italia.capitale = roma;
        
        System.out.println("La capitale dell' " + italia.nome + " è " + italia.capitale.nome);
    }
}
