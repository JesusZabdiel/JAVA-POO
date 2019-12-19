/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class PruebaLibro {
    
    public static void main(String[] args) {
        
        Libro a = new Libro();
        a.setInfo("Fisica", "James Stewart", "12345678912345", "Academic", 2015);
        System.out.println("Titulo: " + a.getTitulo());
        System.out.println("Autor: " + a.getAutor());
        System.out.println("ISBN: " + a.getIsbn());
        System.out.println("Editorial: " + a.getEditorial());
        System.out.println("Año de publiación: " + a.getAñoPublicacion());
        a.setTitulo("Fisica II");
        System.out.println("Título; " + a.getTitulo());
        a.setIsbn("12552499635556");
        System.out.println("ISBN: " + a.getIsbn());
        
        
    }
    
}
