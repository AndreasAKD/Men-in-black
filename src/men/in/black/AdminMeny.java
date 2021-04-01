package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import oru.inf.InfDB;

public class AdminMeny extends javax.swing.JFrame {
 private InfDB idb;

    public AdminMeny(InfDB idb) {
        initComponents();
         this.idb = idb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNyregistreraAlien = new javax.swing.JButton();
        btnAndraInfoAlien = new javax.swing.JButton();
        btnTaBortAlien = new javax.swing.JButton();
        btnTaBortUtrustning = new javax.swing.JButton();
        btnNyRegistreraAgent = new javax.swing.JButton();
        btnTilldelaAdmin = new javax.swing.JButton();
        btnAndraInfoAgent = new javax.swing.JButton();
        btnTaBortAgent = new javax.swing.JButton();
        btnAndraOmradeschef = new javax.swing.JButton();
        btnAndraKontorschef = new javax.swing.JButton();
        btnTillbakaEttSteg = new javax.swing.JButton();
        btnAndraKontorschef1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meny Admin");

        btnNyregistreraAlien.setText("Nyregistrera Alien");
        btnNyregistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyregistreraAlienActionPerformed(evt);
            }
        });

        btnAndraInfoAlien.setText("Ändra information Alien");
        btnAndraInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoAlienActionPerformed(evt);
            }
        });

        btnTaBortAlien.setText("Ta bort Alien");
        btnTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienActionPerformed(evt);
            }
        });

        btnTaBortUtrustning.setText("Ta bort utrustning");
        btnTaBortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortUtrustningActionPerformed(evt);
            }
        });

        btnNyRegistreraAgent.setText("Nyregistrera Agent");
        btnNyRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyRegistreraAgentActionPerformed(evt);
            }
        });

        btnTilldelaAdmin.setText("Tilldela adminstatus");
        btnTilldelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTilldelaAdminActionPerformed(evt);
            }
        });

        btnAndraInfoAgent.setText("Ändra information Agent");
        btnAndraInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoAgentActionPerformed(evt);
            }
        });

        btnTaBortAgent.setText("Ta bort Agent");
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
            }
        });

        btnAndraOmradeschef.setText("Ändra områdeschef");
        btnAndraOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraOmradeschefActionPerformed(evt);
            }
        });

        btnAndraKontorschef.setText("Ändra kontorschef");
        btnAndraKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraKontorschefActionPerformed(evt);
            }
        });

        btnTillbakaEttSteg.setText("Tillbaka till inloggning");
        btnTillbakaEttSteg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttStegActionPerformed(evt);
            }
        });

        btnAndraKontorschef1.setText("Visa statistik");
        btnAndraKontorschef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraKontorschef1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNyregistreraAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAndraInfoAlien, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btnTaBortAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNyRegistreraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaBortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTilldelaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 530, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAndraInfoAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnTillbakaEttSteg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaBortAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAndraOmradeschef, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addComponent(btnAndraKontorschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAndraKontorschef1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTaBortAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnAndraInfoAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAndraOmradeschef, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnTaBortAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraKontorschef1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNyRegistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAndraKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnTilldelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTillbakaEttSteg))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNyregistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyregistreraAlienActionPerformed
     RegistreraAlien nyttRegistreraAlienFonster = new RegistreraAlien(idb);
        nyttRegistreraAlienFonster.setVisible(true);
    }//GEN-LAST:event_btnNyregistreraAlienActionPerformed

    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed
        TaBortAlien nyttTaBortAlienFonster = new TaBortAlien(idb);
        nyttTaBortAlienFonster.setVisible(true);
    }//GEN-LAST:event_btnTaBortAlienActionPerformed

    private void btnAndraKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraKontorschefActionPerformed
        AndraKontorsChef nyttFonsterAndraKontorsChef = new AndraKontorsChef(idb);
        nyttFonsterAndraKontorsChef.setVisible(true);
    }//GEN-LAST:event_btnAndraKontorschefActionPerformed

    private void btnNyRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyRegistreraAgentActionPerformed
        RegistreraAgenter nyttFonsterRegistreraAgent = new RegistreraAgenter(idb);
        nyttFonsterRegistreraAgent.setVisible(true);
    }//GEN-LAST:event_btnNyRegistreraAgentActionPerformed

    private void btnAndraInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoAlienActionPerformed
        AndraAllInformationAlien nyttFonsterAndraAllAlien = new AndraAllInformationAlien(idb);
        nyttFonsterAndraAllAlien.setVisible(true);
    }//GEN-LAST:event_btnAndraInfoAlienActionPerformed

    private void btnAndraInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoAgentActionPerformed
        AndraInformationAgenter nyttFonsterAndraAgent = new AndraInformationAgenter(idb);
        nyttFonsterAndraAgent.setVisible(true);
    }//GEN-LAST:event_btnAndraInfoAgentActionPerformed

    private void btnAndraOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraOmradeschefActionPerformed
       AndraOmradesChef nyttFonsterAndraOmradesChef = new AndraOmradesChef(idb);
       nyttFonsterAndraOmradesChef.setVisible(true);
    }//GEN-LAST:event_btnAndraOmradeschefActionPerformed

    private void btnTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentActionPerformed
        TaBortAgent nyttFonsterTaBortAgent = new TaBortAgent(idb);
        nyttFonsterTaBortAgent.setVisible(true);
    }//GEN-LAST:event_btnTaBortAgentActionPerformed

    private void btnTilldelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTilldelaAdminActionPerformed
        TilldelaAdminStatus nyttFonsterAdminStatus = new TilldelaAdminStatus(idb);
        nyttFonsterAdminStatus.setVisible(true);
    }//GEN-LAST:event_btnTilldelaAdminActionPerformed

    private void btnTaBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortUtrustningActionPerformed
        TaBortUtrustning NyttFonsterTaBortUtrustning = new TaBortUtrustning(idb);
        NyttFonsterTaBortUtrustning.setVisible(true);
    }//GEN-LAST:event_btnTaBortUtrustningActionPerformed

    private void btnTillbakaEttStegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttStegActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaEttStegActionPerformed

    private void btnAndraKontorschef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraKontorschef1ActionPerformed
        Statistik nyttFonsterStatistik = new Statistik(idb);
        nyttFonsterStatistik.setVisible(true);
    }//GEN-LAST:event_btnAndraKontorschef1ActionPerformed
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInfoAgent;
    private javax.swing.JButton btnAndraInfoAlien;
    private javax.swing.JButton btnAndraKontorschef;
    private javax.swing.JButton btnAndraKontorschef1;
    private javax.swing.JButton btnAndraOmradeschef;
    private javax.swing.JButton btnNyRegistreraAgent;
    private javax.swing.JButton btnNyregistreraAlien;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JButton btnTaBortUtrustning;
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JButton btnTilldelaAdmin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
