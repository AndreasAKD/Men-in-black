package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class TilldelaAdminStatus extends javax.swing.JFrame {
private InfDB idb;

    public TilldelaAdminStatus(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        txtAngivenAgent = new javax.swing.JTextField();
        lblAngeAgent = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblSparat = new javax.swing.JLabel();
        btnTillbakaEttSteg4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Tilldela Adminstatus");

        txtAngivenAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngivenAgentActionPerformed(evt);
            }
        });

        lblAngeAgent.setText("Ange Agent:");

        jButton1.setText("Spara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTillbakaEttSteg4.setText("Tillbaka till menyn");
        btnTillbakaEttSteg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttSteg4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAngeAgent)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAngivenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSparat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnTillbakaEttSteg4))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngivenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAngeAgent))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(lblSparat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTillbakaEttSteg4)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Validering.textFaltHarVarde(txtAngivenAgent))
            
            try {

            String angivenAgent = txtAngivenAgent.getText();
            String fraga1 = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + angivenAgent + "';";
            String svar1 = idb.fetchSingle(fraga1);

            String fraga2 = "UPDATE AGENT SET ADMINISTRATOR = 'J' WHERE AGENT_ID = '" + svar1 + "';";
            idb.update(fraga2);

            lblSparat.setText("Sparat!");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Den angivna agenten existerar inte!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAngivenAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngivenAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngivenAgentActionPerformed

    private void btnTillbakaEttSteg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg4ActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaEttSteg4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaEttSteg2;
    private javax.swing.JButton btnTillbakaEttSteg3;
    private javax.swing.JButton btnTillbakaEttSteg4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAngeAgent;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblSparat;
    private javax.swing.JTextField txtAngivenAgent;
    // End of variables declaration//GEN-END:variables
}
