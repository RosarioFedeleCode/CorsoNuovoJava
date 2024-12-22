public class Libro {
    public String titolo;
    public String autore;
    public String editore;
    
    public Libro (String titolo, String autore, String editore) {
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
    }
    
    public void stampaDettagli() {
        System.out.println(titolo);
        System.out.println(autore);
        System.out.println(editore);
    }
}
