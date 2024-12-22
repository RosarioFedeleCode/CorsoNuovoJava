public class Esercizio2V {
    public int somma2 (int n1, int n2) {
        return n1 + n2;
    }
    
    public int somma3 (int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    
    public int somma5 (int n1, int n2, int n3, int n4, int n5) {
        return n1 + n2 + n3 + n4 + n5;
    }
    
    public int somma10 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
    }
    
    //Giusto per testare
    public static void main(String args[]) {
        Esercizio2V es = new Esercizio2V();
        System.out.println(es.somma2(1,1));
        System.out.println(es.somma3(1,1,1));
        System.out.println(es.somma5(1,1,1,1,1));
        System.out.println(es.somma10(1,1,1,1,1,1,1,1,1,1));
    }
}