/*

 * @author Jesus Zabdiel Sanhcez Chavez A01374964
 */
public class Marcadores {
    private double marcadorUno;
    private double marcadorDos;
    private double marcadorTres;
    
    public Marcadores(){
        this.marcadorUno = 1.0;
        this.marcadorDos = 1.0;
        this.marcadorTres = 1.0;
       
    }

    public Marcadores(double marcadorUno, double marcadorDos, double marcadorTres) {
        this.marcadorUno = marcadorUno;
        this.marcadorDos = marcadorDos;
        this.marcadorTres = marcadorTres;
    }
    
    public double promediar(){
        double promedio = (marcadorUno + marcadorDos + marcadorTres)/3;
        return promedio;
    }

    public double getMarcadorUno() {
        return marcadorUno;
    }

    public void setMarcadorUno(double marcadorUno) {
        if(marcadorUno >=1.0){
            this.marcadorUno = marcadorUno;
            
        }else{
            System.out.println("No puede haber marcadores menores a 1.0");
        }
        
    }

    public double getMarcadorDos() {
        return marcadorDos;
    }

    public void setMarcadorDos(double marcadorDos) {
        if(marcadorDos >=1.0){
            this.marcadorDos = marcadorDos;
            
        }else{
            System.out.println("No puede haber marcadores menores a 1.0");
        }
    }

    public double getMarcadorTres() {
        return marcadorTres;
    }

    public void setMarcadorTres(double marcadorTres) {
        if(marcadorTres >=1.0){
            this.marcadorTres = marcadorTres;
            
        }else{
            System.out.println("No puede haber marcadores menores a 1.0");
        }
    }

    @Override
    public String toString() {
        String cadena = "Marcador 1: " + marcadorUno + "\n"+ "Marcador 2: " +
                marcadorDos + "\n" + "Marcador 3: " +marcadorTres + "\n" +
                "Promedio: " + promediar();
        return cadena;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Marcadores){
            Marcadores  otro = (Marcadores)obj;
            if(this.marcadorDos == otro.marcadorDos && this.marcadorUno == 
                    otro.marcadorUno && this.marcadorTres == otro.marcadorTres){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    
    
}
