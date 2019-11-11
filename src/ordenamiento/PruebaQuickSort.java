package ordenamiento;

import ordenamiento.AlgoritmoOrdenamiento;

/*
Hector septiembre 2019 
*/

public class PruebaQuickSort implements  AlgoritmoOrdenamiento {
    private double[] arreglo;
    @Override
    public void definirDatos(double[] arreglo) {
        this.arreglo= arreglo;
    }

    @Override
    public double ordenarDatos() {
        //Tiempo inicial
        double ti=System.currentTimeMillis();
        //Ordenamos
       quicksort(this.arreglo,0,this.arreglo.length-1);
        //Tiempo Final
        double tf=System.currentTimeMillis();

        //Retornamos diferencia de tiempo
        return tf-ti;
    }
    
    void quicksort(double vec[], int inicio, int fin) {

  if(inicio>=fin) return;
                double pivote=vec[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && vec[elemIzq]<pivote){
                                elemIzq++;
                        }
                        while(elemDer>inicio && vec[elemDer]>=pivote){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                double temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        double temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                quicksort(vec, inicio, elemDer-1);
                quicksort(vec, elemDer+1, fin);
}
   
    

}