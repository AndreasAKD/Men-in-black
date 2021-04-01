package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class TaBortAlien extends javax.swing.JFrame {

    private final InfDB idb;
    DefaultListModel minLista = new DefaultListModel(); // Initialiserar en ny lista som används i JList senare.

    public TaBortAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        btnTaBort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNamn = new javax.swing.JList<>();
        btnSok = new javax.swing.JButton();
        txtRubrik = new javax.swing.JLabel();
        btnTom = new javax.swing.JButton();
        txtUppmaning = new javax.swing.JLabel();
        lblAndringSparad = new javax.swing.JLabel();
        btnTillbakaEttSteg2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNamn.setText("Benämning:");

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort Alien");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        listaNamn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaNamnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaNamn);

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        txtRubrik.setText("Ta bort Alien");

        btnTom.setText("Töm lista");
        btnTom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomActionPerformed(evt);
            }
        });

        txtUppmaning.setText("Vänligen verifiera Aliens ID innan avregistrering");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTom, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txtRubrik)
                                .addGap(134, 134, 134)
                                .addComponent(btnTillbakaEttSteg2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSok))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUppmaning, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRubrik)
                    .addComponent(btnTillbakaEttSteg2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(txtUppmaning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTom)
                        .addGap(34, 34, 34)
                        .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnTaBort)
                .addGap(137, 137, 137))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    
    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed

        if (Validering.textFaltHarVarde(txtNamn)) {
            String taBort = listaNamn.getSelectedValue().toString();

            try {
                String fragaTaBort = "DELETE FROM ALIEN WHERE ALIEN_ID = '" + taBort + "';";
                idb.delete(fragaTaBort);

                String fragaTaBort2 = "DELETE FROM BOGLODITE WHERE ALIEN_ID = '" + taBort + "';";
                idb.delete(fragaTaBort2);

                String fragaTaBort3 = "DELETE FROM SQUID WHERE ALIEN_ID = '" + taBort + "';";
                idb.delete(fragaTaBort3);

                String fragaTaBort4 = "DELETE FROM WORM WHERE ALIEN_ID = '" + taBort + "';";
                idb.delete(fragaTaBort4);

                lblAndringSparad.setText("Alien borttagen!");

            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Fel");
            }

        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void btnTomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomActionPerformed
        minLista.clear();
        listaNamn.setModel(minLista);
    }//GEN-LAST:event_btnTomActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed

        String soktNamn = txtNamn.getText();

        String fraga = "SELECT ALIEN_ID FROM ALIEN WHERE NAMN = '" + soktNamn + "';";

        ArrayList<String> allaAliens;
        if (Validering.textFaltHarVarde(txtNamn)) {
            try {

                allaAliens = idb.fetchColumn(fraga);

                for (String alien : allaAliens) {

                    listaNamn.setModel(minLista);
                    minLista.addElement(alien);
                }

            } catch (InfException ettUndantag) {
                JOptionPane.showMessageDialog(null, "Databasfel!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            } catch (Exception ettUndantag) {
                JOptionPane.showMessageDialog(null, "Sökt Alien finns ej!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            }
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void listaNamnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaNamnMouseClicked

    }//GEN-LAST:event_listaNamnMouseClicked

    private void btnTillbakaEttSteg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg2ActionPerformed
    close();  
    }//GEN-LAST:event_btnTillbakaEttSteg2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbakaEttSteg2;
    private javax.swing.JButton btnTom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JList<String> listaNamn;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JLabel txtRubrik;
    private javax.swing.JLabel txtUppmaning;
    // End of variables declaration//GEN-END:variables
}
