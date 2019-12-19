import java.util.Scanner;

public class Strings{

  public static void main(String args[]){

    String nombreUno = "", nombreDos = "";
    Scanner entrada = new Scanner(System.in);

    System.out.print("Teclea el primer nombre: ");
    nombreUno = entrada.nextLine();
    System.out.print("Teclea el segundo nombre: ");
    nombreDos = entrada.nextLine();

    if (nombreUno.equalsIgnoreCase(nombreDos)){
    
      System.out.println("Ambos nombres son iguales");
  }
    else{
      System.out.println("Los nombres  NO son iguales");

  }

 }
}