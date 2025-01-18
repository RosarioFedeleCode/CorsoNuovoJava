public class StranaCalcolatrice {
    public double addizione (double[] operands) {
        double somma = 0.0;
       
        for(double operand : operands) {
            somma += operand;
        }
        
        return somma;
    }
    
    public double moltiplicazione (double[] operands) {
        double prodotto = operands[0];
       
        for(int i = 1; i < operands.length; i++) {
            prodotto *= operands[i];
        }
        
        return prodotto;
    }
    
    public double maggiore (double[] nums) {
        double maggiore = nums[0];
        
        for(double num : nums){
            if (num > maggiore)
                maggiore = num;
        }
        
        return maggiore;
    }
    
    public double minore (double[] nums) {
        double minore = nums[0];
        
        for(double num : nums){
            if (num < minore)
                minore = num;
        }
        
        return minore;
    }
}