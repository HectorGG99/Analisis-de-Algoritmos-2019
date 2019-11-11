
package ordenamiento;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Grafica {
    // grafica
    private JFreeChart grafica;
    // coleccion de series
    private XYSeriesCollection series;
    private String ejeX,ejeY,titulo;

    public Grafica(String ejeX, String ejeY, String titulo) {
        this.grafica = null;
        this.series= new XYSeriesCollection();
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.titulo = titulo;
    }
    
    public void agregarSerie(Double[] datos, String id){
        //crear la serie
        XYSeries serie = new XYSeries(id);
        
        for(int x= 0; x<datos.length; x++){
            serie.add(x,datos[x]);
        }
        this.series.addSeries(serie);
        
    }
    public void agregarSerie(double[] datos, String id){
        //crear la serie
        XYSeries serie = new XYSeries(id);
        
        for(int x= 0; x<datos.length; x++){
            serie.add(x,datos[x]);
        }
        this.series.addSeries(serie);
        
    }
    
    
    public void crearYmuestraGrafica(){
        this.grafica= ChartFactory.createXYLineChart(titulo, ejeX, ejeX, series);
        ChartFrame panel = new ChartFrame(titulo,grafica);
        panel.pack();
        panel.setVisible(true);
    }
    
    
}
