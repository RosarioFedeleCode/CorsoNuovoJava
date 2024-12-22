public class Contatto {
    public String nome;
    public String indirizzo;
    public String numeroDiTelefono;
    
    public Contatto (String nome, String numeroDiTelefono) {
        this.nome = nome;
        this.numeroDiTelefono = numeroDiTelefono;
    }
    
    public Contatto(String nome, String indirizzo, String numeroDiTelefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroDiTelefono = numeroDiTelefono;
    }
    
    public String toString() {
        return "Nome: " + nome + "\nIndirizzo: " + indirizzo + "\nNumero Di Telefono: " + numeroDiTelefono;
    }
    
    public void stampaDettagli() {
        System.out.println(this.toString());
    }
}