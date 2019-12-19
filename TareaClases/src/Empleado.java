/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Empleado {
    private String nombre;
    private int numeroEmpleado;
    private String departamento;
    private String posicion;
    
    
    public Empleado (String nombre, int numeroEmpleado, String departamento, 
            String posicion){
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.posicion = posicion;            
    }
    
    public Empleado(String nombre, int numeroEmpleado){
        this.nombre =  nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.posicion = "";
        this.departamento = "";
              
    }
    
    public Empleado(){
        this.nombre = "";
        this.departamento = "";
        this.posicion = "";
        this.numeroEmpleado = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        String cadena = posicion +": "+ nombre + ", (" + numeroEmpleado + "), "
               + departamento;;
        
       if(this.posicion == "" && this.departamento == ""){
          cadena = "-: "+ nombre + ", (" + numeroEmpleado + "), "
               +"-";
       }
       
       if (this.departamento == "" && this.nombre == "" && this.posicion == ""){
           cadena = "-: -, (0), -";
       }
       return cadena;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Empleado){
            Empleado otro = (Empleado)obj;
            if(this.nombre == otro.nombre && this.posicion == otro.posicion
            && this.numeroEmpleado == otro.numeroEmpleado && 
            this.departamento == otro.departamento){
                return true;
            }else{
                return false;
            }                
    
        }
        return false;
    }
     
}
