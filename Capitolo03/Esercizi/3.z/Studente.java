public class Studente {
    public String nome, cognome, classe;
    
    public Studente (String nome, String cognome, String classe) {
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
    }
    
    public String toString() {
        return "Studente: " + nome + " " + cognome + "\nClasse " + classe;
    }
}
