package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

    public class AndraInformationAlienEnkel extends javax.swing.JFrame {

    private final InfDB idb;
    DefaultListModel minLista = new DefaultListModel(); // Här instansierar vi min lista vid namn minLista av klassen DefaultListModel som vi sedan använder i min JList. 

    public AndraInformationAlienEnkel(InfDB idb) {
        initComponents();

        this.idb = idb;    
        fyllCbValjPlats();
        fyllNyRas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        txtSok = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        lblSok = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNamn = new javax.swing.JList<>();
        btnTom = new javax.swing.JButton();
        cbNyPlats = new javax.swing.JComboBox<>();
        btnAndra = new javax.swing.JButton();
        lblUppmaning = new javax.swing.JLabel();
        lblAlienId = new javax.swing.JLabel();
        lblnyPlats = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblNyttTelefonnummer = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JPasswordField();
        lblAndringSparad = new javax.swing.JLabel();
        lblNyRas = new javax.swing.JLabel();
        cbNyRas = new javax.swing.JComboBox<>();
        txtAttribut = new javax.swing.JTextField();
        lblFriText = new javax.swing.JLabel();
        btnTillbakaEttSteg7 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Ändra information Alien");

        txtSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSokActionPerformed(evt);
            }
        });

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        lblSok.setText("Namn:");

        jScrollPane1.setViewportView(listaNamn);

        btnTom.setText("Töm lista");
        btnTom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomActionPerformed(evt);
            }
        });

        cbNyPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNyPlatsActionPerformed(evt);
            }
        });

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        lblUppmaning.setText("Vänligen sök & välj ut den alien du vill ändra information om");

        lblAlienId.setText("Aliens Id:");

        lblnyPlats.setText("Välj ny Plats:");

        lblNyttTelefonnummer.setText("Nytt Telefonnummer:");

        lblLosenord.setText("Nytt lösenord:");

        lblNyRas.setText("Ny ras:");

        cbNyRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNyRasActionPerformed(evt);
            }
        });

        txtAttribut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttributActionPerformed(evt);
            }
        });

        lblFriText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSok, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlienId)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addComponent(lblNyttTelefonnummer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSok)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLosenord, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblnyPlats, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNyRas, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFriText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbNyRas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbNyPlats, javax.swing.GroupLayout.Alignment.LEADING, 0, 106, Short.MAX_VALUE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAttribut))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUppmaning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbakaEttSteg7)
                        .addGap(98, 98, 98))))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAndra)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUppmaning)
                    .addComponent(btnTillbakaEttSteg7))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok)
                    .addComponent(lblSok))
                .addGap(47, 47, 47)
                .addComponent(lblAlienId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTom)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNyttTelefonnummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLosenord)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNyRas)
                            .addComponent(cbNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFriText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnyPlats)
                    .addComponent(cbNyPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnAndra)
                .addGap(4, 4, 4)
                .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void fyllNyRas() {

        cbNyRas.addItem("Worm");
        cbNyRas.addItem("Bogdolite");
        cbNyRas.addItem("Squid");
//Hårdkodar raserna in i Comboboxen istället för att göra en SQL-fråga som ska behöva namn på tabellerna, på detta sätt blir det mindre kod.
    }

    private void fyllCbValjPlats() {
        //Denna metod fyller comboboxen med relevant information.

        String fraga = "SELECT BENAMNING FROM PLATS;";

        ArrayList<String> allaPlatser;

        try {
            allaPlatser = idb.fetchColumn(fraga);
            for (String plats : allaPlatser) {
                cbNyPlats.addItem(plats);
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Den Alien du söker fnns inte!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    
    
    private void txtSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSokActionPerformed

    }//GEN-LAST:event_txtSokActionPerformed

    private void btnTomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomActionPerformed
        minLista.clear();
        listaNamn.setModel(minLista); // Med denna metod tömmer man listan, annars fungerar den som så att den bara fylls på och "gamla" värden ligger kvar.
    }//GEN-LAST:event_btnTomActionPerformed

    private void cbNyPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNyPlatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNyPlatsActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        // Denna metod söker efter den Alien man vill få upp i listan. Där visas sedan ID, ett eller flera. Om det finns fler än en Alien med samma namn måste man särskilja dom på ID.
        if (Validering.textFaltHarVarde(txtSok)) {

            String soktNamn = txtSok.getText();

            String fraga = "SELECT ALIEN_ID FROM ALIEN WHERE NAMN = '" + soktNamn + "';";

            ArrayList<String> allaAliens;
            if (Validering.textFaltHarVarde(txtSok)) {
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
                    JOptionPane.showMessageDialog(null, "Vänligen sök efter en Alien");
                    System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnSokActionPerformed

    
    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        if (Validering.textFaltHarVarde(txtTelefon)
                && Validering.textFaltHarVarde(txtLosenord) && Validering.langdLosenord(txtLosenord) && Validering.langdTelefonnummer(txtTelefon)) {
            try {

                String valdPlats = cbNyPlats.getSelectedItem().toString();
                String telefon = txtTelefon.getText();
                String losenordet = txtLosenord.getText();
                String valtId = listaNamn.getSelectedValue().toString();
                String attribut = txtAttribut.getText();

                String fragaPlats = "SELECT PLATS_ID FROM PLATS WHERE BENAMNING = '" + valdPlats + "'";
                String svarPlats = idb.fetchSingle(fragaPlats);

                String fragan = "UPDATE ALIEN SET LOSENORD = '" + losenordet + "',"
                        + " TELEFON = '" + telefon + "', PLATS = " + svarPlats + " WHERE ALIEN_ID = " + valtId + ";";
                idb.update(fragan);

                String taBort = listaNamn.getSelectedValue().toString();
                
                String fragaTaBort2 = "DELETE FROM BOGLODITE WHERE ALIEN_ID = '" + taBort + "';";
                idb.delete(fragaTaBort2);

                String fragaTaBort3 = "DELETE FROM SQUID WHERE ALIEN_ID = '" + taBort + "';";
                idb.delete(fragaTaBort3);

                String fragaTaBort4 = "DELETE FROM WORM WHERE ALIEN_ID = '" + taBort + "';";
                idb.delete(fragaTaBort4);

                if (cbNyRas.getSelectedItem().toString().equals("Worm")) {
                    String fraganRas = "INSERT INTO WORM VALUES(" + valtId + ")";
                    idb.insert(fraganRas);
                } else if (cbNyRas.getSelectedItem().toString().equals("Squid")) {
                    String fraganRas = "INSERT INTO SQUID VALUES(" + valtId + ",'" + attribut + "')";
                    idb.insert(fraganRas);
                } else if (cbNyRas.getSelectedItem().toString().equals("Bogdolite")) {
                    String fraganRas = "INSERT INTO BOGLODITE VALUES(" + valtId + ",'" + attribut + "')";
                    idb.insert(fraganRas);
                }

                lblAndringSparad.setText("Alien ändrad!");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Fel");
            }
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    private void cbNyRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNyRasActionPerformed
        // Efter raserna har olika attribut så visas fler fält eller mindre beroende på vilken ras som är markerad i ComboBox. 
        if (cbNyRas.getSelectedItem().toString().equals("Squid")) {
            lblFriText.setVisible(true);
            txtAttribut.setVisible(true);
            lblFriText.setText("Antal armar:");
        }
        if (cbNyRas.getSelectedItem().toString().equals("Bogdolite")) {
            lblFriText.setVisible(true);
            txtAttribut.setVisible(true);
            lblFriText.setText("Antal Boogies:");
        }
        if (cbNyRas.getSelectedItem().toString().equals("Worm")) {
            lblFriText.setVisible(false);
            txtAttribut.setVisible(false);
        }
    }//GEN-LAST:event_cbNyRasActionPerformed

    private void txtAttributActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttributActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttributActionPerformed

    private void btnTillbakaEttSteg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg7ActionPerformed
    close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTillbakaEttSteg7;
    private javax.swing.JButton btnTom;
    private javax.swing.JComboBox<String> cbNyPlats;
    private javax.swing.JComboBox<String> cbNyRas;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlienId;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblFriText;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNyRas;
    private javax.swing.JLabel lblNyttTelefonnummer;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblSok;
    private javax.swing.JLabel lblUppmaning;
    private javax.swing.JLabel lblnyPlats;
    private javax.swing.JList<String> listaNamn;
    private javax.swing.JTextField txtAttribut;
    private javax.swing.JPasswordField txtLosenord;
    private javax.swing.JTextField txtSok;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
