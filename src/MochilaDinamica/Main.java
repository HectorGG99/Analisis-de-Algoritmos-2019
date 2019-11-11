package MochilaDinamica;
/**
 *
 * @author Hector GG
 */
public class Main {
    
    public static void main(String aegs[]){
    Main.mochila();
    }
    
    public static void mochila(){
        Mochila backpack = new Mochila(Item.generarItems(30,150,150),200);
        backpack.buscarSolucion();
    }
}
