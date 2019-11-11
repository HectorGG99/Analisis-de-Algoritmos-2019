package Caballo;

public class mainCaballo {
    public static void main(String[] args) {
        
        Caballo horse = new Caballo(10,7,7);
       
        int moves = horse.recorrido();
        for (int i = 0; i < horse.getChessboard().length ; i++) {
            for (int j = 0; j < horse.getChessboard().length ; j++) {
                System.out.print(" | "+horse.getChessboard()[i][j]+"   ");
            }
            System.out.println(" ");
        }
        System.out.println("Llegó hasta el movimiento #"+moves);

    }
}
