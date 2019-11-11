/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Hector
 */
public class EjerciciosGraficas {
    
    private int datos;

    public EjerciciosGraficas(int datos) {
        this.datos = datos;
    }
    
    public double[] n2(){
        double[] aux = new double[20];
        for(int x=0; x<datos; x++){
            aux[x] = x*x;
        }
        return aux;
        
    }
    public double[] n3(){
        double[] aux = new double[20];
        for(int x=0; x<datos; x++){
            aux[x] = x*x*x;
        }
        return aux;
        
    }
    public double[] n6(){
        double[] aux = new double[20];
        for(int x=0; x<datos; x++){
            aux[x] = x*x*x*x*x;
        }
        return aux;
        
    }
    public double[] dosnlogn(){
        double[] aux = new double[20];
        for(int x=0; x<datos; x++){
            aux[x] = 2*x*Math.log(x);
        }
        return aux;
        
    } 
    public double[] nlogn(){
        double[] aux = new double[20];
        for(int x=0; x<datos; x++){
            aux[x] = x*Math.log(x);
        }
        return aux;
        
    }
    
    
    public static void main(String[] args){
        EjerciciosGraficas g1= new EjerciciosGraficas(20);
        
        Grafica g= new Grafica("x","y","Graficas");
        g.agregarSerie(g1.n2(), "g1");
       // g.agregarSerie(g1.n3(), "g2");
       // g.agregarSerie(g1.n6(), "g3");
        g.agregarSerie(g1.nlogn(), "g4");
        g.agregarSerie(g1.dosnlogn(), "g5");
        g.crearYmuestraGrafica();
        
        
    }
}
