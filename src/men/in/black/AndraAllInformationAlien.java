package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AndraAllInformationAlien extends javax.swing.JFrame {

    private final InfDB idb;
    DefaultListModel minLista = new DefaultListModel();

    public AndraAllInformationAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbListaAgent();
        fyllCbValjPlats();
        fyllNyRas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        txtSok = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        txtNyttNamn = new javax.swing.JTextField();
        lblNyttNamn = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblNyttTelefonnummer = new javax.swing.JLabel();
        datumValjare = new com.toedter.calendar.JDateChooser();
        lblNyttRegDatum = new javax.swing.JLabel();
        cbAnsvarigAgent = new javax.swing.JComboBox<>();
        lblNyAnsvarigAgent = new javax.swing.JLabel();
        cbNyPlats = new javax.swing.JComboBox<>();
        lblNyPlats = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JPasswordField();
        lblAndringSparad = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaNamn = new javax.swing.JList<>();
        btnTom = new javax.swing.JButton();
        lblNamnSok = new javax.swing.JLabel();
        lblAlienId = new javax.swing.JLabel();
        lblNyRas = new javax.swing.JLabel();
        cbNyRas = new javax.swing.JComboBox<>();
        txtAttribut = new javax.swing.JTextField();
        lblFriText = new javax.swing.JLabel();
        btnTillbakaEttSteg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Ändra all information Alien");

        lblText1.setText("Vänligen sök & välj ut den alien du vill ändra information om");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        txtNyttNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNyttNamnActionPerformed(evt);
            }
        });

        lblNyttNamn.setText("Nytt Namn:");

        lblNyttTelefonnummer.setText("Nytt Telefonnummer:");

        datumValjare.setDateFormatString("yyyy-MM-dd");

        lblNyttRegDatum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNyttRegDatum.setText("Nytt registreringsdatum:");

        lblNyAnsvarigAgent.setText("Ny Ansvarig Agent:");

        lblNyPlats.setText("Ny plats:");

        lblLosenord.setText("Nytt lösenord:");

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaNamn);

        btnTom.setText("Töm lista");
        btnTom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomActionPerformed(evt);
            }
        });

        lblNamnSok.setText("Namn:");

        lblAlienId.setText("Aliens Id:");

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

        btnTillbakaEttSteg.setText("Tillbaka till menyn");
        btnTillbakaEttSteg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttStegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbakaEttSteg, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addGap(308, 308, 308)
                        .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlienId)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblText1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblNamnSok)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSok, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSok)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 354, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblNyttRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(datumValjare, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(txtTelefon)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblLosenord)
                                                    .addComponent(lblNyPlats)
                                                    .addComponent(lblNyAnsvarigAgent))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(203, 203, 203)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblFriText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblNyRas))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbNyPlats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbAnsvarigAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAndra, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(cbNyRas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAttribut)
                                            .addComponent(txtLosenord, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNyttNamn)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnTom, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblNyttTelefonnummer)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblText1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok)
                    .addComponent(lblNamnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNyttNamn)
                            .addComponent(txtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNyttTelefonnummer)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTom))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datumValjare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNyttRegDatum))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNyAnsvarigAgent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbNyPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNyPlats)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlienId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLosenord)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNyRas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFriText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAndra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbakaEttSteg))
                .addGap(71, 71, 71))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void fyllNyRas() {
        //Hårdkodar namn i Comboboxen, mindre kod än om man skulle hämta informationen från tabellerna.
        cbNyRas.addItem("Worm");
        cbNyRas.addItem("Bogdolite");
        cbNyRas.addItem("Squid");
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    
    private void fyllCbListaAgent() {
        String fraga = "SELECT NAMN FROM AGENT;";

        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(fraga);
            for (String agent : allaAgenter) {
                cbAnsvarigAgent.addItem(agent);  // itererar genom arraylist med agenter och lägger till dessa i combobox
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
                cbNyPlats.addItem(plats); // itererar genom arraylist med platser och lägger till dessa i combobox
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }


    private void txtNyttNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNyttNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNyttNamnActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        if (Validering.textFaltHarVarde(txtSok)) {

            String soktNamn = txtSok.getText(); //hämtar det sökta namnet

            String fraga = "SELECT ALIEN_ID FROM ALIEN WHERE NAMN = '" + soktNamn + "';";

            ArrayList<String> allaAliens;
            if (Validering.textFaltHarVarde(txtSok)) {
                try {

                    allaAliens = idb.fetchColumn(fraga); //hämtar ut matchande namn från databasen

                    for (String alien : allaAliens) {

                        listaNamn.setModel(minLista);
                        minLista.addElement(alien); //lägger till sökresultatet i listan
                    }

                } catch (InfException ettUndantag) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
                } catch (Exception ettUndantag) {
                    JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
                    System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnTomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomActionPerformed
        minLista.clear();
        listaNamn.setModel(minLista);
        //tömmer listan med hämtade namn
    }//GEN-LAST:event_btnTomActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        if (Validering.textFaltHarVarde(txtNyttNamn) && Validering.textFaltHarVarde(txtTelefon)
                && Validering.textFaltHarVarde(txtLosenord) && Validering.langdNamn(txtNyttNamn) && Validering.langdTelefonnummer(txtTelefon) && Validering.langdLosenord(txtLosenord)) {
            try {
                String valdPlats = cbNyPlats.getSelectedItem().toString();
                String valdAgent = cbAnsvarigAgent.getSelectedItem().toString();
                String namnet = txtNyttNamn.getText();
                String telefon = txtTelefon.getText();
                String losenordet = txtLosenord.getText();
                String valtId = listaNamn.getSelectedValue().toString();
                String attribut = txtAttribut.getText();
                //hämtar ut all input från textfälten

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String valtDatum = sdf.format(datumValjare.getDate());

                String fragaPlats = "SELECT PLATS_ID FROM PLATS WHERE BENAMNING = '" + valdPlats + "'";
                String svarPlats = idb.fetchSingle(fragaPlats);

                String fragaIdAgent = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + valdAgent + "'";
                String svarAgentId = idb.fetchSingle(fragaIdAgent);

                String fragan = "UPDATE ALIEN\n"
                        + "SET\n"
                        + "REGISTRERINGSDATUM = '" + valtDatum + "',\n"
                        + "LOSENORD = '" + losenordet + "',\n"
                        + "NAMN = '" + namnet + "',\n"
                        + "TELEFON = '" + telefon + "',\n"
                        + "PLATS =" + svarPlats + ",\n"
                        + "ANSVARIG_AGENT = " + svarAgentId + "\n"
                        + "WHERE ALIEN_ID = " + valtId + ";";

                String svar = idb.fetchSingle(fragan);//uppdaterar informationen för vald alien i databasen

                
                String taBort = listaNamn.getSelectedValue().toString(); //Hämtar ID på den alien som ska tas bort från tabellerna i listan
                //Nedan - tar bort vald alien från den nuvarande ras-tabellen och lägger till denne i den valda rasens tabell
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

    private void txtAttributActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttributActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttributActionPerformed

    private void cbNyRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNyRasActionPerformed
        // Olika raser har olika attribut, denna metod ändrar textfält och labels till synliga eller dolda beroende på om de behövs eller ej.
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

    private void btnTillbakaEttStegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttStegActionPerformed
        close();
    }//GEN-LAST:event_btnTillbakaEttStegActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JButton btnTom;
    private javax.swing.JComboBox<String> cbAnsvarigAgent;
    private javax.swing.JComboBox<String> cbNyPlats;
    private javax.swing.JComboBox<String> cbNyRas;
    private com.toedter.calendar.JDateChooser datumValjare;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlienId;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblFriText;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamnSok;
    private javax.swing.JLabel lblNyAnsvarigAgent;
    private javax.swing.JLabel lblNyPlats;
    private javax.swing.JLabel lblNyRas;
    private javax.swing.JLabel lblNyttNamn;
    private javax.swing.JLabel lblNyttRegDatum;
    private javax.swing.JLabel lblNyttTelefonnummer;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblText1;
    private javax.swing.JList<String> listaNamn;
    private javax.swing.JTextField txtAttribut;
    private javax.swing.JPasswordField txtLosenord;
    private javax.swing.JTextField txtNyttNamn;
    private javax.swing.JTextField txtSok;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
