package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

public class AndraLosenordAlien extends javax.swing.JFrame {

    private InfDB idb;

    public AndraLosenordAlien(InfDB idb) {
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

        jLabel2 = new javax.swing.JLabel();
        losenText = new javax.swing.JPasswordField();
        andraLosen = new javax.swing.JToggleButton();
        lblAndringSparad = new javax.swing.JLabel();
        btnTillbakaEttSteg2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nytt lösenord: ");

        andraLosen.setText("Ändra");
        andraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenActionPerformed(evt);
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
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(andraLosen)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(losenText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTillbakaEttSteg2)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnTillbakaEttSteg2)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(losenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(andraLosen)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void andraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenActionPerformed

        if (Validering.losenordFaltHarVarde(losenText) && Validering.langdLosenord(losenText)) {

            try {
                String alienId = LoginMenyAlien.getSparatId();
                // Denna variabel hämtar ID som sparats när man loggat in som agent 
                //i klassen LoginMenyAgent. Detta för att användare inte ska behöva skriva in sitt eget ID 
                //igen plus att om man kunde göra det så skulle man kunna ändra lösen på vilken annan agent som helst.

                String nyttLosen = losenText.getText();
                String fraga = "UPDATE ALIEN SET LOSENORD ='" + nyttLosen + "' WHERE ALIEN_ID =" + alienId;
                idb.update(fraga);
                lblAndringSparad.setText("Ändring sparad");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lösenordet får inte vara längre än 6 tecken!");
            }
        }
    }//GEN-LAST:event_andraLosenActionPerformed

    private void btnTillbakaEttSteg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg2ActionPerformed
     close();
    }//GEN-LAST:event_btnTillbakaEttSteg2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton andraLosen;
    private javax.swing.JButton btnTillbakaEttSteg2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JPasswordField losenText;
    // End of variables declaration//GEN-END:variables
}
