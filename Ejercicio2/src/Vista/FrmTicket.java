package Vista;

import Controlador.ControladorTicket;
import Exception.PosicionException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class FrmTicket extends javax.swing.JFrame {

    private FrmTablaSolicitudes TS;
    private LocalDate fA = LocalDate.now();
    private ControladorTicket CT = new ControladorTicket();

    public FrmTicket() {
        initComponents();
        setLocationRelativeTo(this);
        fechaReclamo.setText("" + fA);
        fechaReclamo.setEditable(false);
    }

    private void guardarTicket() throws PosicionException {
        String nombre = nombreTxT.getText();
        String cedulaoRuc = cedulaoRucTxT.getText();
        String motivo = motivoTxT.getText();
        int oficina = Integer.valueOf(oficinaTxT.getText());
        LocalDate fechaActual = LocalDate.parse(fechaReclamo.getText());
        LocalDate fechaSiguiente = LocalDate.parse(fechaReservada.getText());

        if (fechaActual.equals(fechaSiguiente)) {
            JOptionPane.showMessageDialog(this, "No se puede reservar el mismo día", "AVISO", JOptionPane.WARNING_MESSAGE);
        } else {
            CT.crearTicket(oficina, nombre, cedulaoRuc, motivo, fechaActual, fechaSiguiente);
            reiniciarDatos();
        }
    }

    private void reiniciarDatos() {
        nombreTxT.setText("");
        cedulaoRucTxT.setText("");
        motivoTxT.setText("");
        oficinaTxT.setText("");
        fechaReclamo.setText("" + fA);
        fechaReservada.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreTxT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaReservada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fechaReclamo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        motivoTxT = new javax.swing.JTextField();
        generarTicketbttn = new javax.swing.JButton();
        cedulaoRucTxT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        oficinaTxT = new javax.swing.JTextField();
        verSolicitudbttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GENERAR TICKET");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("GENERAR TICKET");
        panelContent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 170, 70));

        jLabel4.setText("Nombre Completo");
        panelContent.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, -1));
        panelContent.add(nombreTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 530, 30));

        jLabel2.setText("Fecha de Reserva");
        panelContent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 160, -1));
        panelContent.add(fechaReservada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 240, 30));

        jLabel5.setText("Fecha de Reclamo");
        panelContent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 160, -1));

        fechaReclamo.setText("XXXX-XX-XX");
        panelContent.add(fechaReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 30));

        jLabel6.setText("Motivo");
        panelContent.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 20));
        panelContent.add(motivoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 530, 30));

        generarTicketbttn.setText("GENERAR SOLICITUD");
        generarTicketbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarTicketbttnActionPerformed(evt);
            }
        });
        panelContent.add(generarTicketbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 160, 40));
        panelContent.add(cedulaoRucTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 340, 30));

        jLabel3.setText("Cedula o Ruc");
        panelContent.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 160, -1));

        jLabel7.setText("Oficina");
        panelContent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 160, 10));
        panelContent.add(oficinaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 340, 30));

        verSolicitudbttn.setText("VER SOLICITUDES");
        verSolicitudbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSolicitudbttnActionPerformed(evt);
            }
        });
        panelContent.add(verSolicitudbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 160, 40));

        getContentPane().add(panelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarTicketbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarTicketbttnActionPerformed
        try {
            guardarTicket();
        } catch (PosicionException ex) {
        }
    }//GEN-LAST:event_generarTicketbttnActionPerformed

    private void verSolicitudbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSolicitudbttnActionPerformed
        if (TS != null) {
            TS.setVisible(true);
        } else {
            if (getCT().getPilaTicket() == null) {
                TS = new FrmTablaSolicitudes();
            } else {
                try {
                    TS = new FrmTablaSolicitudes(getCT());

                } catch (PosicionException ex) {
                }
            }
            TS.setVisible(true);
        }
    }//GEN-LAST:event_verSolicitudbttnActionPerformed

    public ControladorTicket getCT() {
        return CT;
    }

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
            java.util.logging.Logger.getLogger(FrmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaoRucTxT;
    private javax.swing.JTextField fechaReclamo;
    private javax.swing.JTextField fechaReservada;
    private javax.swing.JButton generarTicketbttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField motivoTxT;
    private javax.swing.JTextField nombreTxT;
    private javax.swing.JTextField oficinaTxT;
    private javax.swing.JPanel panelContent;
    private javax.swing.JButton verSolicitudbttn;
    // End of variables declaration//GEN-END:variables
}
