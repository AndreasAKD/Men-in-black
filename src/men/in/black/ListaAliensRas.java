package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;

public class ListaAliensRas extends javax.swing.JFrame {

    private InfDB idb;

    public ListaAliensRas(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllcbRas();
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValjRas = new javax.swing.JLabel();
        cbRas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInfo = new javax.swing.JTextArea();
        lblRubrik = new javax.swing.JLabel();
        btnTillbakaEttSteg7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblValjRas.setText("Välj Ras:");

        cbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRasActionPerformed(evt);
            }
        });

        txtAreaInfo.setColumns(20);
        txtAreaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaInfo);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRubrik.setText("Lista Aliens per ras");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblValjRas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbakaEttSteg7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrik)
                    .addComponent(btnTillbakaEttSteg7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjRas)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRasActionPerformed
        txtAreaInfo.setText("");
        txtAreaInfo.append(" " + "ID:" + "\t");
        txtAreaInfo.append(" " + "Namn:" + "\t");
        txtAreaInfo.append(" " + "Telefon:" + "\t");
        txtAreaInfo.append(" " + "Plats:" + "\t");
        txtAreaInfo.append(" " + "Ansv. Agent:" + "\n");

        ArrayList<HashMap<String, String>> soktaAliens;

        try {
            String valdRas = cbRas.getSelectedItem().toString();
            String fraga = "SELECT * FROM ALIEN WHERE ALIEN_ID IN (SELECT ALIEN_ID FROM " + valdRas + ");";
            soktaAliens = idb.fetchRows(fraga);

            for (HashMap<String, String> alien : soktaAliens) {
                txtAreaInfo.append(alien.get("ALIEN_ID") + "\t");
                txtAreaInfo.append(" " + alien.get("NAMN") + "\t");
                txtAreaInfo.append(" " + alien.get("TELEFON") + "\t");

                String fragaPlats = "SELECT BENAMNING FROM PLATS WHERE PLATS_ID = '" + alien.get("PLATS") + "';";
                String svarPlats = idb.fetchSingle(fragaPlats);
                txtAreaInfo.append(" " + svarPlats + "\t");

                String fragaAnsvAgent = " SELECT NAMN FROM AGENT WHERE AGENT_ID = '" + alien.get("ANSVARIG_AGENT") + "';";
                String svarAnsvAgent = idb.fetchSingle(fragaAnsvAgent);
                txtAreaInfo.append(" " + svarAnsvAgent + "\n");
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) { //Nullpointer
            JOptionPane.showMessageDialog(null, "Det finns för nuvarande ingen alien registrerad för denna ras!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_cbRasActionPerformed

    private void btnTillbakaEttSteg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg7ActionPerformed
      close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg7ActionPerformed

    private void fyllcbRas() {
        cbRas.addItem("Worm");
        cbRas.addItem("Squid");
        cbRas.addItem("Boglodite");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaEttSteg7;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblValjRas;
    private javax.swing.JTextArea txtAreaInfo;
    // End of variables declaration//GEN-END:variables
}
