import Herencia.CuentaBanco;
import Herencia.CuentaCheques;
import Herencia.CuentaAhorro;

/**
 *
 * @author MORA
 */
public class BANCO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaAhorro ahorrosAbue = new CuentaAhorro(0.012);
        ahorrosAbue.depositar(8500);
        CuentaCheques chequesTio = new CuentaCheques(1250);
        System.out.println("Saldo en la cuenta de mi abuelita = $"+ ahorrosAbue.getSaldo());
        System.out.println("Saldo en la cuenta de mi tio = $"+chequesTio.getSaldo());
        
        ahorrosAbue.transferir(3500, chequesTio);
        System.out.println("\nSaldo en la cuenta de mi abuelita = $"+ahorrosAbue.getSaldo());
        System.out.println("Saldo en la cuenta de mi tio = $"+chequesTio.getSaldo());
        
        ahorrosAbue.transferir(10000, chequesTio);
        chequesTio.retirar(250);
        ahorrosAbue.retirar(2500);
        System.out.println("\nSaldo en la cuenta de mi abuelita = $"+ahorrosAbue.getSaldo());
        System.out.println("Saldo en la cuenta de mi tio = $"+chequesTio.getSaldo());
        
        chequesTio.transferir(5000, ahorrosAbue);
        System.out.println("\nSaldo en la cuenta de mi abuelita = $"+ahorrosAbue.getSaldo());
        System.out.println("Saldo en la cuenta de mi tio = $"+chequesTio.getSaldo());
        
        ahorrosAbue.retirar(15000);
        chequesTio.retirar(100);
        chequesTio.retirar(100);
        chequesTio.retirar(100);
        
        //Fin de mes
        ahorrosAbue.agregarInteres();
        chequesTio.restarCostos();
        
        
        System.out.println(ahorrosAbue);
        System.out.println(chequesTio);
        
        
        
        
    }

}
