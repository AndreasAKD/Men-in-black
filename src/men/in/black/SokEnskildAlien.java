package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class SokEnskildAlien extends javax.swing.JFrame {
private final InfDB idb;

    public SokEnskildAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        lblSokAlien = new javax.swing.JLabel();
        txtSokNamn = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultat = new javax.swing.JTextArea();
        btnTillbakaEttSteg2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrik.setText("Sök Alieninfo");

        lblSokAlien.setText("Sök Alien:");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        txtAreaResultat.setColumns(20);
        txtAreaResultat.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultat);

        btnTillbakaEttSteg2.setText("Tillbaka till menyn");
        btnTillbakaEttSteg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttSteg2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRubrik)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSokAlien)
                                .addGap(18, 18, 18)
                                .addComponent(txtSokNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSok))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                .addComponent(btnTillbakaEttSteg2)
                                .addGap(34, 34, 34))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrik)
                    .addComponent(btnTillbakaEttSteg2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSokAlien)
                    .addComponent(txtSokNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        if (Validering.textFaltHarVarde(txtSokNamn)) {
            txtAreaResultat.setText(" ");
        }
        txtAreaResultat.append("ID:" + "\t");
        txtAreaResultat.append(" " + "Namn:" + "\t");
        txtAreaResultat.append(" " + "Lösenord:" + "\t");
        txtAreaResultat.append(" " + "Reg. Datum:" + "\t");
        txtAreaResultat.append(" " + "Telefon:" + "\t");
        txtAreaResultat.append(" " + "Plats:" + "\t");
        txtAreaResultat.append(" " + "Ansv. Agent:" + "\n");
        ArrayList<HashMap<String, String>> soktaAliens;

        try {
            String sokNamn = txtSokNamn.getText();
            String fraga = "SELECT * FROM ALIEN WHERE NAMN = '" + sokNamn + "';";
            soktaAliens = idb.fetchRows(fraga);

            for (HashMap<String, String> alien : soktaAliens) {
                txtAreaResultat.append(alien.get("ALIEN_ID") + "\t");
                txtAreaResultat.append(" " + alien.get("NAMN") + "\t");
                txtAreaResultat.append(" " + alien.get("LOSENORD") + "\t");
                txtAreaResultat.append(" " + alien.get("REGISTRERINGSDATUM") + "\t");
                txtAreaResultat.append(" " + alien.get("TELEFON") + "\t");

                String fragaPlats = "SELECT BENAMNING FROM PLATS WHERE PLATS_ID = '" + alien.get("PLATS") + "';";
                String svarPlats = idb.fetchSingle(fragaPlats);
                txtAreaResultat.append(" " + svarPlats + "\t");

                String fragaAnsvAgent = " SELECT NAMN FROM AGENT WHERE AGENT_ID = '" + alien.get("ANSVARIG_AGENT") + "';";
                String svarAnsvAgent = idb.fetchSingle(fragaAnsvAgent);
                txtAreaResultat.append(" " + svarAnsvAgent + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Fel");
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Vänligen sök efter en Alien");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnTillbakaEttSteg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg2ActionPerformed
           close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTillbakaEttSteg2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblSokAlien;
    private javax.swing.JTextArea txtAreaResultat;
    private javax.swing.JTextField txtSokNamn;
    // End of variables declaration//GEN-END:variables

}
