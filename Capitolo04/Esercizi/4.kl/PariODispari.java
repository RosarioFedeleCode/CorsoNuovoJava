import java.util.Random;

public class PariODispari{
    public String dammiPariODispari() {
        Random randomGenerator = new Random();
        
        /*
        if (randomGenerator.nextInt() % 2 == 0){
            return "Pari"; 
        } else {
            return "Dispari";
        }
        */
        
        return randomGenerator.nextInt() % 2 == 0 ? "Pari" : "Dispari";
    }
}
