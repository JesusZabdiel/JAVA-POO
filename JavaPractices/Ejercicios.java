public class Ejercicios{
  public static void main (String args[]){

   int numeroUno = 1;
   int numeroDos = 99;
    
   for(int i = 1; i <=10; i+= 1){
     
     if(i < 10){
       System.out.print(i+", ");
   }
     else{
       System.out.print(i);
   }
     
  }
  
  System.out.print("\n");

  while (numeroUno <= 5 && numeroDos >=95){

    if(numeroDos != 95){

      System.out.print(numeroUno + "," + numeroDos + ",");
      numeroUno += 1;
      numeroDos -= 1;
   }
    else{
      
      System.out.print(numeroUno + "," + numeroDos);
      numeroUno += 1;
      numeroDos -= 1;
   }
    
  } 
 }

}