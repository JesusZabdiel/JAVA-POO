package Herencia;

/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 * Claudio Mayoral García               A01747749
 */
public class CuentaCheques extends CuentaBanco{
    
    private final int OPERACIONES_GRATIS = 3;
    private int contadorOperaciones = 0;
    private final double COSTO_OPERACIONES = 15;
    public CuentaCheques(double saldoInicial){
        super(saldoInicial);
        
    }
    @Override
    public void depositar(double cantidad){
        super.depositar(cantidad);
        contadorOperaciones++;
    }
    
    @Override
    public void retirar(double cantidad){
        super.retirar(cantidad);
        contadorOperaciones++;
    }
    
    public void restarCostos(){
        System.out.println("Operaciones: " + contadorOperaciones);
        if(contadorOperaciones > 3){
            this.depositar(-(COSTO_OPERACIONES * (contadorOperaciones-3)));
            contadorOperaciones = 0;
        }else{
            contadorOperaciones = 0;
        }     
        
    }
    
    @Override
    public void transferir(double cantidad, CuentaBanco otra){
        this.retirar(cantidad);
        otra.depositar(cantidad);

        
    }

    @Override
    public String toString() {
        return "Cuenta de cheques. \n"+super.toString();
    }
    
    
}
