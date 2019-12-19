/**
 *
 * @author Jesus Zabdiel Sanchez A01374964
 */
public class Ultrasonido extends Sensor{
    
    public Ultrasonido(String tipo, int valor) {
        super(tipo, valor);
    }

    @Override
    public double convertir() {
        return this.getValor()*2.54;
    }
    
    @Override
    public String toString(){
        return this.getTipo() + "(" + this.convertir() + ") cm";
    }

}
