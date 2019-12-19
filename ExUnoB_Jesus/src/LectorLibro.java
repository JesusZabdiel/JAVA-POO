/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class LectorLibro {
    
    private int actual;
    private int paginas;
    private String titulo;
    
    
    public int getActual(){
        
        return actual;
    }
    
    public void iniciar(){
        
        titulo =  "Object Oriented Design";
        paginas = 500;
        actual = 1;
    }
    
    public void irPaginaPrevia(){
        
        if (actual > 1){
            actual--;
        }else{
            System.out.println("No puede regresar, está en la primera página");
        }
    }
    
    public void irPaginaSiguiente(){
        
        if(actual < paginas){
            actual++;
        }else{
            System.out.println("No puede avanzar, está en la última página");
        }
    }
    
    public void setInfo(String t, int np, int pa){
        
        titulo = t;
        paginas = np;
        actual = pa;
        
    }
    
    
    
    
}
