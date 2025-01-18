public class Rubrica {
    public Contatto contatti[];
    
    public Rubrica() {
        contatti = new Contatto []  {
            new Contatto("Rosario Fedele", "Via Walter Valdi, 6, Cavenago di Brianza, MB, 20873", "346 65 18 322"),
            new Contatto("Laura Sala", "Via Walter Valdi, 6, Cavenago di Brianza, MB, 20873", "320 30 18 180"),
            new Contatto("Laura Fedele", "Via Walter Valdi, 6, Cavenago di Brianza, MB, 20873", "320 30 18 180")
        };
    }
    
    public Contatto[] cercaContattiPerNome(String nome){
        Contatto contattiTrovati[] = new Contatto[contatti.length];
        int i = 0;
        
        for(Contatto contatto : contatti) {
            if(contatto.nome.contains(nome)){
                contattiTrovati[i] = contatto;
                i++;
            }
        }
        
        return contattiTrovati;
    }
}