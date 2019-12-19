import java.util.Scanner;

public class MatricesDinamicas{
  public static void main(String args[]){
  
  int counter  = 1, rows = 0, columns = 0;

  Scanner entrada = new Scanner(System.in);  
  System.out.println("¿Cuantas filas deseas?: ");
  rows = entrada.nextInt();
  System.out.println("¿Cuantas columnas deseas?: ");
  columns = entrada.nextInt();

  int matriz[][] = new int[rows][columns];
  
  for(int r = 0; r<rows; r++){
    for(int c = 0; c< columns; c++){
      matriz[r][c] = counter;
      counter++;
      System.out.print("[" + matriz[r][c] + "]");
   }
  System.out.println(" ");  
  }  
 }

}