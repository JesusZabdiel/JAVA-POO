/*
 *
 * @author Jesús Zabdiel Sanchez Chavez A01374964
 */
public class PruebaNumero {
    
    public static void main(String[] args) {
        Numero n =  new Numero();
        System.out.println("Numero: " + n.getNumero());
        n.setNumero(7);
        System.out.println("Numero: "+ n.getNumero());
        System.out.println("Es par: " + n.esPar());
        System.out.println("Binario: " + n.calcularBinario());
        System.out.println("Absoluto: " + n.calcularAbsoluto());
        System.out.println("Hexadecimal: " + n.calcularHexadecimal());
        n.setNumero(-7);
        System.out.println("Numero: "+ n.getNumero());
        System.out.println("Absoluto: " + n.calcularAbsoluto());
        Numero n2 =  new Numero(16);
        System.out.println("Numero: " + n2.getNumero());        
        System.out.println("Es par: " + n2.esPar());
        System.out.println("Binario: " + n2.calcularBinario());
        System.out.println("Hexadecimal: " + n2.calcularHexadecimal());        
        n2.setNumero(14520);
        System.out.println("Numero: " + n2.getNumero());
        System.out.println("Binario: " + n2.calcularBinario());
        System.out.println("Hexadcimal: " + n2.calcularHexadecimal());
        
        System.out.println("Numero: " + n);
        System.out.println("Numero 2: " + n2);
        
        System.out.println("¿Iguaels?: " + n.equals(n2));
        
        n2.setNumero(450);
        n.setNumero(450);
        System.out.println("Numero: " + n);
        System.out.println("Numero: " + n2);
        System.out.println("¿Iguaels?: " + n.equals(n2));
        

        
        
    }
    
}
