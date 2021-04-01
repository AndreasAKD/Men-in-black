package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class ListaAliensPaPlats extends javax.swing.JFrame {
    
    private InfDB idb;

    public ListaAliensPaPlats(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjPlats();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikVisaAliensPaPlats = new javax.swing.JLabel();
        lblValjPlatsAttSoka = new javax.swing.JLabel();
        cbListaPlats = new javax.swing.JComboBox<>();
        Scrollpanen = new javax.swing.JScrollPane();
        txtAreaVisaAliensPaPlats = new javax.swing.JTextArea();
        btnTillbakaEttSteg5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrikVisaAliensPaPlats.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrikVisaAliensPaPlats.setText("Visa aliens på plats");

        lblValjPlatsAttSoka.setText("Välj plats:");

        cbListaPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaPlatsActionPerformed(evt);
            }
        });

        txtAreaVisaAliensPaPlats.setColumns(20);
        txtAreaVisaAliensPaPlats.setRows(5);
        Scrollpanen.setViewportView(txtAreaVisaAliensPaPlats);

        btnTillbakaEttSteg5.setText("Tillbaka till menyn");
        btnTillbakaEttSteg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttSteg5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblValjPlatsAttSoka, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbListaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 305, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Scrollpanen)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRubrikVisaAliensPaPlats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbakaEttSteg5)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikVisaAliensPaPlats)
                    .addComponent(btnTillbakaEttSteg5))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjPlatsAttSoka)
                    .addComponent(cbListaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Scrollpanen, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void fyllCbValjPlats() {
        String fraga = "SELECT BENAMNING FROM PLATS;";

        ArrayList<String> allaPlatser;

        try {
            allaPlatser = idb.fetchColumn(fraga);

            for (String plats : allaPlatser) {
                cbListaPlats.addItem(plats);
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }

    private void cbListaPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaPlatsActionPerformed

        txtAreaVisaAliensPaPlats.setText("");
        txtAreaVisaAliensPaPlats.append("ID:" + "\t");
        txtAreaVisaAliensPaPlats.append(" " + "Namn:" + "\t");
        txtAreaVisaAliensPaPlats.append(" " + "Reg. Datum:" + "\t");
        txtAreaVisaAliensPaPlats.append(" " + "Telefon:" + "\n");

        ArrayList<HashMap<String, String>> soktaAliens;

        try {
            String valdPlats = cbListaPlats.getSelectedItem().toString();

            String fraga = "SELECT ALIEN_ID, NAMN, REGISTRERINGSDATUM, TELEFON, ANSVARIG_AGENT FROM ALIEN WHERE ALIEN.PLATS IN (SELECT PLATS_ID FROM PLATS WHERE PLATS.BENAMNING = '" + valdPlats + "') ORDER BY ALIEN.NAMN;";
            soktaAliens = idb.fetchRows(fraga);

            for (HashMap<String, String> alien : soktaAliens) {
                txtAreaVisaAliensPaPlats.append(alien.get("ALIEN_ID") + "\t");
                txtAreaVisaAliensPaPlats.append(" " + alien.get("NAMN") + "\t");
                txtAreaVisaAliensPaPlats.append(" " + alien.get("REGISTRERINGSDATUM") + "\t");
                txtAreaVisaAliensPaPlats.append(" " + alien.get("TELEFON") + "\n");
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) { //Lägger även till NullPointerException
            JOptionPane.showMessageDialog(null, "Det finns för nuvarande ingen alien i detta område!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_cbListaPlatsActionPerformed

    private void btnTillbakaEttSteg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg5ActionPerformed
       close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollpanen;
    private javax.swing.JButton btnTillbakaEttSteg5;
    private javax.swing.JComboBox<String> cbListaPlats;
    private javax.swing.JLabel lblRubrikVisaAliensPaPlats;
    private javax.swing.JLabel lblValjPlatsAttSoka;
    private javax.swing.JTextArea txtAreaVisaAliensPaPlats;
    // End of variables declaration//GEN-END:variables
}
