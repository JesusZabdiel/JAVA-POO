
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zady-
 */

public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    private Seleccion seleccion;
    private Salida salida;
    private Vehiculo[]  estacionamiento;
    private RegistroEntradas registroIn;
    private RegistroSalidas registroOut;
    private Informacion info;
    private int lugaresDisponibles;
    
    public Administrador() {
        initComponents();
        this.setTitle("Home");
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
        seleccion = new Seleccion(this);
        estacionamiento = seleccion.getEstacionamiento(); 
        salida = new Salida(seleccion, this);
        registroIn = new RegistroEntradas();
        registroOut = new RegistroSalidas();
        this.info = new Informacion();
        this.lugaresDisponibles = 100;
        this.labelLugares.setText(this.labelLugares.getText() + this.lugaresDisponibles);
    }
    
    public void setTextLugares(){
        this.lugaresDisponibles = seleccion.getLugaresDisponibles();
        this.labelLugares.setText("Lugares dispobiles: " + this.lugaresDisponibles);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ingresarBtn = new javax.swing.JButton();
        salidaBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnVerEntradas = new javax.swing.JButton();
        btnVerSalidas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelLugares = new javax.swing.JLabel();
        finishLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new java.awt.GridLayout(7, 1));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador de estacionamiento");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        ingresarBtn.setText("Ingresar vehículo");
        ingresarBtn.setPreferredSize(new java.awt.Dimension(125, 50));
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarBtn);

        salidaBtn.setText("Sacar vehículo");
        salidaBtn.setPreferredSize(new java.awt.Dimension(125, 50));
        salidaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salidaBtn);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        btnVerEntradas.setText("Ver registro entradas");
        btnVerEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEntradasActionPerformed(evt);
            }
        });
        jPanel3.add(btnVerEntradas);

        btnVerSalidas.setText("Ver registro salidas");
        btnVerSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSalidasActionPerformed(evt);
            }
        });
        jPanel3.add(btnVerSalidas);

        getContentPane().add(jPanel3);

        jButton3.setText("Acerca de este proyecto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);

        labelLugares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLugares.setText("Lugares disponibles: ");
        getContentPane().add(labelLugares);

        finishLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(finishLabel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
       

        seleccion.setLocationRelativeTo(this);
        seleccion.setVisible(true);
        
    }//GEN-LAST:event_ingresarBtnActionPerformed

    private void salidaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaBtnActionPerformed
        salida.setTextField();
        salida.setLocationRelativeTo(this);
        salida.setSize(400, 300);
        salida.setVisible(true);
        
    }//GEN-LAST:event_salidaBtnActionPerformed

    private void btnVerEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEntradasActionPerformed
        String line;
        String text = "";
        try{
            BufferedReader file = new BufferedReader(new FileReader("entradas.txt"));
            while(file.ready()){
                line = file.readLine();
                text += line + "\n";
            }
            
            file.close();
        }catch(IOException ex){
            System.out.println("Error al procesar el archivo");            
        }
        
        registroIn.setTextnEtradas(text);
        registroIn.setLocationRelativeTo(this);
        registroIn.setSize(1300, 600);
        registroIn.setVisible(true);
    }//GEN-LAST:event_btnVerEntradasActionPerformed

    private void btnVerSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSalidasActionPerformed
        String line;
        String text = "";
        try{
            BufferedReader file = new BufferedReader(new FileReader("salidas.txt"));
            while(file.ready()){
                line = file.readLine();
                text += line + "\n";
            }
            
            file.close();
        }catch(IOException ex){
            System.out.println("Error al procesar el archivo");            
        }
        
        registroOut.setTextnEtradas(text);
        registroOut.setLocationRelativeTo(this);
        registroOut.setSize(1300, 600);
        registroOut.setVisible(true);
    }//GEN-LAST:event_btnVerSalidasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.info.setResizable(false);
        this.info.setLocationRelativeTo(this);
        this.info.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void setLabelRegistro(String text){
        this.finishLabel.setText(text);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerEntradas;
    private javax.swing.JButton btnVerSalidas;
    private javax.swing.JLabel finishLabel;
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelLugares;
    private javax.swing.JButton salidaBtn;
    // End of variables declaration//GEN-END:variables
}
