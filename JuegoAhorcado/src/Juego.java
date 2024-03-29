
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/**
 *
 * @author Jesus Zabdiel Sanchez Chavez A01374964
 */
public class Juego extends javax.swing.JFrame {
    
    private Ahorcado ahorcado;

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();        
        configurarBotones();
        setSize(640, 480);
        //prueba
        ahorcado = new Ahorcado();
        lbladivinada.setText(ahorcado.getAzar());
    }
    
    public void configurarBotones(){
        for(char letra = 'A'; letra<='Z'; letra++){
            String strLetra = letra+""; //Convertir en cadena
            JButton btnLetra = new JButton(strLetra);
            panelBotones.add(btnLetra);
            //Listener
            btnLetra.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton btn = (JButton)e.getSource();
                    btn.setEnabled(false);
                    System.out.println(btn.getText());
                    String letra = btn.getText();
                    ahorcado.probarLetra(letra);
                    lbladivinada.setText(ahorcado.getPalabraAdivinada());
                }
            });
        }
        //agregar panel de dibujo
        DibujoAhorcado dibujo = new DibujoAhorcado();
        getContentPane().add(dibujo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbladivinada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));
        jPanel1.add(panelBotones);

        lbladivinada.setText("--------------");
        jPanel2.add(lbladivinada);
        lbladivinada.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbladivinada;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
}
