/*
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private int añoPublicacion;
    
    
    public void setInfo(String titulo, String autor, String isbn, String editorial, int año){
        
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.añoPublicacion= año;
        
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
        
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    
    public void setAñoPublicacion(int año){
        this.añoPublicacion = año;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
   public int getAñoPublicacion(){
       return añoPublicacion;
   }
}
