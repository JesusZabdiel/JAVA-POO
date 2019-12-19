/*
 * @author Jesus Zabdiel Sanchez Chavez A001374964
 */
public class Alumno {
    private String nombre;
    private int promedio;
    


    public Alumno(String nombre, int proemedio) {
        this.nombre = nombre;
        this.promedio = proemedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProemedio() {
        return promedio;
    }

    public void setProemedio(int proemedio) {
        this.promedio = proemedio;
    }

    @Override
    public String toString() {
        return this.nombre + " , " + this.promedio;
    }

    
}
