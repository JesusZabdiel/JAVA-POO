/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class ExamenUnoB {
    
    public static void main(String[] args) {
        LectorLibro libro = new LectorLibro();
        libro.iniciar();
        System.out.println("Página actual: " + libro.getActual());
        libro.irPaginaSiguiente();
        libro.irPaginaSiguiente();
        libro.irPaginaSiguiente();
        libro.irPaginaSiguiente();
        System.out.println("Página actual: " + libro.getActual());
        libro.irPaginaPrevia();
        libro.irPaginaPrevia();
        System.out.println("Página actual: " + libro.getActual());
        libro.setInfo("Python for Dummies", 280, 23);
        System.out.println("Página actual: " + libro.getActual());
        libro.irPaginaSiguiente();
        libro.irPaginaSiguiente();
        libro.irPaginaSiguiente();
        System.out.println("Página actual: " + libro.getActual());
        libro.irPaginaPrevia();
        System.out.println("Página actual: " + libro.getActual());
        
        LectorLibro texto =  new LectorLibro();
        texto.setInfo("Jajaja", 1, 1);
        System.out.println("Página actual: " + texto.getActual());
        texto.irPaginaSiguiente();
        System.out.println("Página actual: " + texto.getActual());
        texto.irPaginaPrevia();
        System.out.println("Página actual: " + texto.getActual());
        System.out.println("Jesus Zabdiel, A01374964, ISC, Cansado :c");
        
    }
    
}
