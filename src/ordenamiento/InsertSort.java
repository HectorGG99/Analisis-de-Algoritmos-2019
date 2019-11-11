package ordenamiento;
/*
Hector agosto 2019 
*/

public class InsertSort implements  AlgoritmoOrdenamiento {
    private double[] arreglo;
    @Override
    public void definirDatos(double[] arreglo) {
        this.arreglo= arreglo;
    }

    @Override
    public double ordenarDatos() {
        int pos;
        double aux;
        //Tiempo inicial
        double ti=System.currentTimeMillis();
        //Ordenamos
        for(int i= 0; i<this.arreglo.length; i++){
            pos=i;
            aux= this.arreglo[i];
            while((pos>0)&&(this.arreglo[pos-1]>aux)){
                this.arreglo[pos]= this.arreglo[pos-1];
                pos--;
            }
            this.arreglo[pos]=aux;
        }
        //Tiempo Final
        double tf=System.currentTimeMillis();

        //Retornamos diferencia de tiempo
        return tf-ti;
    }
}
