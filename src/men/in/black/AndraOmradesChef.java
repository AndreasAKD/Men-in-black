package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AndraOmradesChef extends javax.swing.JFrame {

    private InfDB idb;

    public AndraOmradesChef(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjOmrade();
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLabel1 = new javax.swing.JLabel();
        cbOmrade = new javax.swing.JComboBox<>();
        txtAgentNamn = new javax.swing.JTextField();
        btnSpara = new javax.swing.JButton();
        lblAndringSparad = new javax.swing.JLabel();
        btnTillbakaEttSteg7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtLabel1.setText("Ändra områdeschef");

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        btnTillbakaEttSteg7.setText("Tillbaka till menyn");
        btnTillbakaEttSteg7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttSteg7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTillbakaEttSteg7)
                    .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSpara, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addComponent(cbOmrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAgentNamn)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSpara)
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaEttSteg7)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void fyllCbValjOmrade() {
        String fraga = "SELECT BENAMNING from OMRADE;";

        ArrayList<String> allaOmraden;

        try {

            allaOmraden = idb.fetchColumn(fraga);

            for (String omrade : allaOmraden) {
                cbOmrade.addItem(omrade);// fyller combobox med alla områden från databasen
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

    }
    
    
    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed

        if (Validering.textFaltHarVarde(txtAgentNamn)) 
        
        try {
            String valtOmrade = cbOmrade.getSelectedItem().toString();
            String angivenChef = txtAgentNamn.getText();

            String fraga1 = "SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = '" + valtOmrade + "';";
            String svar1 = idb.fetchSingle(fraga1);

            String fraga2 = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + angivenChef + "';";
            String svar2 = idb.fetchSingle(fraga2);

            String fraga3 = "UPDATE OMRADESCHEF SET AGENT_ID = '" + svar2 + "' WHERE OMRADE = '" + svar1 + "';";
            idb.update(fraga3);             // uppdaterar databasen med angiven agent för det valda området

            lblAndringSparad.setText("Ändring sparad!");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Den angivna agenten existerar inte!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnTillbakaEttSteg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg7ActionPerformed
    close();
    }//GEN-LAST:event_btnTillbakaEttSteg7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTillbakaEttSteg7;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JLabel txtLabel1;
    // End of variables declaration//GEN-END:variables
}
