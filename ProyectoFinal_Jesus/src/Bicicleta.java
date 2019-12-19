
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Zady-
 */
public class Bicicleta extends Vehiculo{
    
    private final double TARIFA = 8.50;
    private final double TARIFA_FRACC = 5.25;
    private String color;
    
    public Bicicleta(String placas,String marca, String color) {
        super(placas, marca);
        this.color =color;
    }
    
    public String getColor(){
        return this.color;
    }

    @Override
    public double calcularTarifa() {
        //generarmos la fecha de salida del vehículo
        double tarifa = TARIFA;
        double tarifaHora = TARIFA_FRACC * 4;
        
        //generarmos la fecha de salida del vehículo
        Calendar fechaAhora = Calendar.getInstance();
        Date ahora = fechaAhora.getTime();
        this.setFechaSalida(ahora);
        
        //separamos horas minutos y día        
        int minSalida = fechaAhora.get(Calendar.MINUTE);
        int  horaSalida = fechaAhora.get(Calendar.HOUR_OF_DAY);
        int diaSalida = fechaAhora.get(Calendar.DAY_OF_MONTH);
        
       //calculamos tiempo que el vehículo estuvo en el estacionamiento
        int difDia = diaSalida - this.getDiaEntrada();
        int difHoras = horaSalida - this.getHoraEntrada();
        int difMin = minSalida - this.getMinutoEntrada();
        
         //calculamos tarifa
        if((difDia == 0) && (difHoras <2)){//menos de 2 horas tarifa normal
            return tarifa;            
        }else if ((difDia == 0) && (difHoras>=2)){//más de 2 horas pero mismo día
            if(this.getMinutoEntrada() > minSalida){
                difHoras--;
                difMin = Math.abs(this.getMinutoEntrada()-minSalida-60);
            }
            return tarifa + ((difHoras-2) * tarifaHora) + ((difMin/15)*TARIFA_FRACC);            
        }else{
            //en caso de que no se compla el día total
            if(this.getHoraEntrada() > horaSalida){//cambió de día pero menos de 24hrs
                difDia--;
                if(this.getMinutoEntrada() > minSalida){
                    difHoras--;
                    difMin = Math.abs(this.getMinutoEntrada()-minSalida-60);
                }
                tarifa += (difDia * 24) * tarifaHora;
                tarifa += Math.abs(this.getHoraEntrada()-horaSalida-24+2)*tarifaHora;
                tarifa += ((difMin/15)*TARIFA_FRACC);
                return tarifa;
                
            }else{
                if(this.getMinutoEntrada() > minSalida){
                    difHoras--;
                    difMin = Math.abs(this.getMinutoEntrada()-minSalida-60);
                }
                tarifa += ((difDia * 24) - 2) * tarifaHora; //pasó 24hrs completas
                tarifa += (difHoras) * tarifaHora;
                tarifa += ((difMin/15)*TARIFA_FRACC);
                return tarifa;
                
            }            
        }
    
    }
    
    @Override
    public String toString(){
        return " Bicicleta " + "------- "+ "\n#Ticket "+this.getTicket() + 
                "\nMarca: " +this.getMarca() + "\nColor " + this.color;
    }
    
    
}
