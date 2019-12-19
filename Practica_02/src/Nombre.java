
import javax.swing.JOptionPane;

/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Nombre {
    
    public static void main(String[] args) {
        String nombre =   JOptionPane.showInputDialog("Teclea el nombre: ");
        int separador = nombre.indexOf(",");
        String nombreFormato = nombre.substring(separador+1) + " " + nombre.substring(0,separador);
        System.out.println("Nombre con formato: " + nombreFormato);
    }
    
}
