public class Nazione {
    public String nome;
    public String capitale;
    public int popolazione;
    
    public Nazione (String nome, String capitale, int popolazione) {
        this.nome = nome;
        this.capitale = capitale;
        this.popolazione = popolazione;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCapitale (String capitale) {
        this.capitale = capitale;
    }
    
    public String getCapitale() {
        return this.capitale;
    }
    
    public void setPopolazione (int popolazione) {
        this.popolazione = popolazione;
    }
    
    public int getPopolazione() {
        return this.popolazione;
    }
    
    public String toString () {
        return "Descrizione della Nazione:\nNome: " + getNome() + "\nCapitale: " + getCapitale() + "\nPopolazione: " + getPopolazione();
    }
}
