
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zady-
 */
public class Ahorcado {
    
    private String palabraCorrecta;  // Correcta
    private String palabraAdivinada; //-----
    private int vidas = 6;    //Intentos(6) 

    
    private String[] palabras;
    
    public Ahorcado(){
        int numeroLineas = 0;
        try {
            //Leer archivo con palabras
            BufferedReader ent = new BufferedReader(new FileReader("src/palabras.txt"));
            while(ent.ready()){
                String linea = ent.readLine();
                numeroLineas++;
            }
            ent.close();
            String palabras[] = new String[numeroLineas];
            int indice = 0;
            ent = new BufferedReader(new FileReader("src/palabras.txt"));
            while(ent.ready()){
                String linea = ent.readLine();
                palabras[indice++] = linea.toUpperCase();
            }
            ent.close();
            this.palabras = palabras;
            System.out.println("Palabras: " + Arrays.toString(palabras));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ahorcado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ahorcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String getAzar(){
        int indice = (int)(Math.random()*palabras.length);
        palabraCorrecta = palabras[indice];
        palabraAdivinada = "";
        for(int i = 0; i<palabras.length; i++){
            palabraAdivinada = palabraAdivinada + "-";
        }
        return palabraAdivinada;      
    }
    
    public boolean probarLetra(String letra){
        //Recorrer la palabra correcta y, si está la letra, se descubre
        //en la palabra adivinada (cambia el guión)
        char letraAdivina = letra.charAt(0);
        String nuevaA = "";
        for (int i =0; i<palabraCorrecta.length(); i++) {
            char letraCorrecta = palabraCorrecta.charAt(i);
            if(letraCorrecta == letraAdivina){
                nuevaA += letraCorrecta + "";
            }else{
                if(palabraAdivinada.charAt(i) == '-'){
                    nuevaA += '-';
                }else{
                    nuevaA += palabraAdivinada.charAt(i)+"";
                }
            }
        }
        if(palabraAdivinada == nuevaA){
            vidas--;
            return false;
        }
        palabraAdivinada = nuevaA;
        return true;
    }
    
    public String getPalabraAdivinada(){
        return palabraAdivinada;
    }
    
    
    
}
