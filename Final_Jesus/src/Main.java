
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Zady-
 */
public class Main {
    
    public static void main(String[] args) {
        int indice = 0;
        int puntos = 0;
        Equipo[] nEquipos = new Equipo[19];
        try{
            BufferedReader file = new BufferedReader(new FileReader("LigaMx.txt"));
            file.readLine();//quitar encabezado
            int puntosE;
            while(file.ready()){
                String linea = file.readLine();
                String[] columnas = linea.split(",");
                String strPuntos =  columnas[8];
                strPuntos = strPuntos.replace("\n", "");
                puntosE = Integer.parseInt(strPuntos);
                nEquipos[indice] =  new Equipo(puntosE);
                indice++;
            }
            
            file.close();            
            
        }catch(IOException e){
            System.out.println("No se encontró el archivo");
            
        }
        
        for (Equipo equipo : nEquipos) {
            puntos = puntos +equipo.getPuntos();
        }
        
        System.out.println("El promedio de puntos de toda la liga es: " + (double)puntos/19);
        
        
    }
    
    /*public static int calcularNEquipos(){
        int equipos = 0;
        try{
            BufferedReader file = new BufferedReader(new FileReader("LigaMx.txt"));
            file.readLine();//quitar encabezado
            while(file.ready()){
                equipos++;                
            }
            
            file.close();
            return equipos;
            
        }catch(IOException e){
            System.out.println("No se encontró el archivo");
            
        }
        return 0;
    }*/
    
}
