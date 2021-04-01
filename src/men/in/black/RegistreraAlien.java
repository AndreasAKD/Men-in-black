package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraAlien extends javax.swing.JFrame {

    private final InfDB idb;

    public RegistreraAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjPlats();
        fyllCbListaAgent();
        fyllNyRas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Namn = new javax.swing.JLabel();
        Telefon = new javax.swing.JLabel();
        Registeringsdatum = new javax.swing.JLabel();
        AnsvarigAgent = new javax.swing.JLabel();
        Plats = new javax.swing.JLabel();
        Losenord = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        Rubrik = new javax.swing.JLabel();
        btnRegistreraAlien = new javax.swing.JButton();
        lblAndringSparad = new javax.swing.JLabel();
        cbListaPlats = new javax.swing.JComboBox<>();
        cbListaAgent = new javax.swing.JComboBox<>();
        datumValjare = new com.toedter.calendar.JDateChooser();
        txtLosenord = new javax.swing.JPasswordField();
        cbRas = new javax.swing.JComboBox<>();
        lblRas = new javax.swing.JLabel();
        lblFriText = new javax.swing.JLabel();
        txtAttribut = new javax.swing.JTextField();
        btnTillbakaEttSteg5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Namn.setText("Namn:");

        Telefon.setText("Telefon");

        Registeringsdatum.setText("Registreringsdatum:");

        AnsvarigAgent.setText("Ansvarig Agent:");

        Plats.setText("Plats:");

        Losenord.setText("Lösenord:");

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        Rubrik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Rubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rubrik.setText("Registrera ny Alien");

        btnRegistreraAlien.setText("Registera");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        cbListaPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaPlatsActionPerformed(evt);
            }
        });

        cbListaAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaAgentActionPerformed(evt);
            }
        });

        datumValjare.setDateFormatString("yyyy-MM-dd");

        txtLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLosenordActionPerformed(evt);
            }
        });

        cbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRasActionPerformed(evt);
            }
        });

        lblRas.setText("Ras:");

        txtAttribut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttributActionPerformed(evt);
            }
        });

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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(Rubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Plats)
                            .addComponent(AnsvarigAgent)
                            .addComponent(Registeringsdatum)
                            .addComponent(Telefon)
                            .addComponent(Namn)
                            .addComponent(lblRas)
                            .addComponent(Losenord))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistreraAlien)
                                .addGap(18, 18, 18)
                                .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datumValjare, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbListaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbListaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblFriText, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTillbakaEttSteg5)
                            .addComponent(txtAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Namn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Telefon)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registeringsdatum)
                    .addComponent(datumValjare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnsvarigAgent)
                    .addComponent(cbListaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Plats)
                    .addComponent(cbListaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Losenord)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRas)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFriText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistreraAlien)
                    .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaEttSteg5)
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(550, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void fyllNyRas() {

        cbRas.addItem("Worm");
        cbRas.addItem("Bogdolite");
        cbRas.addItem("Squid");
    }

    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
          
    }//GEN-LAST:event_txtNamnActionPerformed

    private void fyllCbListaAgent() {
        String fraga = "SELECT NAMN FROM AGENT;";

        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(fraga);
            for (String agent : allaAgenter) {
                cbListaAgent.addItem(agent);
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
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
    
    
    
    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed

        if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtTelefon)
                && Validering.textFaltHarVarde(txtLosenord) && Validering.langdNamn(txtNamn) && Validering.langdTelefonnummer(txtTelefon)
        && Validering.langdLosenord(txtLosenord)){
            try {
                String valdPlats = cbListaPlats.getSelectedItem().toString();
                String valdAgent = cbListaAgent.getSelectedItem().toString();
                String valdRas = cbRas.getSelectedItem().toString();
                String namnet = txtNamn.getText();
                String telefon = txtTelefon.getText();
                String losenordet = txtLosenord.getText();
                String attribut = txtAttribut.getText();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String valtDatum = sdf.format(datumValjare.getDate());

               String nyttId = idb.getAutoIncrement("ALIEN", "ALIEN_ID"); 
                //Autogenerering av nytt unikt ID, blir alltid det maximala ID som existerar +1.

                String fragaOmrade = "SELECT PLATS_ID FROM PLATS WHERE BENAMNING = '" + valdPlats + "'";
                String svarOmrade = idb.fetchSingle(fragaOmrade);

                String fragaIdAgent = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + valdAgent + "'";
                String svarAgentId = idb.fetchSingle(fragaIdAgent);

                String fragan = "INSERT INTO ALIEN VALUES (" + nyttId + ",'" + valtDatum + "','" + losenordet + "',"
                        + "'" + namnet + "','" + telefon + "'," + svarOmrade + ", " + svarAgentId + ")";
                idb.insert(fragan);

                if (cbRas.getSelectedItem().toString().equals("Worm")) {
                    String fraganRas = "INSERT INTO WORM VALUES(" + nyttId + ")";
                    idb.insert(fraganRas);
                } else if (cbRas.getSelectedItem().toString().equals("Squid")) {
                    String fraganRas = "INSERT INTO SQUID VALUES(" + nyttId + ",'" + attribut + "')";
                    idb.insert(fraganRas);
                } else if (cbRas.getSelectedItem().toString().equals("Bogdolite")) {
                    String fraganRas = "INSERT INTO BOGLODITE VALUES(" + nyttId + ",'" + attribut + "')";
                    idb.insert(fraganRas);
                }

                lblAndringSparad.setText("Alien registrerad!");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Fel");
            } catch (Exception ettUndantag) { //lï¿½gger ï¿½ven till nullpointer exception
                JOptionPane.showMessageDialog(null, "Vänligen välj ett datum");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void cbListaPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaPlatsActionPerformed

    }//GEN-LAST:event_cbListaPlatsActionPerformed

    private void cbListaAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListaAgentActionPerformed

    private void txtLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLosenordActionPerformed

    private void cbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRasActionPerformed
        // Olika raser har olika attribut, denna metod ändrar textfält och labels till synliga eller dolda beroende på om de behövs eller ej.
        if (cbRas.getSelectedItem().toString().equals("Squid")) {
            lblFriText.setVisible(true);
            txtAttribut.setVisible(true);
            lblFriText.setText("Antal armar:");
        }
        if (cbRas.getSelectedItem().toString().equals("Bogdolite")) {
            lblFriText.setVisible(true);
            txtAttribut.setVisible(true);
            lblFriText.setText("Antal Boogies:");
        }
        if (cbRas.getSelectedItem().toString().equals("Worm")) {
            lblFriText.setVisible(false);
            txtAttribut.setVisible(false);
        }

    }//GEN-LAST:event_cbRasActionPerformed

    private void txtAttributActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttributActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttributActionPerformed

    private void btnTillbakaEttSteg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg5ActionPerformed
       close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnsvarigAgent;
    private javax.swing.JLabel Losenord;
    private javax.swing.JLabel Namn;
    private javax.swing.JLabel Plats;
    private javax.swing.JLabel Registeringsdatum;
    private javax.swing.JLabel Rubrik;
    private javax.swing.JLabel Telefon;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnTillbakaEttSteg5;
    private javax.swing.JComboBox<String> cbListaAgent;
    private javax.swing.JComboBox<String> cbListaPlats;
    private javax.swing.JComboBox<String> cbRas;
    private com.toedter.calendar.JDateChooser datumValjare;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblFriText;
    private javax.swing.JLabel lblRas;
    private javax.swing.JTextField txtAttribut;
    private javax.swing.JPasswordField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
