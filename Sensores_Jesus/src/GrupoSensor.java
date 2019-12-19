/**
 *
 * @author Jesus Zabdiel Sánchez Chávez A01374964
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class GrupoSensor implements Cargable {
    private Sensor[] sensores;
    private Temperatura tMinima;
    private Temperatura tMaxima;
    private Ultrasonido dMenor;
    private Ultrasonido dMayor;
    private final int NUMERO_LECTURAS = 120;
    
    public GrupoSensor(){

    sensores = new Sensor[NUMERO_LECTURAS];
    tMinima = new Temperatura(90, "ST", 0);
    tMaxima = new Temperatura(90, "ST", 90);
    dMenor = new Ultrasonido("SUA", 0);
    dMayor = new Ultrasonido("SUA", 50);

    }

    @Override
    public void cargarDatos(String nombreArchivo){
        int index = 0;
        try {
            BufferedReader file = new BufferedReader(new FileReader(nombreArchivo));
            
            while(file.ready()){
                String line =  file.readLine();
                String[] data = line.split("\t");
                
                if (data[0].startsWith("U")){
                    
                    sensores[index++] = new Ultrasonido(data[0], Integer.parseInt(data[2]));
                
                }else{
                    sensores[index++] = new Temperatura(100, data[0], Integer.parseInt(data[2]));
                }
                
            }
            file.close();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("No es posible leer el archivo: " + nombreArchivo + 
                    "\nError: " + nombreArchivo + " (No such file or directory)\n");
        } catch (IOException ex) {
            System.out.println("No es posible leer el archivo: " + nombreArchivo + 
                    "\nError: " + nombreArchivo + " (No such file or directory)\n");
        }
    }   
    
    
    @Override
    public String toString(){
        
        return ("Grupo sensores: \n"
                + "Número de sensores: " + sensores.length + "\n" +
                "Temperatura máxima: " + tMaxima.toString()  + "\n" + 
                "Temperatura mímina: " +  tMinima.toString() + "\n" + 
                "Temperatura promedio: " + calcularPromedioTemperatura() + " °C \n" + 
                "Distancia promedio: " + calcularPromedioDistancia() + " cm");
    }
    
    private double calcularPromedioTemperatura(){
        
        double promedio;
        double suma = 0;
        int elementos = 0;
        
        for (Sensor sensor : sensores) {
            if(sensor instanceof Temperatura){
                suma += sensor.convertir();
                elementos++;
            }           
        }
        
        if(suma != 0){
            promedio = suma /  elementos;
            return promedio;
        }else{
            return -1;
            
        }        
    }
    
    private double calcularPromedioDistancia(){
        
        double promedio;
        double suma = 0;
        int elementos = 0;
        
        for (Sensor sensor : sensores){
            if(sensor instanceof Ultrasonido){
                suma = suma + sensor.convertir();
                elementos++;
            }
            
        }
        
        if(suma != 0){
            promedio = suma / elementos;
            return promedio;
        }else{
            return -1;
        }
    }

}
