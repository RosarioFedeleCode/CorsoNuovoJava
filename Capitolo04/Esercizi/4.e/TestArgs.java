public class TestArgs {
    public static void main(String args[]) {
        // Versione 1
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        
        // Versione Libro
        if (args.length == 1) {
            System.out.println(args[0]);
        } else {
            System.out.println("Specificare un solo valore da riga di comando");
        }
    }
}