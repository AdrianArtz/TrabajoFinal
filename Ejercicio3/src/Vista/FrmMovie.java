package Vista;
//Autor: Adrian Hernández
import Controlador.ControladorMovie;
import Controlador.ControladorRatings;
import Controlador.TDA.ListaEnlazadaServices;
import Modelo.Award;
import Modelo.Enum.Tipo;
import Modelo.Ratings;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

public class FrmMovie extends javax.swing.JFrame {
    private ControladorMovie CM = new ControladorMovie();
    private ControladorRatings CR = new ControladorRatings();
    
    public FrmMovie() {
        initComponents();
        setLocationRelativeTo(this);
        oscarsTxT.setEditable(false);
        nominationsTxT.setEditable(false);
        winsTxT.setEditable(false);
    }
    
    private void guardar(Award a){
        String title = tituloTxT.getText();
        String year = yearTxT.getText();
        String rated = ratedTxT.getText();
        String released = releasedTxT.getText();
        String runtime = runtimeTxT.getText();
        String genre = genreTxT.getText();
        String director = directorTxT.getText();
        String writer  = writerTxT.getText();
        String actors = actorsTxT.getText();
        String plot = plotTxT.getText();
        String language = lenguageTxT.getText();
        String country = countryTxT.getText();
        Award award = a;
        String poster = posterTxT.getText();
        int nRatings = Integer.valueOf(ratingsSpinner.getValue().toString());

        for (int i = 0; i < nRatings; i++) {
            String source = JOptionPane.showInputDialog(this, "Source: ");
            String value = JOptionPane.showInputDialog(this, "Value: ");
            CR.crearRating(source, value);
        }
        ListaEnlazadaServices<Ratings> ratings = CR.getListaRatings();
        int metascore = Integer.valueOf(metascoreTxT.getText());
        double imdbRating = Double.valueOf(imdbRatingTxT.getText());
        long imdVotes = Long.valueOf(imdbVotesTxT.getText());
        String imdbID = imdbIDTxT.getText();
        Tipo type = Enum.valueOf(Tipo.class, typeTxT.getText());
        String DVD = dvdTxT.getText();
        long boxOffice = Long.valueOf(boxOfficeTxT.getText());
        String production = productionTxT.getText();
        String Website = websiteTxT.getText();
        boolean response;
        response = responseCheck.isSelected() == true;
        CM.crearMovie(title, year, rated, released, runtime,genre, director, writer, actors, plot, language, country, award, poster, ratings, metascore, imdbRating, imdVotes, imdbID, type, DVD, boxOffice, production, Website, response);
        System.out.println("CREADO CON EXITO");       
    }
    
    private Award obtenerAward(){
        Award award;
        if (oscarsTxT.getText().isEmpty() || nominationsTxT.getText().isEmpty() || winsTxT.getText().isEmpty()) {
            return award = new Award();
        }else{
            int oscar = Integer.valueOf(oscarsTxT.getText());
            int nominations = Integer.valueOf(nominationsTxT.getText());
            int wins = Integer.valueOf(winsTxT.getText());
            return award = new Award(oscar, wins, nominations);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tituloTxT = new javax.swing.JTextField();
        yearTxT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ratedTxT = new javax.swing.JTextField();
        releasedTxT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        runtimeTxT = new javax.swing.JTextField();
        genreTxT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        directorTxT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        actorsTxT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lenguageTxT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plotTxT = new javax.swing.JTextArea();
        countryTxT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        posterTxT = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ratingsSpinner = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        metascoreTxT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        typeTxT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        dvdTxT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        boxOfficeTxT = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        websiteTxT = new javax.swing.JTextField();
        responseCheck = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        imdbRatingTxT = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        imdbVotesTxT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        imdbIDTxT = new javax.swing.JTextField();
        okBttn = new javax.swing.JButton();
        oscarsTxT = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        oscarsCheck = new javax.swing.JCheckBox();
        nominationsTxT = new javax.swing.JTextField();
        nominationsCheck = new javax.swing.JCheckBox();
        winsCheck = new javax.swing.JCheckBox();
        winsTxT = new javax.swing.JTextField();
        writerTxT = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        productionTxT = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MOVIE");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel1.add(tituloTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 30));
        jPanel1.add(yearTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 70, 30));

        jLabel2.setText("Year");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));
        jPanel1.add(ratedTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 120, 30));
        jPanel1.add(releasedTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 210, 30));

        jLabel4.setText("Released");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jLabel5.setText("Runtime");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));
        jPanel1.add(runtimeTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 210, 30));
        jPanel1.add(genreTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 490, 30));

        jLabel6.setText("Genre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel1.add(directorTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 490, 30));

        jLabel7.setText("Director");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(actorsTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 490, 30));

        jLabel8.setText("Actors");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel1.add(lenguageTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 210, 30));

        jLabel9.setText("Lenguage");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jLabel10.setText("Plot");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        plotTxT.setColumns(20);
        plotTxT.setLineWrap(true);
        plotTxT.setRows(5);
        jScrollPane1.setViewportView(plotTxT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 378, 490, 70));
        jPanel1.add(countryTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 210, 30));

        jLabel11.setText("Country");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        posterTxT.setColumns(20);
        posterTxT.setLineWrap(true);
        posterTxT.setRows(5);
        posterTxT.setWrapStyleWord(true);
        jPanel1.add(posterTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 720, 60));

        jLabel12.setText("Poster");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel13.setText("Rated");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        ratingsSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jPanel1.add(ratingsSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 50, 30));

        jLabel14.setText("Ratings");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));
        jPanel1.add(metascoreTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 130, 30));

        jLabel16.setText("Metascore");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, -1));
        jPanel1.add(typeTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 210, 30));

        jLabel17.setText("Type");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));
        jPanel1.add(dvdTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 130, 30));

        jLabel18.setText("DVD");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, 10));
        jPanel1.add(boxOfficeTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 130, 30));

        jLabel19.setText("Box Office");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        jLabel20.setText("Website");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));
        jPanel1.add(websiteTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 130, 30));

        responseCheck.setText("Response");
        jPanel1.add(responseCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 110, -1));

        jLabel21.setText("imdbRating");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));
        jPanel1.add(imdbRatingTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 130, 30));

        jLabel22.setText("imdbVotes");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, -1, 10));
        jPanel1.add(imdbVotesTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, 130, 30));

        jLabel23.setText("imdbID");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, -1, -1));
        jPanel1.add(imdbIDTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, 130, 30));

        okBttn.setText("OK");
        okBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBttnActionPerformed(evt);
            }
        });
        jPanel1.add(okBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 485, 140, 40));
        jPanel1.add(oscarsTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 80, 30));

        jLabel24.setText("Awards");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, -1));

        oscarsCheck.setText("Oscars");
        oscarsCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                oscarsCheckItemStateChanged(evt);
            }
        });
        jPanel1.add(oscarsCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 80, -1));
        jPanel1.add(nominationsTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 110, 30));

        nominationsCheck.setText("Nominations");
        nominationsCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nominationsCheckItemStateChanged(evt);
            }
        });
        jPanel1.add(nominationsCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 110, -1));

        winsCheck.setText("Wins");
        winsCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                winsCheckItemStateChanged(evt);
            }
        });
        jPanel1.add(winsCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 410, 90, -1));
        jPanel1.add(winsTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, 90, 30));
        jPanel1.add(writerTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 490, 30));

        jLabel25.setText("Writer");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 10));
        jPanel1.add(productionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 210, 30));

        jLabel26.setText("Production");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBttnActionPerformed

        guardar(obtenerAward());
        CM.generarArchivoJson();
        
    }//GEN-LAST:event_okBttnActionPerformed

    private void oscarsCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_oscarsCheckItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            oscarsTxT.setEditable(true);
        }else{
            oscarsTxT.setEditable(false);
        }
    }//GEN-LAST:event_oscarsCheckItemStateChanged

    private void nominationsCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nominationsCheckItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            nominationsTxT.setEditable(true);
        }else{
            nominationsTxT.setEditable(false);
        }
    }//GEN-LAST:event_nominationsCheckItemStateChanged

    private void winsCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_winsCheckItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            winsTxT.setEditable(true);
        }else{
            winsTxT.setEditable(false);
        }
    }//GEN-LAST:event_winsCheckItemStateChanged

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
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actorsTxT;
    private javax.swing.JTextField boxOfficeTxT;
    private javax.swing.JTextField countryTxT;
    private javax.swing.JTextField directorTxT;
    private javax.swing.JTextField dvdTxT;
    private javax.swing.JTextField genreTxT;
    private javax.swing.JTextField imdbIDTxT;
    private javax.swing.JTextField imdbRatingTxT;
    private javax.swing.JTextField imdbVotesTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lenguageTxT;
    private javax.swing.JTextField metascoreTxT;
    private javax.swing.JCheckBox nominationsCheck;
    private javax.swing.JTextField nominationsTxT;
    private javax.swing.JButton okBttn;
    private javax.swing.JCheckBox oscarsCheck;
    private javax.swing.JTextField oscarsTxT;
    private javax.swing.JTextArea plotTxT;
    private javax.swing.JTextArea posterTxT;
    private javax.swing.JTextField productionTxT;
    private javax.swing.JTextField ratedTxT;
    private javax.swing.JSpinner ratingsSpinner;
    private javax.swing.JTextField releasedTxT;
    private javax.swing.JCheckBox responseCheck;
    private javax.swing.JTextField runtimeTxT;
    private javax.swing.JTextField tituloTxT;
    private javax.swing.JTextField typeTxT;
    private javax.swing.JTextField websiteTxT;
    private javax.swing.JCheckBox winsCheck;
    private javax.swing.JTextField winsTxT;
    private javax.swing.JTextField writerTxT;
    private javax.swing.JTextField yearTxT;
    // End of variables declaration//GEN-END:variables
}
