public class TavolaPitagorica {
    public static void main(String args[]){
        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 10; j++){
                if ((i == 0) && (j == 0)){
                    System.out.print("X");
                } else if (i == 0) {
                    System.out.print(j);
                } else if (j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(i * j);
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
