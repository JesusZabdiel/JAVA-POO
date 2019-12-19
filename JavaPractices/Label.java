import javax.swing.*;

public class Label extends JFrame{

  private JLabel text1;
  private JLabel text2;
  
  public Label(){
    setLayout(null);
    text1 = new JLabel("Interfaz Test");
    text1.setBounds(20,20,300,30);
    add(text1);
    text2 = new JLabel("Test 2");
    text2.setBounds(20,40,150,30);
    add(text2);
 }
 
 public static void main(String args[]){
   
   Label label1 = new Label();
   label1.setBounds(0,0,300,150);
   label1.setResizable(false);
   label1.setLocationRelativeTo(null);
   label1.setVisible(true);
 }
}