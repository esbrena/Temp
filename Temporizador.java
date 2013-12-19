/**
 *
 * @author Rafael Pérez
 * DESARROLLO DE APLICACIONES MULTIPLATAFORMAS
 * COLEGIO STMA TRINIDAD DE SALAMANCA
 */
package Utilidades;

public class Temporizador {

    private int tick;//en msg
    private long tiempoInicial;//en nsg
    private long difTiempo;//en msg   
    public Temporizador(int tick){
        this.tick=tick;
        reiniciar();
    }
    public void reiniciar(){
        tiempoInicial=System.nanoTime();
    }
    public void reiniciar(int tick){
        this.tick=tick;
        tiempoInicial=System.nanoTime();
    }
    
    public boolean esFinal(){
        difTiempo=(System.nanoTime()-tiempoInicial)/1000000;
        if (difTiempo>tick)
            return true;
        return false;
    }
    public int tiempoTranscurridoSg(){
        return (int)(difTiempo/1000);
    }
    public int tiempoRestanteSg(){
        int t=(int)((tick-difTiempo)/1000);
        if (t<0) t=0;
        return t;
    }
}
