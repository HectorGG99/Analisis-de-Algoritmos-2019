package ordenamiento;

import java.util.ArrayList;

/*
Hector septiembre 2019 
*/

public class Prueba implements  AlgoritmoOrdenamiento {
    private int[] arreglo;
    private double[] arreglo1;
    
    public void definirDatos(int[] arreglo) {
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
    
    void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(A[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(A,j+1,der); // ordenamos subarray derecho
}

    @Override
    public void definirDatos(double[] arreglo) {
         this.arreglo1= arreglo;
    }
}
   
    




