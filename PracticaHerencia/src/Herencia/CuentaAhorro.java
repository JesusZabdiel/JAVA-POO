package Herencia;

/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 * Claudio Mayoral García               A01747749
 */
public class CuentaAhorro extends CuentaBanco{
    
    private double tasaInteres;
    
    public CuentaAhorro(double tasaInteres){
        this.tasaInteres = tasaInteres;
        
    }    
    
    public void agregarInteres(){
        this.depositar(this.getSaldo() *(tasaInteres));
    }
    @Override
    public void retirar(double cantidad){
        if(cantidad < 0){
            System.out.println("No puedes retirar saldo negativo");            
        }else if(cantidad > this.getSaldo()){
            System.out.println("No cuentas con suficiente saldo para retirar: $" + cantidad);
            
        }else{
            super.retirar(cantidad);
        }
        
    }
    @Override
    public void transferir(double cantidad, CuentaBanco otra){
        if(this.getSaldo() >= cantidad){
            otra.depositar(cantidad);
            this.depositar(-cantidad);
        }else if(cantidad < 0){
            System.out.println("No puedes depositar saldo negativo");            
        }else if(this.getSaldo() < cantidad){
            System.out.println("No cuentas con saldo suficiente apra transferir: $" + cantidad);
            
        }                
    }

    @Override
    public String toString() {
        return "Cuenta de ahorro. \n"+super.toString();
    }
    
    
    
}
