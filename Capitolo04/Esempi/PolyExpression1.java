public class PolyExpression1 {
    public static void main(String args[]) {
        String integer = "2";
        var index = 
                switch(integer) {
                    case "1" -> {
                            byte b = 1;
                            yield b;
                    }
                    case "2" -> {
                            String s = "2";
                            yield s;
                    }
                    case "3" -> 3;
                    default -> -1;
                };
         System.out.println(index);
         System.out.println("Il tipo di index è: " + index.getClass().getName());
    }
}
