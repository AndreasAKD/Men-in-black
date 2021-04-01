package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraUtrustning extends javax.swing.JFrame {
 private final InfDB idb;

    public RegistreraUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbTyp();
    }
    
    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        cbTyp = new javax.swing.JComboBox<>();
        txtValtTyp = new javax.swing.JLabel();
        lblFriText = new javax.swing.JLabel();
        txtFriText = new javax.swing.JTextField();
        btnRegistrera = new javax.swing.JButton();
        lblBenamning = new javax.swing.JLabel();
        txtBenamning = new javax.swing.JTextField();
        lblRegistrerad = new javax.swing.JLabel();
        btnTillbakaEttSteg7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Registrera utrustning");

        cbTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypActionPerformed(evt);
            }
        });

        txtValtTyp.setText("Välj typ:");

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        lblBenamning.setText("Benämning:");

        btnTillbakaEttSteg7.setText("Tillbaka till menyn");
        btnTillbakaEttSteg7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttSteg7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(lblRegistrerad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTillbakaEttSteg7))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtValtTyp)
                            .addGap(18, 18, 18)
                            .addComponent(cbTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFriText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBenamning))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFriText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBenamning, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValtTyp))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFriText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFriText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBenamning)
                    .addComponent(txtBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRegistrera)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRegistrerad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbakaEttSteg7))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void fyllCbTyp() {

        cbTyp.addItem("Vapen");
        cbTyp.addItem("Teknik");
        cbTyp.addItem("Kommunikation");
    }

    private void cbTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypActionPerformed
        if (cbTyp.getSelectedItem().toString().equals("Vapen")) {
            lblFriText.setText("Kaliber:");
        }
        if (cbTyp.getSelectedItem().toString().equals("Teknik")) {
            lblFriText.setText("Kraftkälla:");
        }
        if (cbTyp.getSelectedItem().toString().equals("Kommunikation")) {
            lblFriText.setText("Överföringsteknik:");
        }
    }//GEN-LAST:event_cbTypActionPerformed

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed

        if (Validering.isHeltal(txtFriText) && Validering.textFaltHarVarde(txtBenamning) && Validering.langdBenamning(txtBenamning) && Validering.langdBenamning(txtFriText)) {
            try {
                String nyttId = idb.getAutoIncrement("UTRUSTNING", "UTRUSTNINGS_ID"); 
                //Autogenerering av nytt unikt ID, blir alltid det maximala ID som existerar +1.

                String angivenInfo = txtFriText.getText();
                String benamning = txtBenamning.getText();

                String fraga1 = "INSERT INTO UTRUSTNING VALUES (" + nyttId + ",'" + benamning + "');";
                idb.insert(fraga1);

                if (cbTyp.getSelectedItem().toString().equals("Vapen")) {

                    String fraga2 = "INSERT INTO VAPEN VALUES (" + nyttId + ",'" + angivenInfo + "');";
                    idb.insert(fraga2);
                    lblRegistrerad.setText("Utrustning registrerad!");
                } else if (cbTyp.getSelectedItem().toString().equals("Teknik")) {

                    String fraga3 = "INSERT INTO TEKNIK VALUES (" + nyttId + ",'" + angivenInfo + "');";
                    idb.insert(fraga3);
                    lblRegistrerad.setText("Utrustning registrerad!");
                } else if (cbTyp.getSelectedItem().toString().equals("Kommunikation")) {

                    String fraga4 = "INSERT INTO KOMMUNIKATION VALUES (" + nyttId + ",'" + angivenInfo + "');";
                    idb.insert(fraga4);
                    lblRegistrerad.setText("Utrustning registrerad!");
                }

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                System.out.println("Internt felmeddelande" + e.getMessage());

            }
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void btnTillbakaEttSteg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg7ActionPerformed
      close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnTillbakaEttSteg7;
    private javax.swing.JComboBox<String> cbTyp;
    private javax.swing.JLabel lblBenamning;
    private javax.swing.JLabel lblFriText;
    private javax.swing.JLabel lblRegistrerad;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextField txtBenamning;
    private javax.swing.JTextField txtFriText;
    private javax.swing.JLabel txtValtTyp;
    // End of variables declaration//GEN-END:variables
}
