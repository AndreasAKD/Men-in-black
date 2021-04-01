package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

public class AndraLosenordAgent extends javax.swing.JFrame {

    private InfDB idb;

    public AndraLosenordAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLosenord = new javax.swing.JLabel();
        txtLosen = new javax.swing.JPasswordField();
        andraLosen = new javax.swing.JToggleButton();
        lblAndringSparad = new javax.swing.JLabel();
        lblAndringSparad1 = new javax.swing.JLabel();
        btnTillbakaEttSteg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtLosenord.setText("Nytt lösenord: ");

        andraLosen.setText("Ändra");
        andraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenActionPerformed(evt);
            }
        });

        btnTillbakaEttSteg.setText("Tillbaka till menyn");
        btnTillbakaEttSteg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttStegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAndringSparad1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTillbakaEttSteg, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(andraLosen)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLosenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnTillbakaEttSteg)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLosenord)
                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAndringSparad1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(andraLosen)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void andraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenActionPerformed

        if (Validering.losenordFaltHarVarde(txtLosen) && Validering.langdLosenord(txtLosen)) {

            try {
                String agentId = LoginMenyAgent.getSparatId();
                // Denna variabel hämtar ID som sparats när man loggat in som agent 
                //i klassen LoginMenyAgent. Detta för att användare inte ska behöva skriva in sitt eget ID 
                //igen plus att om man kunde göra det så skulle man kunna ändra lösen på vilken annan agent som helst.

                String nyttLosen = txtLosen.getText();
                String fraga = "UPDATE AGENT SET LOSENORD ='" + nyttLosen + "' WHERE AGENT_ID =" + agentId;
                idb.update(fraga);
                lblAndringSparad.setText("Ändring sparad");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lösenordet får inte vara längre än 6 tecken!");
            }
        }
    }//GEN-LAST:event_andraLosenActionPerformed

    private void btnTillbakaEttStegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttStegActionPerformed
        close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttStegActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton andraLosen;
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblAndringSparad1;
    private javax.swing.JPasswordField txtLosen;
    private javax.swing.JLabel txtLosenord;
    // End of variables declaration//GEN-END:variables
}
