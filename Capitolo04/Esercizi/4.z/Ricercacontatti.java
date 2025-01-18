import java.util.Scanner;

public class Ricercacontatti {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Rubrica rubrica = new Rubrica();
        
        System.out.println("Inserire il nome (o una parte di esso) da ricercare: ");
        String nomeRicerca = keyboard.nextLine();
        
        Contatto contattiTrovati[] = rubrica.cercaContattiPerNome(nomeRicerca);
       
        if(contattiTrovati[0] == null){
            System.out.println("La ricerca non ha prodotto risultati");
        }
        else 
        {
            for(Contatto contattoTrovato : contattiTrovati) {
                if(contattoTrovato != null)
                    contattoTrovato.stampaDettagli();
            }
        }
        
    }
}
