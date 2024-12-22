public class Principale {
    public static void main(String args[]) {
        Persona persona1 = new Persona();
        persona1.nome = "Rosario";
        persona1.cognome = "Fedele";
        persona1.eta = 34;
        System.out.println(persona1.dettagli());
        
        Persona persona2 = new Persona();
        persona2.nome = "Laura";
        persona2.cognome = "Sala";
        persona2.eta = 33;
        System.out.println(persona2.dettagli());
        
        Persona persona3 = persona1;
        System.out.println(persona3.dettagli());
    }
}
