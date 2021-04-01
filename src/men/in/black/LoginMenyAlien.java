package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

public class LoginMenyAlien extends javax.swing.JFrame {

    private InfDB idb;
    private static String sparatId;

    public LoginMenyAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnvandarId = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        txtAnvandarid = new javax.swing.JTextField();
        pswLosenAlien = new javax.swing.JPasswordField();
        btnTillbakaMeny = new javax.swing.JButton();
        btnLoginAlien = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAnvandarId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnvandarId.setText("AnvändarID:");

        lblLosenord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLosenord.setText("Lösenord:");

        pswLosenAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswLosenAlienActionPerformed(evt);
            }
        });

        btnTillbakaMeny.setText("Tillbaka till huvudmenyn");
        btnTillbakaMeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaMenyActionPerformed(evt);
            }
        });

        btnLoginAlien.setText("Logga in");
        btnLoginAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAlienActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRubrik.setText("Logga in som Alien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRubrik)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblLosenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoginAlien))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnTillbakaMeny, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(pswLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(lblAnvandarId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAnvandarid, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnvandarid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnvandarId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLosenord)
                    .addComponent(pswLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLoginAlien)
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaMeny)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String getSparatId() {
        return sparatId;
    }
    
    private void pswLosenAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswLosenAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswLosenAlienActionPerformed

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
  
    private void btnTillbakaMenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaMenyActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaMenyActionPerformed

    private void btnLoginAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAlienActionPerformed
        if (Validering.textFaltHarVarde(txtAnvandarid) && Validering.losenordFaltHarVarde(pswLosenAlien)) {

            try {
                String anvid = txtAnvandarid.getText();
                String sparadAnv = anvid;

                String losen = pswLosenAlien.getText();

                String fragalosen = "SELECT LOSENORD FROM ALIEN WHERE ALIEN_ID =" + anvid;

                String svar = idb.fetchSingle(fragalosen);

                if (anvid.trim().equals(anvid) && losen.trim().equals(svar)) {
                    AlienMeny menyAlien = new AlienMeny(idb);
                    sparatId = sparadAnv; // Sparar ID i fältet för användning senare med Get-metod i andra fönster.
                    menyAlien.setVisible(true);
                    close();

                } else {
                    JOptionPane.showMessageDialog(null, "Felaktigt användarnamn eller lösenord!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fel");
            }
        }
    }//GEN-LAST:event_btnLoginAlienActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAlien;
    private javax.swing.JButton btnTillbakaMeny;
    private javax.swing.JLabel lblAnvandarId;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JPasswordField pswLosenAlien;
    private javax.swing.JTextField txtAnvandarid;
    // End of variables declaration//GEN-END:variables
}
