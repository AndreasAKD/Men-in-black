package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

public class LoginMenyAdmin extends javax.swing.JFrame {

    private InfDB idb;

    public LoginMenyAdmin(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnvandarId = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        Anvandaridtext = new javax.swing.JTextField();
        LosenAdmin = new javax.swing.JPasswordField();
        btnTillbakaMeny = new javax.swing.JButton();
        btnLoginAdmin = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAnvandarId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnvandarId.setText("AnvändarID:");

        lblLosenord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLosenord.setText("Lösenord:");

        LosenAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LosenAdminActionPerformed(evt);
            }
        });

        btnTillbakaMeny.setText("Tillbaka till huvudmenyn");
        btnTillbakaMeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaMenyActionPerformed(evt);
            }
        });

        btnLoginAdmin.setText("Logga in");
        btnLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdminActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRubrik.setText("Logga in som administratör");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRubrik, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblAnvandarId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Anvandaridtext, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblLosenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LosenAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                        .addGap(331, 331, 331))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTillbakaMeny, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoginAdmin))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anvandaridtext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnvandarId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(LosenAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLoginAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaMeny)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LosenAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LosenAdminActionPerformed

    }//GEN-LAST:event_LosenAdminActionPerformed
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void btnTillbakaMenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaMenyActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaMenyActionPerformed

    private void btnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdminActionPerformed
        if (Validering.textFaltHarVarde(Anvandaridtext) && Validering.losenordFaltHarVarde(LosenAdmin)) {
            try {
                String anvid = Anvandaridtext.getText();
                String losen = LosenAdmin.getText();
                String fragalosen = "SELECT LOSENORD FROM AGENT WHERE AGENT_ID =" + anvid;
                String svar = idb.fetchSingle(fragalosen);

                String fragaAdmin = "SELECT ADMINISTRATOR FROM AGENT WHERE AGENT_ID =" + anvid;
                String svaret = idb.fetchSingle(fragaAdmin);

                if (anvid.trim().equals(anvid) && losen.trim().equals(svar) && svaret.equals("J")) {
                    AdminMeny menyAdmin = new AdminMeny(idb);
                    menyAdmin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Felaktigt användarnamn eller lösenord!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fel");
            }
        }
    }//GEN-LAST:event_btnLoginAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Anvandaridtext;
    private javax.swing.JPasswordField LosenAdmin;
    private javax.swing.JButton btnLoginAdmin;
    private javax.swing.JButton btnTillbakaMeny;
    private javax.swing.JLabel lblAnvandarId;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
