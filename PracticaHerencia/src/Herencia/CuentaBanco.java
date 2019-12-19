package Herencia;

/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 * Claudio Mayoral García               A01747749
 */
public abstract class CuentaBanco {
    private double saldo;
    
    public CuentaBanco(){
        this.saldo = 0;
    }
    
    public CuentaBanco(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;            
        }else{
            System.out.println("No puedes crear cuenta con saldo negativo");
        }                
    }
    
    public void depositar(double cantidad){
        this.saldo += cantidad;        
    }
    
    public void retirar(double cantidad){
        this.saldo-= cantidad;
    }
    
    public abstract void transferir(double cantidad, CuentaBanco otra);

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Saldo: $" + this.saldo;
    }
    
    
    
    
    
    
}
