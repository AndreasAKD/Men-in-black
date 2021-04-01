package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class TaBortAgent extends javax.swing.JFrame {

    private InfDB idb;

    public TaBortAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        lblAngeAgent = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
        txtAngivenAgent = new javax.swing.JTextField();
        lblAgentBorttagen = new javax.swing.JLabel();
        btnTillbakaEttSteg2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRubrik.setText("Ta bort Agent");

        lblAngeAgent.setText("Ange Agent:");

        btnTaBort.setText("ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAngeAgent)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaBort)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAngivenAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(lblAgentBorttagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnTillbakaEttSteg2))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeAgent)
                    .addComponent(txtAngivenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAgentBorttagen, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaBort)
                .addGap(29, 29, 29)
                .addComponent(btnTillbakaEttSteg2)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    
    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed

        if (Validering.textFaltHarVarde(txtAngivenAgent))
            
            try {
            String angivenAgent = txtAngivenAgent.getText();
            String fraga1 = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + angivenAgent + "';";
            String svar1 = idb.fetchSingle(fraga1);

            String fraga2 = "DELETE FROM AGENT WHERE AGENT_ID = '" + svar1 + "';";
            idb.delete(fraga2);

            lblAgentBorttagen.setText("Agent borttagen!");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Den angivna agenten existerar inte!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnTillbakaEttSteg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg2ActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaEttSteg2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbakaEttSteg2;
    private javax.swing.JLabel lblAgentBorttagen;
    private javax.swing.JLabel lblAngeAgent;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextField txtAngivenAgent;
    // End of variables declaration//GEN-END:variables
}
