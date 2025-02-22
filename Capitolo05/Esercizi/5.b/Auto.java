public class Auto {
    public String scuderia;
    public Pilota pilota;
    
    public Auto(String scuderia, Pilota pilota) {
        // impostare scuderia e pilota
        this.scuderia = scuderia;
        this.pilota = pilota;
    }
    
    public String getScuderia() {
        return scuderia;
    }
    
    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }
    
    public Pilota getPilota() {
        return pilota;
    }
    
    public void setPilota(Pilota pilota) {
        this.pilota = pilota;
    }
    
    public String dammiDettagli() {
        // restituire una stringa descrittiva dell'oggetto
        return getPilota().getNome() + ", " + getScuderia();
    }
}
