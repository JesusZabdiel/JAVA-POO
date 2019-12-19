
import java.util.Arrays;
import java.util.Scanner;

/*
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class PromedioRacionales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas fracciones vas a promediar?");
        int numeroF = teclado.nextInt();
        
        Racional[] arrFracciones = new Racional[numeroF];
        for(int i = 0; i<arrFracciones.length; i++){
            System.out.println("Capturando Racional " + (i+1));
            System.out.println("Teclea el numerador: ");
            int numerador = teclado.nextInt();
            System.out.println("Teclea el denominador: ");
            int denominador = teclado.nextInt();
            arrFracciones[i] = new Racional(numerador, denominador);            
        }
        
        System.out.println("\n Arreglo: " + Arrays.toString(arrFracciones));
        Racional acumulador = new Racional();
        for(Racional fraccion : arrFracciones){
            acumulador = acumulador.sumar(fraccion);
        }
        
        Racional totalF = new Racional(arrFracciones.length);
        Racional promedio = acumulador.dividir(totalF);
        System.out.println("Promedio: " + promedio);
    }
    
}
