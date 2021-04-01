package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class ListaAliensDatum extends javax.swing.JFrame {

    private InfDB idb;

    public ListaAliensDatum(InfDB idb) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultat = new javax.swing.JTextArea();
        lblRubrik = new javax.swing.JLabel();
        lblaldstaDatum = new javax.swing.JLabel();
        lblsenasteDatum = new javax.swing.JLabel();
        btnVisa = new javax.swing.JButton();
        dtmTill = new com.toedter.calendar.JDateChooser();
        dtmFran = new com.toedter.calendar.JDateChooser();
        btnTillbakaEttSteg7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtAreaResultat.setColumns(20);
        txtAreaResultat.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultat);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRubrik.setText("Lista Aliens melllan datum");

        lblaldstaDatum.setText("Välj äldsta datum:");

        lblsenasteDatum.setText("Välj senaste datum:");

        btnVisa.setText("Visa");
        btnVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaActionPerformed(evt);
            }
        });

        dtmTill.setDateFormatString("yyyy-MM-dd");

        dtmFran.setDateFormatString("yyyy-MM-dd");

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
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtmFran, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtmTill, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisa)
                    .addComponent(lblRubrik)
                    .addComponent(lblsenasteDatum)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblaldstaDatum)
                        .addGap(89, 89, 89)
                        .addComponent(btnTillbakaEttSteg7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaldstaDatum)
                    .addComponent(btnTillbakaEttSteg7))
                .addGap(18, 18, 18)
                .addComponent(dtmFran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsenasteDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dtmTill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaActionPerformed

        txtAreaResultat.setText(" ");
        txtAreaResultat.append("ID:" + "\t");
        txtAreaResultat.append(" " + "Namn:" + "\t");
        txtAreaResultat.append(" " + "Lösenord:" + "\t");
        txtAreaResultat.append(" " + "Reg. Datum:" + "\t");
        txtAreaResultat.append(" " + "Telefon:" + "\t");
        txtAreaResultat.append(" " + "Plats:" + "\t");
        txtAreaResultat.append(" " + "Ansv. Agent:" + "\n");

        ArrayList<HashMap<String, String>> soktaAliens;

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Metod för att formatera om datumet så att det fungerar i SQL-frågan.
            String sokDatum1 = sdf.format(dtmFran.getDate()); //Anropar metoden getDate(); på JDateChooser. 
            String sokDatum2 = sdf.format(dtmTill.getDate());

            String fraga1 = "SELECT * FROM ALIEN WHERE REGISTRERINGSDATUM BETWEEN '" + sokDatum1 + "' AND '" + sokDatum2 + "';";
            soktaAliens = idb.fetchRows(fraga1);

            for (HashMap<String, String> alien : soktaAliens) {
                txtAreaResultat.append(alien.get("ALIEN_ID") + "\t");
                txtAreaResultat.append(" " + alien.get("NAMN") + "\t");
                txtAreaResultat.append(" " + alien.get("LOSENORD") + "\t");
                txtAreaResultat.append(" " + alien.get("REGISTRERINGSDATUM") + "\t");
                txtAreaResultat.append(" " + alien.get("TELEFON") + "\t");

                String fragaPlats = "SELECT BENAMNING FROM PLATS WHERE PLATS_ID = '" + alien.get("PLATS") + "';";
                String svarPlats = idb.fetchSingle(fragaPlats);
                txtAreaResultat.append(" " + svarPlats + "\t");

                String fragaAnsvAgent = " SELECT NAMN FROM AGENT WHERE AGENT_ID = '" + alien.get("ANSVARIG_AGENT") + "';";
                String svarAnsvAgent = idb.fetchSingle(fragaAnsvAgent);
                txtAreaResultat.append(" " + svarAnsvAgent + "\n");
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) { //lï¿½gger ï¿½ven till nullpointer exception
            JOptionPane.showMessageDialog(null, "Det finns ingen alien registrerad mellan valda datum!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_btnVisaActionPerformed

    private void btnTillbakaEttSteg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg7ActionPerformed
       close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaEttSteg7;
    private javax.swing.JButton btnVisa;
    private com.toedter.calendar.JDateChooser dtmFran;
    private com.toedter.calendar.JDateChooser dtmTill;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblaldstaDatum;
    private javax.swing.JLabel lblsenasteDatum;
    private javax.swing.JTextArea txtAreaResultat;
    // End of variables declaration//GEN-END:variables
}
