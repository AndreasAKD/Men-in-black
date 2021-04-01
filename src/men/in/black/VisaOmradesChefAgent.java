package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class VisaOmradesChefAgent extends javax.swing.JFrame {

    private InfDB idb;

    public VisaOmradesChefAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjPlats();
    }

    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikVisaAliensPaPlats = new javax.swing.JLabel();
        lblValjPlatsAttSoka = new javax.swing.JLabel();
        cbListaOmradeskontor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaOmradesChef = new javax.swing.JTextArea();
        btnTillbakaEttSteg2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrikVisaAliensPaPlats.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrikVisaAliensPaPlats.setText("Lista Områdeschef");

        lblValjPlatsAttSoka.setText("Välj plats:");

        cbListaOmradeskontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaOmradeskontorActionPerformed(evt);
            }
        });

        txtAreaVisaOmradesChef.setColumns(20);
        txtAreaVisaOmradesChef.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaOmradesChef);

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
                .addGap(41, 41, 41)
                .addComponent(lblValjPlatsAttSoka, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbListaOmradeskontor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrikVisaAliensPaPlats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbakaEttSteg2)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikVisaAliensPaPlats)
                    .addComponent(btnTillbakaEttSteg2))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjPlatsAttSoka)
                    .addComponent(cbListaOmradeskontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fyllCbValjPlats() {
        String fraga = "SELECT BENAMNING FROM OMRADE ORDER BY BENAMNING;";

        ArrayList<String> allaOmraden;

        try {

            allaOmraden = idb.fetchColumn(fraga);

            for (String omrade : allaOmraden) {
                cbListaOmradeskontor.addItem(omrade);

            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }

    private void cbListaOmradeskontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaOmradeskontorActionPerformed

        txtAreaVisaOmradesChef.setText("");
        ArrayList<HashMap<String, String>> soktaChefer;

        try {
            String valtOmrade = cbListaOmradeskontor.getSelectedItem().toString();
            String fraga = "SELECT NAMN FROM AGENT\n"
                    + "JOIN OMRADESCHEF ON OMRADESCHEF.AGENT_ID = AGENT.AGENT_ID\n"
                    + "JOIN OMRADE ON OMRADES_ID = OMRADESCHEF.OMRADE WHERE OMRADE.BENAMNING = '" + valtOmrade + "';";
            soktaChefer = idb.fetchRows(fraga);

            for (HashMap<String, String> chef : soktaChefer) {
                txtAreaVisaOmradesChef.append(chef.get("NAMN"));
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) { //lï¿½gger ï¿½ven till nullpointer exception
            JOptionPane.showMessageDialog(null, "Det finns för närvarande ingen områdeschef för detta område!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_cbListaOmradeskontorActionPerformed

    private void btnTillbakaEttSteg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg2ActionPerformed
       close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaEttSteg2;
    private javax.swing.JComboBox<String> cbListaOmradeskontor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrikVisaAliensPaPlats;
    private javax.swing.JLabel lblValjPlatsAttSoka;
    private javax.swing.JTextArea txtAreaVisaOmradesChef;
    // End of variables declaration//GEN-END:variables
}
