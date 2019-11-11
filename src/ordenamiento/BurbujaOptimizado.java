/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Hector GG
 */
public class BurbujaOptimizado implements AlgoritmoOrdenamiento {

    private double[] arreglo;
    
    public BurbujaOptimizado() {
        this.arreglo = null;
    }
      
    @Override
    public void definirDatos(double[] arreglo) {
       this.arreglo = arreglo;
    }

    @Override
    public double ordenarDatos() {
        // calcular cuando empieza 
        double ti = System.currentTimeMillis();
        // ordenamos
         final int N=arreglo.length;
                for(int i=N-1;i>0;i--){
                        for(int j=0;j<i;j++){
                                if(arreglo[j]>arreglo[j+1]){
                                        double temp=arreglo[j];
                                        arreglo[j]=arreglo[j+1];
                                        arreglo[j+1]=temp;
                                }
                        }
                        
                }
        // calculamos el tiempo cuando termina 
        double tf = System.currentTimeMillis();
        // calculamos el tiempo total
        return tf - ti;
    }
    
}


