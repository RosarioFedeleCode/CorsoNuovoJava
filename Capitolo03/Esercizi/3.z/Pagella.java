import java.util.Arrays;

public class Pagella {
    public Studente studente;
    public String [][] tabellaVoti; 
    public String materie [];
    public int voti [];
    public String giudizi [];
    
    public Pagella(Studente studente, String [][] tabellaVoti) {
        this.studente = studente;
        this.tabellaVoti = tabellaVoti;
    }
    
    public void stampaPagella() {
        System.out.println(studente.toString());
        System.out.println(Arrays.toString(tabellaVoti[0])); 
        System.out.println(Arrays.toString(tabellaVoti[1]));
        System.out.println(Arrays.toString(tabellaVoti[2]));
        System.out.println(Arrays.toString(tabellaVoti[3]));
        System.out.println(Arrays.toString(tabellaVoti[4]));
        System.out.println(Arrays.toString(tabellaVoti[5]));
        System.out.println(Arrays.toString(tabellaVoti[6]));
    }
}