package Vista;

import Controlador.ControladorHistorial;
import Exception.PosicionException;
import Exception.TopeException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmCrearComandos extends javax.swing.JFrame {
    private int maxHistorial = 0;
    private ControladorHistorial CH = new ControladorHistorial();
    public FrmCrearComandos() {
        initComponents();
        setLocationRelativeTo(this);
        tablaComandos.setEnabled(false);
    }
    private void guardar() throws TopeException, PosicionException{
        
        String comando = comandoTxT.getText();
        String funtion = funtionTxT.getText();
        LocalDate fechaActual = LocalDate.now();
        if (comando.equals("Insertar comando") || comando.isEmpty() || comando.equals("")
                || funtion.equals("Escriba una pequeña descripcion de como funciona el comando")
                || funtion.isEmpty() || funtion.equals("")) {
            
            JOptionPane.showMessageDialog(this, "INSERTE EL COMANDO", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
        CH.crearComando(maxHistorial, comando, funtion, fechaActual);
        guardarTabla();
        JOptionPane.showMessageDialog(this, "COMANDO CREADO CON EXITO"); 
        cCtxt.setText("COMANDOS CREADOS = "+maxHistorial);
        }
    }

    private void guardarTabla() throws PosicionException{
        String [][] lista= CH.mostrarComandos();
        tablaComandos.setModel(new javax.swing.table.DefaultTableModel(
            lista,
            new String [] {
                "Comando", "Funcion", "Fecha Creacion"
            }
        ));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comandoTxT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        funtionTxT = new javax.swing.JTextArea();
        crearComandoBttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaComandos = new javax.swing.JTable();
        cCtxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CREAR COMANDO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR COMANDO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 230, 37));

        comandoTxT.setBackground(new java.awt.Color(17, 16, 16));
        comandoTxT.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        comandoTxT.setForeground(new java.awt.Color(255, 255, 255));
        comandoTxT.setText("Insertar comando");
        jPanel1.add(comandoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 439, 42));

        funtionTxT.setBackground(new java.awt.Color(0, 0, 0));
        funtionTxT.setColumns(20);
        funtionTxT.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        funtionTxT.setForeground(new java.awt.Color(255, 255, 255));
        funtionTxT.setLineWrap(true);
        funtionTxT.setRows(5);
        funtionTxT.setText("Escriba una pequeña descripcion de como funciona el comando");
        funtionTxT.setWrapStyleWord(true);
        jScrollPane1.setViewportView(funtionTxT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 439, 110));

        crearComandoBttn.setBackground(new java.awt.Color(17, 17, 17));
        crearComandoBttn.setForeground(new java.awt.Color(0, 204, 204));
        crearComandoBttn.setText("CREAR");
        crearComandoBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearComandoBttnActionPerformed(evt);
            }
        });
        jPanel1.add(crearComandoBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 165, 33));

        tablaComandos.setBackground(new java.awt.Color(0, 0, 0));
        tablaComandos.setForeground(new java.awt.Color(255, 255, 255));
        tablaComandos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Comando", "Funcion", "Fecha Actual"
            }
        ));
        tablaComandos.setToolTipText("");
        jScrollPane2.setViewportView(tablaComandos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 642, 185));

        cCtxt.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cCtxt.setForeground(new java.awt.Color(0, 255, 255));
        cCtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cCtxt.setText("COMANDOS CREADOS = ??");
        jPanel1.add(cCtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 290, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AUTOR: ADRIAN HERNÁNDEZ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 680, 220, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COMANDOS MAXIMOS = 10");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearComandoBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearComandoBttnActionPerformed
        try {
            if (maxHistorial > 9) {
                maxHistorial = 10;
            }
            guardar();
            maxHistorial++;
        } catch (TopeException ex) {
            Logger.getLogger(FrmCrearComandos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PosicionException ex) {
            Logger.getLogger(FrmCrearComandos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearComandoBttnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCrearComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearComandos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cCtxt;
    private javax.swing.JTextField comandoTxT;
    private javax.swing.JButton crearComandoBttn;
    private javax.swing.JTextArea funtionTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaComandos;
    // End of variables declaration//GEN-END:variables
}
