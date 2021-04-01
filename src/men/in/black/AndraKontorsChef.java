package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AndraKontorsChef extends javax.swing.JFrame {

    private InfDB idb;

    public AndraKontorsChef(InfDB idb) {
        initComponents();

        this.idb = idb;
        fyllCbValjKontor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLabel1 = new javax.swing.JLabel();
        cbKontor = new javax.swing.JComboBox<>();
        btnSpara = new javax.swing.JButton();
        lblAndringSparad = new javax.swing.JLabel();
        txtAgentNamn = new javax.swing.JTextField();
        btnTillbakaEttSteg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtLabel1.setText("Ändra kontorschef");

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAgentNamn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbKontor, javax.swing.GroupLayout.Alignment.LEADING, 0, 99, Short.MAX_VALUE))
                            .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnTillbakaEttSteg, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cbKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSpara)
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaEttSteg)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fyllCbValjKontor() {
        String fraga = "SELECT KONTORSBETECKNING from KONTORSCHEF;";

        ArrayList<String> allaKontor;

        try {

            allaKontor = idb.fetchColumn(fraga);

            for (String kontor : allaKontor) {
                cbKontor.addItem(kontor);
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    
    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    
    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed

        if (Validering.textFaltHarVarde(txtAgentNamn)) 

        try {
            String valtKontor = cbKontor.getSelectedItem().toString();
            String angivenChef = txtAgentNamn.getText();

            String fraga1 = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + angivenChef + "';";
            String svar1 = idb.fetchSingle(fraga1);

            String fraga2 = "UPDATE KONTORSCHEF SET AGENT_ID = '" + svar1 + "' WHERE KONTORSBETECKNING = '" + valtKontor + "';";
            idb.update(fraga2);
            lblAndringSparad.setText("Ändring sparad!");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Den angivna agenten existerar inte!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnTillbakaEttStegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttStegActionPerformed
        close();  //Anropar metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttStegActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JComboBox<String> cbKontor;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JLabel txtLabel1;
    // End of variables declaration//GEN-END:variables
}
