/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Temperatura {
    
    private double gradosF;

    public Temperatura() {
        this.gradosF = -32;
    }

    public Temperatura(double gradosF) {
     
        this.gradosF = gradosF;
    }

    public double getGradosF() {
        return gradosF;
    }

    public void setGradosF(double gradosF) {
        if (gradosF >= -469.67){
            this.gradosF = gradosF;
        }else{
            System.out.println("No hay temperaturas menores a -469.67");
        }
        
    }
    
    public double convertirACelcius(){
        if(gradosF >=-469.67){
            double celcius = (this.gradosF - 32)*(5.0/9.0); 
            return celcius;            
        }else{
            return 0.0;
        }
        
    }
    
    public double convertirAKelvin(){
        if(gradosF >=-469.67){
            double kelvin = ((5*(this.gradosF - 32))/9)+ 273.15;
            return kelvin;            
        }else{
            return 0.0;
        }
        
    }

    @Override
    public String toString() {
        if(gradosF >=-469.67){
            String cadena = gradosF + "°F";
            return cadena;
        }else{
            return "No hay temperaturas menores a -469.67";            
        }
        
        
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Temperatura){
            Temperatura otro = (Temperatura)obj;
            if(this.gradosF == otro.gradosF){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    
    
    
    
    
    
    
}
