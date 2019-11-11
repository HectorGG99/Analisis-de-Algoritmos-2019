/*ESTE ES EL CHIDO
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2020.pkg1;

import java.util.ArrayList;
import ordenamiento.Fibonaccis;

public class AnalisisDeAlgoritmos20201 {

    public static void main(String[] args) {     
        double ti= System.currentTimeMillis();
        long fib= Fibonaccis.fiboRecursivo(100);
        double tf= System.currentTimeMillis();
        System.out.println("Recursivo: "+(tf-ti));
        System.out.println(fib);
        
        double TI= System.currentTimeMillis();
        fib=Fibonaccis.fiboRecursivoDinamico(100);
        double TF=System.currentTimeMillis();
        System.out.println("Dinamico: "+(TF-TI));
        System.out.println(fib);
        
        
//        
//        Burbuja  b = new Burbuja();
//        BurbujaOptimizado  b1 = new BurbujaOptimizado();
//        InsertSort s = new InsertSort();
//        MergeSort ms= new MergeSort();
//        PruebaQuickSort pq = new PruebaQuickSort();
//        //QuickSort q=new QuickSort();
//        //Prueba p=new Prueba();
//        ArrayList<AlgoritmoOrdenamiento> lista = new ArrayList<>();
//       lista.add(b);
//       lista.add(b1);
//        lista.add(ms);
//        lista.add(s);
//        lista.add(pq);
//        //lista.add(q);
//        //lista.add(p);
//        
//        Manager m= new Manager(lista);
//        m.ejecutaPrueba(5000, 23, 1000, true);
//        System.out.println();
//        
//       double[] prueba={5,4,3,2,1};
//       p.definirDatos(prueba);
//       p.ordenarDatos();
//       System.out.println();
    }
    
}
