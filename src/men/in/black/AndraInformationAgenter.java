package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AndraInformationAgenter extends javax.swing.JFrame {

    private final InfDB idb;

    public AndraInformationAgenter(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjOmrade();
        fyllCbAdmin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        txtAgentNamn = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        txtNyttTelefonnummer = new javax.swing.JTextField();
        lblLosenord = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JPasswordField();
        cbOmrade = new javax.swing.JComboBox<>();
        lblOmråde = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblAndringSparad = new javax.swing.JLabel();
        cbAdmin = new javax.swing.JComboBox<>();
        lblAdminstatus = new javax.swing.JLabel();
        btnTillbakaEttSteg1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Ändra information Agent");

        lblNamn.setText("Gäller agent med Namn:");

        lblTelefon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefon.setText("Nytt Telefonnummer:");

        lblLosenord.setText("Nytt Lösenord:");

        txtLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLosenordActionPerformed(evt);
            }
        });

        lblOmråde.setText("Nytt område:");

        jButton1.setText("Ändra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAdminstatus.setText("Adminstatus:");

        btnTillbakaEttSteg1.setText("Tillbaka till menyn");
        btnTillbakaEttSteg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttSteg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(lblNamn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLosenord, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblOmråde, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAdminstatus, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbAdmin, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAgentNamn)
                                    .addComponent(txtNyttTelefonnummer)
                                    .addComponent(txtLosenord)
                                    .addComponent(cbOmrade, 0, 100, Short.MAX_VALUE))))
                        .addGap(96, 96, 96)
                        .addComponent(btnTillbakaEttSteg1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNyttTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmråde))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdminstatus))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnTillbakaEttSteg1))
                .addGap(18, 18, 18)
                .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLosenordActionPerformed

    }//GEN-LAST:event_txtLosenordActionPerformed
    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    private void fyllCbAdmin() {

        ArrayList<String> admin = new ArrayList<String>();
        admin.add("Ja");
        admin.add("Nej");
        try {

            for (String admins : admin) {
                cbAdmin.addItem(admins);
            }

        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Validering.textFaltHarVarde(txtNyttTelefonnummer)
                && Validering.textFaltHarVarde(txtLosenord) && Validering.langdTelefonnummer(txtNyttTelefonnummer) && Validering.langdLosenord(txtLosenord)) {
            try {
                String agentNamn = txtAgentNamn.getText();
                String valtOmrade = cbOmrade.getSelectedItem().toString();
                String valdAdmin = cbAdmin.getSelectedItem().toString();
                String substrAdmin = valdAdmin.substring(0, 1); //Omvandlar den hårdkodade Ja/Nej från comboboxen så att den blir hanterbar och kompitabel med inmatning i tabell.
                String telefon = txtNyttTelefonnummer.getText();
                String losenordet = txtLosenord.getText();

                String fragaIdAgent = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + agentNamn + "'";
                String svarAgentId = idb.fetchSingle(fragaIdAgent);

                String fragaPlats = "SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = '" + valtOmrade + "'";
                String svarPlats = idb.fetchSingle(fragaPlats);

                String fragan = "UPDATE AGENT SET TELEFON = '" + telefon + "', ADMINISTRATOR = '" + substrAdmin + "', LOSENORD = '" + losenordet + "', OMRADE = " + svarPlats + " WHERE AGENT_ID = " + svarAgentId + ";";

                idb.update(fragan);

                lblAndringSparad.setText("Agent uppdaterad!");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Fel");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTillbakaEttSteg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg1ActionPerformed
        close(); //Anropar metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg1ActionPerformed

    private void fyllCbValjOmrade() {
        String fraga = "SELECT BENAMNING FROM OMRADE;";

        ArrayList<String> allaOmraden; 

        try {
            allaOmraden = idb.fetchColumn(fraga);
            for (String omrade : allaOmraden) {
                cbOmrade.addItem(omrade);
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JButton btnTillbakaEttSteg1;
    private javax.swing.JComboBox<String> cbAdmin;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdminstatus;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JPasswordField txtLosenord;
    private javax.swing.JTextField txtNyttTelefonnummer;
    // End of variables declaration//GEN-END:variables
}
