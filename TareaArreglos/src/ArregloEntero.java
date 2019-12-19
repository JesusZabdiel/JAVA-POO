/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class ArregloEntero {
    private final int MAX_DATOS = 10;
    private int[] arrNumeros;
    
    public ArregloEntero(){
        this.arrNumeros = new int[MAX_DATOS];
    }

    public ArregloEntero(int length) {
        this.arrNumeros = new int[length];
    }

    public ArregloEntero(int[] arrNumeros) {
        this.arrNumeros = arrNumeros;
    }

    public int[] getArrNumeros() {
        return arrNumeros;
    }

    public void setArrNumeros(int[] arrNumeros) {
        this.arrNumeros = arrNumeros;
    }
    
    public  void llenarAzar(){
        for(int i = 0; i<this.arrNumeros.length; i++){
            this.arrNumeros[i] = (int)((Math.random()*48)+5);
        }
    }
    
    public int contarImpares(){
        int counter = 0;
        for (int numero : this.arrNumeros) {
            if(numero%2 != 0){
                counter++;                                                
            }
            
        }
        return counter;
    }
    
    public void intercambiar(){
        int cambio = this.arrNumeros[0];
        this.arrNumeros[0] = this.arrNumeros[this.arrNumeros.length-1] ;
        this.arrNumeros[this.arrNumeros.length-1] = cambio;
        
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < this.arrNumeros.length; i++) {
            if(i+1 == this.arrNumeros.length ){
                str += this.arrNumeros[i] + "]" ;               
            }else{
                str+= this.arrNumeros[i] + "," ;  
            }
            
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        ArregloEntero otro = (ArregloEntero) obj;
        boolean iguales = false;
        if(this.arrNumeros.length == otro.arrNumeros.length){
            for (int i = 0; i < this.arrNumeros.length; i++) {
                if(this.arrNumeros[i] == otro.arrNumeros[i]){ 
                    iguales = true;
                }else{
                    return false;
                }
                
            }
            
        }
        return iguales;
    }
    
    public void rotarIzquierda(){
        if(this.arrNumeros.length >1){
            int primero = this.arrNumeros[0];
            for (int i = 1; i < this.arrNumeros.length; i++) {  
                this.arrNumeros[i-1] = this.arrNumeros[i];    
            
            }
            this.arrNumeros[this.arrNumeros.length-1] = primero;            
        }
        
    }
    public String invertir(){
        String str = "[";
        for (int i = this.arrNumeros.length-1; i >=0 ; i--) {
            if(i == 0 ){
                str += this.arrNumeros[i] + "]" ;               
            }else{
                str+= this.arrNumeros[i] + "," ;  
            }
            
        }
        return str;
    }
    
    public boolean esPalindromo(){
        boolean palindromo = false;
        for (int i = 0; i < this.arrNumeros.length; i++) {
            if(this.arrNumeros[i]== this.arrNumeros[this.arrNumeros.length-1-i]){
                palindromo = true;          
            }else{
                return false;
            }
            
        }
        return palindromo;
    }
    
    
}
