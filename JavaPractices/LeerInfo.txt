import java.util.Scanner;

public class LeerInfo{
  
  public static void main(String args[]){
   Scanner in = new Scanner (System.in);
   String nombre = "";
   int numeroUno = 0, numeroDos = 0, resultado = 0;


   System.out.println("¿Cual es tu nombre?: ");
   nombre = in.nextLine();
   
   System.out.print("Dame el primer numero: ");
   numeroUno = in.nextInt();
   System.out.print("Dame el segundo numero: ");
   numeroDos = in.nextInt();
   
   resultado = numeroUno + numeroDos;

   System.out.println(nombre + ", " + "el resultado de la suma es: " + resultado);
   

   
 }

}