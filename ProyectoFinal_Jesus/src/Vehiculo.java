
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Jesus Zabdiel Sánchez Chávez A01374964
 */
public abstract class Vehiculo implements Tarifa{
    
    public static int nTicket = 0;
    protected Calendar fecha = Calendar.getInstance();
    private String marca;
    private String placas;    
    private Date fechaEntrada;
    private Date fechaSalida;  
    private String ticket;
    

    
    public Vehiculo(String placas,String marca){
        this.placas = placas;
        this.marca = marca;
        this.ticket = Vehiculo.generateTicket();
        this.fechaEntrada = fecha.getTime();
    }
   
    public String getTicket() {
        return ticket;
    }
    
    public String getMarca() {
        return marca;
    }
        
    public Date getFechaEntrada(){
        return fechaEntrada;
    }
    
    public int getDiaEntrada(){
        return this.fecha.get(Calendar.DAY_OF_MONTH);
    }
    
    public int getHoraEntrada(){
        return this.fecha.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getMinutoEntrada(){
        return this.fecha.get(Calendar.MINUTE);
    }
    
    
    
    public Date getFechaSalida(){
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }   
    
    
    
    public  String getPlacas(){
        return this.placas;
    }

    @Override
    public String toString() {
        return this.placas;
    }

    public static String generateTicket() {
        nTicket++;
        String digits = Integer.toString(nTicket);
        String ticketStr;
        if(digits.length() == 1){
            ticketStr = "ET0000000" + digits;                        
        }else if(digits.length() == 2){
            ticketStr = "ET000000" + digits;            
        }else{
            ticketStr = "ET00000" + digits;
        }
        return ticketStr;
    }
    
    
    @Override
    public abstract double calcularTarifa();
    

 
    
    public String formatearTicket(double tarifa){
        
        String fechaEn = this.getFechaEntrada().toString();
        fechaEn = fechaEn.replace("CST ", "");
        String fechaSa = this.getFechaSalida().toString();
        fechaSa = fechaSa.replace("CST ", "");
        
        
        return  "****************************************\n"
                + "******  Ticket Estacionamiento  ******\n"
                + "****************************************\n\n"
                + this.toString() + "\n\n"
                + "Entrada: "+fechaEn + "\n" 
                +"Salida: " + fechaSa+"\n\n"+
                "Total a pagar: " + tarifa + "\n\n" +
                "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n"+
                "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
    }
 
    
    
    
    
}
