/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Numero {
    
    private int numero;
    
    
    public Numero(){
        
        numero = 1;
    }
    public Numero(int numero){
        this.numero =  numero;        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean esPar(){
        if(numero %2 ==0){
            return true;
        }else{
            return false;
        }
    }
    
    public int calcularAbsoluto(){
        
        if(numero < 0){
            return numero * -1;
        }else{
            return numero;
        }        
    }
    
    public String calcularBinario(){
        String binario = Integer.toBinaryString(numero);
        return binario;
    }
    
    public String calcularHexadecimal(){
        String hexadecimal = Integer.toHexString(numero);
        return hexadecimal;       
    }
    
    public String toString(){
        String cadena = "("+numero+")";
        return cadena;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Numero){
            Numero otro =  (Numero)obj;
            if(this.numero == otro.numero){
                return true;                
            }else{
                return false;
            }
            
        }
        return false;
    }
    
    
}
