public class StampaContatti {
        public static void main(String args[]) {
        /*
        Contatto contatto1 = new Contatto("Rosario Fedele", "Via Walter Valdi, 6, Cavenago di Brianza, MB, 20873", "346 65 18 322");
        Contatto contatto2 = new Contatto("Laura Sala", "Via Walter Valdi, 6, Cavenago di Brianza, MB, 20873", "320 30 18 180");
        */
        var rubrica = new Rubrica();
        
        System.out.println("Elenco Contatti");
        System.out.println();
        rubrica.contatti[0].stampaDettagli();
        System.out.println();
        rubrica.contatti[1].stampaDettagli();
        System.out.println();
        rubrica.contatti[2].stampaDettagli();
    }
}