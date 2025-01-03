import java.util.Scanner;

public class Esercizio4U {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        CalcolatriceSemplificata calcolatriceSemplificata = new CalcolatriceSemplificata();
        double operando1, operando2;
        char operazione;

        System.out.println("Digitare il primo operando: ");
        operando1 = keyboard.nextDouble();

        do {
            System.out.println("Selezionare un'operazione dal seguente elenco:");
            System.out.println("+) Somma");
            System.out.println("-) Sottrazione");
            System.out.println("*) Moltiplicazione");
            System.out.println("/) Divisione");
            System.out.println("%) Modulo");
            System.out.println(">) Maggiore");
            System.out.println("<) Minore");
            System.out.println("m) Media");

            operazione = keyboard.next().charAt(0);

            if (!(operazione == '+' ||
                  operazione == '-' ||
                  operazione == '*' ||
                  operazione == '/' ||
                  operazione == '%' ||
                  operazione == '>' ||
                  operazione == '<' ||
                  operazione == 'm')) 
            {
                System.out.println("Operazione non prevista!!! Inserire nuovamente");
            } else {
                break;
            }
        }while(true);
        
        System.out.println("Digitare il secondo operando: ");
        operando2 = keyboard.nextDouble();
        
        switch(operazione) {
            case '+':
                System.out.println(operando1 + " + " + operando2 + " = " + calcolatriceSemplificata.somma(operando1, operando2));   
                break;
            case '-':
                System.out.println(operando1 + " - " + operando2 + " = " + calcolatriceSemplificata.sottrazione(operando1 , operando2));
                break;
            case '*':
                System.out.println(operando1 + " x " + operando2 + " = " + calcolatriceSemplificata.moltiplicazione(operando1, operando2));
                break;
            case '/':
                System.out.println(operando1 + " : " + operando2 + " = " + calcolatriceSemplificata.divisione(operando1, operando2));
                break;
            case '%':
                System.out.println("Il resto della divisione tra " + operando1 + " e " + operando2 + " e' " + calcolatriceSemplificata.modulo(operando1, operando2));
                break;
            case '>': 
                System.out.println("Il massimo tra " + operando1 + " e " + operando2 + " e' " + calcolatriceSemplificata.maggiore(operando1, operando2));
                break;
            case '<':
                System.out.println("Il minimo tra " + operando1 + " e " + operando2 + " e' " + calcolatriceSemplificata.minore(operando1, operando2));
                break;
            case 'm':
                System.out.println("La media tra " + operando1 + " e " + operando2 + " e' " + calcolatriceSemplificata.media(operando1, operando2));
                break;
            }

        }
    }