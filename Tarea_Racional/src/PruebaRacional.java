/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class PruebaRacional {
    public static void main(String[] args){
        /*Racional a = new Racional(143,124);
        Racional b = new Racional (41,6);
        Racional c = new Racional();
        System.out.println("Simplificado: " + a);
        System.out.println("Numerador: " + a.getNumerador());
        System.out.println("Denominador: " + a.getDenominador());
        System.out.println("Simpificado: " + b);
        System.out.println("Suma a + b: " + a.sumar(b));
        System.out.println("Resta a - b: " + a.restar(b));
        System.out.println("Mutiplicación a x b: " + a.multiplicar(b));
        System.out.println("División a/b: " + a.dividir(b));
        System.out.println("División a/c: " + a.dividir(c));
        System.out.println("Recíproco: " + a.calcularReciproco());
        a.invertir();
        System.out.println("Invertido: " + a);
        System.out.println("############################");
        a.setNumerador(75);
        a.setDenominador(18);
        System.out.println("Simplificado: " + a);
        System.out.println("Simpificado: " + b);
        System.out.println("Suma a + b: " + a.sumar(b));
        System.out.println("Resta a - b: " + a.restar(b));
        System.out.println("Mutiplicación a x b: " + a.multiplicar(b));
        System.out.println("División a/b: " + a.dividir(b));
        System.out.println("División a/c: " + a.dividir(c));
        Racional racionalUno = Racional.racionalUno();
        System.out.println("Raciola Uno: " + racionalUno);
        System.out.println("Racional Cero: " + Racional.racionalCero());
        Racional negativoA = Racional.negativo(a);
        Racional racionalCero = Racional.racionalCero();
        System.out.println("Negativo de A: " + negativoA);
        System.out.println("Absoluto de Negativo A: " + Racional.absoluto(negativoA));
        System.out.println("Restar 1/1 - 1/1: " + racionalUno.restar(racionalUno));
        System.out.println("Dividir entre 1/1 / 0/1: " + racionalUno.dividir(racionalCero));
        System.out.println("Multiplicar 0/1 * 0/1: " + racionalCero.multiplicar(racionalCero));*/
        
        try{
            Racional r = new Racional(0,5);
            //Racional s = new Racional(5,0);
            r.invertir();
            System.out.println(r);            
        }catch(ExceptionReverse | ArithmeticException e){
            System.out.println("Error con r: " + e.getMessage());           
        }

        
        
        
    }
    
}
