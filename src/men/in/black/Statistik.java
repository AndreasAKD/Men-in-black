package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class Statistik extends javax.swing.JFrame {
private InfDB idb;
    public Statistik(InfDB idb) {
        initComponents();
         this.idb = idb;
         fyllAllStatistik();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        btnTillbakaEttSteg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAgenter = new javax.swing.JTextField();
        txtAliens = new javax.swing.JTextField();
        txtUtrustning = new javax.swing.JTextField();
        txtFordon = new javax.swing.JTextField();
        txtPlatser = new javax.swing.JTextField();
        txtOmraden = new javax.swing.JTextField();
        lblAgenter = new javax.swing.JLabel();
        lblAliens = new javax.swing.JLabel();
        lblUtrustning = new javax.swing.JLabel();
        lblFordon = new javax.swing.JLabel();
        lblPlatser = new javax.swing.JLabel();
        lblOmraden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrik.setText("Statistik");

        btnTillbakaEttSteg.setText("Tillbaka till menyn");
        btnTillbakaEttSteg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttStegActionPerformed(evt);
            }
        });

        jLabel1.setText("(Antal)");

        txtAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgenterActionPerformed(evt);
            }
        });

        txtAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliensActionPerformed(evt);
            }
        });

        lblAgenter.setText("Agenter:");

        lblAliens.setText("Aliens:");

        lblUtrustning.setText("Utrustning:");

        lblFordon.setText("Fordon:");

        lblPlatser.setText("Platser:");

        lblOmraden.setText("Områden:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblRubrik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbakaEttSteg))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(lblOmraden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgenter, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAliens, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUtrustning, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFordon, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPlatser, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlatser, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txtFordon)
                            .addComponent(jLabel1)
                            .addComponent(txtAgenter)
                            .addComponent(txtAliens)
                            .addComponent(txtUtrustning)
                            .addComponent(txtOmraden))
                        .addGap(55, 55, 55)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrik)
                    .addComponent(btnTillbakaEttSteg))
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgenter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAliens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAliens))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUtrustning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFordon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFordon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlatser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOmraden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmraden))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void btnTillbakaEttStegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttStegActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaEttStegActionPerformed
    public void fyllAllStatistik(){
        try {

            String fragaAgent = "SELECT COUNT(AGENT_ID) FROM AGENT;";
            String svarAgent = idb.fetchSingle(fragaAgent).toString();
            txtAgenter.setText(svarAgent);

            String fragaAlien = "SELECT COUNT(ALIEN_ID) FROM ALIEN;";
            String svarAlien = idb.fetchSingle(fragaAlien).toString();
            txtAliens.setText(svarAlien);

            String fragaUtrustning = "SELECT COUNT(UTRUSTNINGS_ID) FROM UTRUSTNING;";
            String svarUtrustning = idb.fetchSingle(fragaUtrustning).toString();
            txtUtrustning.setText(svarUtrustning);

            String fragaFordon = "SELECT COUNT(FORDONS_ID) FROM FORDON;";
            String svarFordon = idb.fetchSingle(fragaFordon).toString();
            txtFordon.setText(svarFordon);

            String fragaPlats = "SELECT COUNT(PLATS_ID) FROM PLATS;";
            String svarPlats = idb.fetchSingle(fragaPlats).toString();
            txtPlatser.setText(svarPlats);

            String fragaOmrade = "SELECT COUNT(OMRADES_ID) FROM OMRADE;";
            String svarOmrade = idb.fetchSingle(fragaOmrade).toString();
            txtOmraden.setText(svarOmrade);
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    private void txtAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgenterActionPerformed

    private void txtAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliensActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgenter;
    private javax.swing.JLabel lblAliens;
    private javax.swing.JLabel lblFordon;
    private javax.swing.JLabel lblOmraden;
    private javax.swing.JLabel lblPlatser;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblUtrustning;
    private javax.swing.JTextField txtAgenter;
    private javax.swing.JTextField txtAliens;
    private javax.swing.JTextField txtFordon;
    private javax.swing.JTextField txtOmraden;
    private javax.swing.JTextField txtPlatser;
    private javax.swing.JTextField txtUtrustning;
    // End of variables declaration//GEN-END:variables
}
