package men.in.black;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HuvudFonster extends javax.swing.JFrame {

    private InfDB idb;

    public HuvudFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltext2 = new javax.swing.JLabel();
        btnAgent = new javax.swing.JButton();
        btnAlien = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        lbltext1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltext2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbltext2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltext2.setText("Men in black Sektor Skandinavien");
        lbltext2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbltext2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAgent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgent.setText("Agent");
        btnAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentActionPerformed(evt);
            }
        });

        btnAlien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlien.setText("Alien");
        btnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlienActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        lbltext1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltext1.setText("Vänligen välj något av följande inloggningsalternativ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbltext2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lbltext1)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbltext2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lbltext1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentActionPerformed
        LoginMenyAgent agentFonster = new LoginMenyAgent(idb);
        agentFonster.setVisible(true);
    }//GEN-LAST:event_btnAgentActionPerformed

    private void btnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlienActionPerformed
        LoginMenyAlien alienFonster = new LoginMenyAlien(idb);
        alienFonster.setVisible(true);
    }//GEN-LAST:event_btnAlienActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        LoginMenyAdmin adminFonster = new LoginMenyAdmin(idb);
        adminFonster.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAgent;
    private javax.swing.JButton btnAlien;
    private javax.swing.JLabel lbltext1;
    private javax.swing.JLabel lbltext2;
    // End of variables declaration//GEN-END:variables
}
