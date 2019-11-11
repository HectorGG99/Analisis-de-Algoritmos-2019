package MochilaDinamica;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Hector GG
 */

public class Item {
    private double beneficio;
    private int peso;

    public Item(double valor, int peso) {
        this.beneficio = valor;
        this.peso = peso;
    }

    public double getValor() {
        return beneficio;
    }

    public void setValor(double valor) {
        this.beneficio = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        String aux ="";
        aux+=this.peso+","+this.beneficio;
        return aux;
    }
        
    public static ArrayList<Item> generarItems(int n, int ben, int peso){
        ArrayList<Item> items= new ArrayList<>();
        for(int i =0; i<n; i++){
             Random ranPeso = new Random();
             Random ranBen = new Random();
             Item it= new Item(ranBen.nextInt(ben)+1,ranPeso.nextInt(peso)+1);
             items.add(it);
        }
        return items;
    }
    
}