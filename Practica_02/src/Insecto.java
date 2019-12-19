/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Insecto {
    
    private boolean direccionDerecha = true;
    private int posicionX;

    public void girar(){
        if(direccionDerecha == true){
            direccionDerecha = false;
        }else{
            direccionDerecha = true;
        }
    }
    
    public void mover(){
        if (direccionDerecha == true){
            posicionX++;
        }else{
            posicionX--;
        }
    }
    
    public void mover(int pasos){
        if (direccionDerecha == true){
            posicionX += pasos;
        }else{
            posicionX -= pasos;
        }
    }
    
    public int getPosicion(){
        return posicionX;
    }
    
    public void setPosicionX(int x){
        
        posicionX = x;      
    }

}

