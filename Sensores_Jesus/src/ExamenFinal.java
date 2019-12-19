/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class ExamenFinal {
    
    public static void main(String[] args) {
        GrupoSensor grupo = new GrupoSensor();
        System.out.println(grupo);
        
        System.out.println();
        
        
        grupo.cargarDatos("noExiste.txt");
        
        grupo.cargarDatos("src/sensores.txt");
        System.out.println(grupo);
        
    }
    
}
