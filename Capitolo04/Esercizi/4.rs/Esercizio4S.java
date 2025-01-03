public class Esercizio4S {
    private static int matrice[][] = {
        {1, 7, 3, 9, 5, 3},
        {6, 2, 3},
        {7, 5, 1, 4, 0},
        {1, 0, 2, 9, 6, 3, 7, 8, 4}
    };

    public static void main(String args[]) {
        int numero, riga = -1, colonna = -1;
        boolean isNumero;

        if(args.length == 0) {
            System.out.println("Non e' stato inserito nessun argomento");
        } else {
            isNumero = true;
            for(int k = 0; k < args[0].length(); k++) {
                if(args[0].charAt(k) < '0' || args[0].charAt(k) > '9') {
                    isNumero = false;
                    break;
                }
            }
            if(!isNumero) {
                System.out.println("Non e' stato inserito un numero");
            } else {
                numero = Integer.parseInt(args[0]);
                if((numero >= 0) && (numero <= 9)) {
                    for (int i = 0; i < matrice.length; i++) {
                        for (int j = 0; j < matrice[i].length; j++) {
                            if(matrice[i][j] == numero) {
                                riga = i;
                                colonna = j;
                                break;
                            }
                        }

                        if((riga > -1) && (colonna > -1)) {
                            System.out.println("Il numero si trova a riga " + (riga + 1) + " e colonna " + (colonna + 1) + ".");
                            break;
                        }
                    }
                } else {
                    System.out.println("Non e' stato inserito un numero compreso tra 0  e 9!");
                }
            }
        }
    }
}