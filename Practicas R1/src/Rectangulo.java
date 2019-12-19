/*
@autor Jesus Zabdiel Sánchez Chávez
 */
public class Rectangulo {
    private int alto;  //varibale de instancia (variables del objeto)
    private int ancho;
    
    public int calcularArea(){
        int area = ancho * alto;
        return area;        
    }
    
    //Accesores: Métodos get/accesores
    
    public int getAncho(){
        return ancho;
    }
    
    public int getAlto(){
        return alto;
    }
    
    //Modificadores -- setter
    
    public void setAncho(int nuevo){
        
        if (nuevo >=0){
            ancho = nuevo;
        }else{
            System.out.println("El valor no puede se negativo");
        }
    }
    public void setAlto(int nuevo){
         if (nuevo >=0){
            alto = nuevo;
        }else{
            System.out.println("El valor no puede se negativo");
        }
    }
    
}
