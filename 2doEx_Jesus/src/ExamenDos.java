/*
 * @author 
 */
public class ExamenDos {
    public static void main(String[] args) {
        Temperatura a =  new Temperatura();
        Temperatura b = new Temperatura(-469.70);
        
    
        a.setGradosF(-480);
        b.setGradosF(50);
        
        System.out.println(a + " Equivale a: " + a.convertirAKelvin()+"°K y " + a.convertirACelcius()+"°C"  );
        System.out.println(b + " Equivale a: " + b.convertirAKelvin()+"°K y " + b.convertirACelcius()+"°C"  );
        
        Marcadores m =  new Marcadores();
        Marcadores n =  new Marcadores(80,100,90);
        
        System.out.println(m);
        System.out.println(n);
        m.setMarcadorDos(0);
        m.setMarcadorDos(-1);
        
        
    }
    
    
    
}
