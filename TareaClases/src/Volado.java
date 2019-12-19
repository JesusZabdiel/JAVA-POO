/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Volado {
    private String haciaArriba;
    
    public Volado(){
        int selector = (int)(Math.random()*2) + 1;
        if(selector == 1){
            this.haciaArriba = "sol";
        }else{
            this.haciaArriba = "aguila";
        }
        
    }

    public String getHaciaArriba() {
        return haciaArriba;
    }
    
    public void echarVolado(){
        int selector = (int)(Math.random()*2) + 1;
        if(selector == 1){
            this.haciaArriba = "sol";
        }else{
            this.haciaArriba = "aguila";
        }
    }

    @Override
    public String toString() {
        String cadena = this.haciaArriba;
        return cadena;
    }
    
    
}
