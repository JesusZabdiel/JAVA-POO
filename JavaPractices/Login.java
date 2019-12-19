import java.util.Scanner;

public class Login{

  public static void main(String args[]){

    String passwordU = "", usuarioU = "";
    Scanner entrada = new Scanner(System.in);

    System.out.print("Inglresa tu nombre de usuario: ");
    usuarioU =  entrada.nextLine();
    System.out.print("Inglresa tu contraseña: ");
    passwordU =  entrada.nextLine();

    if(usuarioU.equals("A01374964") && passwordU.equals("Z406iel&")){
      
      System.out.print("Inicio de sesion correcto");
  }
    
    else{

      System.out.print("Usuaro/contaseña incorrectos");
  }
    
    
    
 }
}