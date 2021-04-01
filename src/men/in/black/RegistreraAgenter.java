package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraAgenter extends javax.swing.JFrame {

    private final InfDB idb;

    public RegistreraAgenter(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjOmrade();
        fyllCbAdmin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelefon = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblNamn1 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        datumValjare = new com.toedter.calendar.JDateChooser();
        lblAnstallningsDatum = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        cbAdmin = new javax.swing.JComboBox<>();
        lblLosenord = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JPasswordField();
        cbOmrade = new javax.swing.JComboBox<>();
        lblOmrade = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        lblAndringSparad = new javax.swing.JLabel();
        btnTillbakaEttSteg7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTelefon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTelefon.setText("Telefon:");

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        lblNamn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNamn1.setText("Namn:");

        datumValjare.setDateFormatString("yyyy-MM-dd");

        lblAnstallningsDatum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAnstallningsDatum.setText("Anställningdatum:");

        lblAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAdmin.setText("Administratör");

        cbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdminActionPerformed(evt);
            }
        });

        lblLosenord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLosenord.setText("Lösenord:");

        lblOmrade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblOmrade.setText("Område:");

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRubrik.setText("Registrera ny Agent");

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

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
                        .addGap(119, 119, 119)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNamn1)
                            .addComponent(lblTelefon)
                            .addComponent(lblAnstallningsDatum)
                            .addComponent(lblAdmin)
                            .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOmrade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTillbakaEttSteg7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNamn)
                                    .addComponent(cbOmrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datumValjare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLosenord)
                                    .addComponent(cbAdmin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefon))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrera)
                                    .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datumValjare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnstallningsDatum))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAndringSparad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdmin)
                    .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrera))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmrade))
                .addGap(27, 27, 27)
                .addComponent(btnTillbakaEttSteg7)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed

        if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtTelefon)
                && Validering.textFaltHarVarde(txtLosenord) && Validering.langdNamn(txtNamn) && Validering.langdTelefonnummer(txtTelefon) && Validering.langdLosenord(txtLosenord)) {
            try {

                String valtOmrade = cbOmrade.getSelectedItem().toString();
                String valdAdmin = cbAdmin.getSelectedItem().toString();
                String substrAdmin = valdAdmin.substring(0, 1); // Substring för att kunna skicka in ett J eller N in i tabellerna istället för Ja och Nej som är hårdkodat i comboboxen.
                String namnet = txtNamn.getText();
                String telefon = txtTelefon.getText();
                String losenordet = txtLosenord.getText();
                // hämtar all input från textfält
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String valtDatum = sdf.format(datumValjare.getDate());

                String nyttId = idb.getAutoIncrement("AGENT", "AGENT_ID"); 
                //Autogenerering av nytt unikt ID, blir alltid det maximala ID som existerar +1.

                String fragaOmrade = "SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = '" + valtOmrade + "'";
                String svarOmrade = idb.fetchSingle(fragaOmrade);

                String fragaNamn = "SELECT count(*) FROM AGENT WHERE NAMN = '" + namnet + "'";
                String svarNamn = idb.fetchSingle(fragaNamn);
                int talSvarNamn = Integer.parseInt(svarNamn);
                // Ovan säkerställer att man inte kan registrera fler än en Agent med samma namn, ligger i denna klass just för att den här "valideringen"
                // inte kommer användas i någon annan klass överhuvudtaget och endast är relevant för denna klass. Om det finns färre än 1 med det namnet så körs Insert
                // , annars om det finns en eller flera Agenter med det namnet så får användaren ut en varning. 
                if (talSvarNamn < 1) {
                    String fragan = "INSERT INTO AGENT VALUES (" + nyttId + ",'" + namnet + "','" + telefon + "',"
                            + "'" + valtDatum + "','" + substrAdmin + "','" + losenordet + "'," + svarOmrade + ")";
                    idb.insert(fragan);

                    lblAndringSparad.setText("Registrering av ny Agent genomförd");
                } else if (talSvarNamn >= 1) {
                    JOptionPane.showMessageDialog(null, "Agenten med det namnet finns redan!");
                }

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Fel");
            } catch (Exception ettUndantag) { //lï¿½gger ï¿½ven till nullpointer exception
                JOptionPane.showMessageDialog(null, "Vänligen välj ett datum");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void cbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdminActionPerformed

    private void btnTillbakaEttSteg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg7ActionPerformed
      close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg7ActionPerformed

    private void fyllCbValjOmrade() {
        String fraga = "SELECT BENAMNING FROM OMRADE;";

        ArrayList<String> allaOmraden;

        try {
            allaOmraden = idb.fetchColumn(fraga);
            for (String omrade : allaOmraden) {
                cbOmrade.addItem(omrade);
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }

    private void fyllCbAdmin() {

        ArrayList<String> admin = new ArrayList<String>();
        admin.add("Ja");
        admin.add("Nej");
        try {

            for (String admins : admin) {
                cbAdmin.addItem(admins);
            }
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "NÃ¥got gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnTillbakaEttSteg7;
    private javax.swing.JComboBox<String> cbAdmin;
    private javax.swing.JComboBox<String> cbOmrade;
    private com.toedter.calendar.JDateChooser datumValjare;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAndringSparad;
    private javax.swing.JLabel lblAnstallningsDatum;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn1;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JPasswordField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
