import java.util.Scanner;

public class CalcolaAreaTriangolo {
    public static void main(String args[]) {
        Scanner tastiera = new Scanner(System.in);
        //double base = 3.8, altezza = 5.4;
        double base, altezza, area;
        System.out.println("Inserire la base di un triangolo: ");
        base = tastiera.nextDouble();
        System.out.println("Inserire l'altezza di un triangolo: ");
        altezza = tastiera.nextDouble();
        area = (base * altezza)/2;
        
        System.out.println("Area del triangolo " + area);
    }
}
