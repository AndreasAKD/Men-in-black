package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AlienMeny extends javax.swing.JFrame {
 private InfDB idb;
    
 public AlienMeny(InfDB idb) {
         initComponents();     
         this.idb = idb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLabel1 = new javax.swing.JLabel();
        andraLosen = new javax.swing.JButton();
        OmradesChef = new javax.swing.JButton();
        Scrollpane1 = new javax.swing.JScrollPane();
        textFalt = new javax.swing.JTextArea();
        btnTillbakaEttSteg = new javax.swing.JButton();
        btnAliensOmrade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLabel1.setText("Meny Alien");

        andraLosen.setText("Ändra lösenord");
        andraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenActionPerformed(evt);
            }
        });

        OmradesChef.setText("Visa information om områdeschef");
        OmradesChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmradesChefActionPerformed(evt);
            }
        });

        textFalt.setColumns(20);
        textFalt.setRows(5);
        Scrollpane1.setViewportView(textFalt);

        btnTillbakaEttSteg.setText("Tillbaka till inloggning");
        btnTillbakaEttSteg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttStegActionPerformed(evt);
            }
        });

        btnAliensOmrade.setText("Visa information om Aliens i mitt område");
        btnAliensOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliensOmradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnTillbakaEttSteg, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(590, 590, 590))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(andraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OmradesChef, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAliensOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(txtLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(andraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(OmradesChef, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAliensOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnTillbakaEttSteg)))
                .addGap(18, 18, 18)
                .addComponent(Scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void andraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenActionPerformed
        AndraLosenordAlien andraLosenFonster = new AndraLosenordAlien(idb);
        andraLosenFonster.setVisible(true);
    }//GEN-LAST:event_andraLosenActionPerformed
    
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void OmradesChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmradesChefActionPerformed
        textFalt.selectAll();
        textFalt.replaceSelection("");  // Tömmer listan mellan funktionerna, gör så att dubletter inte skapas.
        textFalt.append("Namn:" + "\t");
        textFalt.append("Telefon:" + "\n");

        ArrayList<HashMap<String, String>> svar;
        try {
            String alienId = LoginMenyAlien.getSparatId();

            String fraga = "SELECT NAMN, TELEFON FROM AGENT WHERE AGENT_ID IN (SELECT OMRADE FROM OMRADESCHEF WHERE OMRADE IN \n"
                    + "    (SELECT OMRADES_ID FROM OMRADE WHERE OMRADES_ID IN \n"
                    + "    (SELECT PLATS_ID FROM PLATS WHERE PLATS_ID IN (SELECT PLATS FROM ALIEN WHERE ALIEN_ID =" + alienId + "))))";

            svar = idb.fetchRows(fraga);

            for (HashMap<String, String> ettSvar : svar) {
                textFalt.append(ettSvar.get("NAMN") + "\t");
                textFalt.append(ettSvar.get("TELEFON") + "\n");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Fel");
        }
    }//GEN-LAST:event_OmradesChefActionPerformed

    private void btnTillbakaEttStegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttStegActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaEttStegActionPerformed

    private void btnAliensOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliensOmradeActionPerformed
        textFalt.selectAll();
        textFalt.replaceSelection(""); // Tömmer listan mellan funktionerna, gör så att dubletter inte skapas.
        
        String anvId = LoginMenyAlien.getSparatId();
        ArrayList<HashMap<String, String>> soktaAliens;
        
        textFalt.append("Namn:" + "\t");
        textFalt.append(" " + "Telefon:" + "\n");
            try {
                String fragaOmrade = "SELECT BENAMNING FROM OMRADE WHERE OMRADE.OMRADES_ID IN (SELECT PLATS_ID FROM PLATS WHERE PLATS_ID IN (SELECT PLATS FROM ALIEN WHERE ALIEN_ID = '" + anvId + "' ));";
                String svarOmrade = idb.fetchSingle(fragaOmrade);

                String fragaAliens = "SELECT NAMN, TELEFON FROM ALIEN WHERE ALIEN.PLATS IN(SELECT PLATS_ID FROM PLATS WHERE FINNS_I IN(SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = '" + svarOmrade + "' ));";
                soktaAliens = idb.fetchRows(fragaAliens);

                for (HashMap<String, String> alien : soktaAliens) {
                    textFalt.append(alien.get("NAMN") + "\t");
                    textFalt.append(" " + alien.get("TELEFON") + "\n");
                }

            } catch (InfException ettUndantag) {
                JOptionPane.showMessageDialog(null, "Databasfel!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            }
    }//GEN-LAST:event_btnAliensOmradeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OmradesChef;
    private javax.swing.JScrollPane Scrollpane1;
    private javax.swing.JButton andraLosen;
    private javax.swing.JButton btnAliensOmrade;
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JTextArea textFalt;
    private javax.swing.JLabel txtLabel1;
    // End of variables declaration//GEN-END:variables

}
