package ordenamiento;

import java.util.ArrayList;

public class Manager {
    private ArrayList<AlgoritmoOrdenamiento> metodos;
    
    public Manager(){
        this.metodos= new ArrayList<>();
    }

    public Manager(ArrayList<AlgoritmoOrdenamiento> metodos) {
        this.metodos = metodos;
    }
    
    public void ejecutarPrueba(double[] datos, boolean grafica){
        double tiempos[] = new double[metodos.size()];
        int p= 0;
        for (AlgoritmoOrdenamiento a:this.metodos){
            a.definirDatos(datos.clone());
            tiempos[p]= a.ordenarDatos();
            System.out.println(tiempos[p]);
            p++;
            
        }
        if (grafica){
            Grafica g= new Grafica("id Algoritmo","tiempo","Prueba basica de ordenamiento");
            g.agregarSerie(tiempos,"0");
            g.crearYmuestraGrafica();
        }
    }
    
    public void ejecutaPrueba(int pruebas, int rAumento, int rAletorio,boolean graficar){
        
        ArrayList<Double[]> tiemposTotales = new ArrayList<>();
        
        for(int x=0 ; x<this.metodos.size();x++)
            tiemposTotales.add(new Double[pruebas]);
        
        
        for (int p=0;p<pruebas;p++){
            double[] datos= Herramientas.generarArregloAleatorio((p*rAumento),rAletorio);
            for(int a=0;a<this.metodos.size();a++){
                AlgoritmoOrdenamiento aux = this.metodos.get(a);
                aux.definirDatos(datos.clone());
                tiemposTotales.get(a)[p]= aux.ordenarDatos();
            }
        }
        if (graficar){
            Grafica g= new Grafica("","tiempo","Prueba basica de ordenamiento");
            for(int m=0; m<tiemposTotales.size();m++){
                g.agregarSerie(tiemposTotales.get(m), ""+m);
                
            }
            g.crearYmuestraGrafica();
        }
    }
    
    
}
