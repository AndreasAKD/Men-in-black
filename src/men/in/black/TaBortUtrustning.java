package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class TaBortUtrustning extends javax.swing.JFrame {

    private final InfDB idb;
    DefaultListModel minLista = new DefaultListModel();

    public TaBortUtrustning(InfDB idb) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listaNamn = new javax.swing.JList<>();
        txtUppmaning = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        btnTom = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        lblAndringSparad = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        btnTillbakaEttSteg4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaNamn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaNamnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaNamn);

        txtUppmaning.setText("Vänligen verifiera utrustningens ID innan avregistrering");

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        lblNamn.setText("Benämning:");

        btnTom.setText("Töm lista");
        btnTom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort Utrustning");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Ta bort utrustning");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        btnTillbakaEttSteg4.setText("Tillbaka till menyn");
        btnTillbakaEttSteg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttSteg4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUppmaning, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTom, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 186, Short.MAX_VALUE)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbakaEttSteg4)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok)
                    .addComponent(btnTillbakaEttSteg4))
                .addGap(26, 26, 26)
                .addComponent(txtUppmaning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTom)
                        .addGap(67, 67, 67)
                        .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnTaBort)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaNamnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaNamnMouseClicked

    }//GEN-LAST:event_listaNamnMouseClicked

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void btnTomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomActionPerformed
        minLista.clear();
        listaNamn.setModel(minLista); // Tömmer lista
    }//GEN-LAST:event_btnTomActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed

        if (Validering.textFaltHarVarde(txtNamn)) {
            String taBort = listaNamn.getSelectedValue().toString();
            try {
                String fragaTaBort = "DELETE FROM UTRUSTNING WHERE UTRUSTNINGS_ID = '" + taBort + "';";
                idb.delete(fragaTaBort);
                String fragaTabort2 = "DELETE FROM VAPEN WHERE UTRUSTNINGS_ID = '" + taBort + "';";
                idb.delete(fragaTabort2);
                String fragaTabort3 = "DELETE FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = '" + taBort + "';";
                idb.delete(fragaTabort3);
                String fragaTabort4 = "DELETE FROM TEKNIK WHERE UTRUSTNINGS_ID = '" + taBort + "';";
                idb.delete(fragaTabort4);

                lblAndringSparad.setText("Utrustning borttagen!");
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Fel");
            }
        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed

        ArrayList<String> allUtrustning;
        if (Validering.textFaltHarVarde(txtNamn)) {
            try {
                String soktBenamning = txtNamn.getText();
                String fraga = "SELECT UTRUSTNINGS_ID FROM UTRUSTNING WHERE BENAMNING = '" + soktBenamning + "';";
                allUtrustning = idb.fetchColumn(fraga);

                for (String Utrustning : allUtrustning) {
                    listaNamn.setModel(minLista);
                    minLista.addElement(Utrustning); // Itererar igenom Arraylisten och fyller sedan JList.
                }

            } catch (InfException ettUndantag) {
                JOptionPane.showMessageDialog(null, "Databasfel!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            } catch (Exception ettUndantag) {
                JOptionPane.showMessageDialog(null, "Den angivna utrustningen existerar inte!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            }
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnTillbakaEttSteg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg4ActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaEttSteg4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbakaEttSteg4;
    private javax.swing.JButton btnTom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JList<String> listaNamn;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JLabel txtUppmaning;
    // End of variables declaration//GEN-END:variables
}
