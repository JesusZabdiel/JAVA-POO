import java.util.Scanner;

public class Vacaciones{
  public static void main (String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int claveTrabajo = 0, añosServicio = 0;
   
   System.out.println("Hola, ¿Cual es tu nombre?: ");
   nombre = in.nextLine();
   System.out.println("¿Cual es tu clave de trabajo?: ");
   claveTrabajo = in.nextInt();
   
   if (claveTrabajo == 1){
     System.out.println("¿Cuántos años llevas trabajando?: ");
     añosServicio = in.nextInt();
     if (añosServicio < 2){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 6 dias de vacaciones.");   
    }
   else if (añosServicio >= 2 && añosServicio <=6){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 14 dias de vacaciones.");
    }

   else if (añosServicio >= 7){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 20 dias de vacaciones.");
    }  
  }

  else if (claveTrabajo == 2) {
    System.out.println("¿Cuántos años llevas trabajando?: ");
     añosServicio = in.nextInt();
     if (añosServicio < 2){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 7 dias de vacaciones.");   
    }
   else if (añosServicio >= 2 && añosServicio <=6){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 15 dias de vacaciones.");
    }

   else if (añosServicio >= 7){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 22 dias de vacaciones.");
    } 

  }
  else if (claveTrabajo == 3){
    System.out.println("¿Cuántos años llevas trabajando?: ");
     añosServicio = in.nextInt();
     if (añosServicio < 2){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 10 dias de vacaciones.");   
    }
   else if (añosServicio >= 2 && añosServicio <=6){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 20 dias de vacaciones.");
    }

   else if (añosServicio >= 7){

       System.out.println("Hola, " + nombre + ". Tienes derecho a 30 dias de vacaciones.");
    }  
  }

 }

}