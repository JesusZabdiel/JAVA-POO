import  javax.swing.*;

public class Interfaz extends JFrame{
  
  private JLabel labelHead;

    public Interfaz(){
    setLayout(null);
    labelHead = new JLabel("Header");
    labelHead.setBounds(10,20,200,300);
    add(labelHead);

 }

 public static void main(String args[]){

   Interfaz formulario1 = new Interfaz();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
 }

}