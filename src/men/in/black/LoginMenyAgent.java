package men.in.black;


import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class LoginMenyAgent extends javax.swing.JFrame {

    private InfDB idb;
    private static String sparatId; // När man trycker på knappen logga in så sparas ID på den som loggas in här för att senare kunna anropas med nedan getMetod.
    //Private för att det inte ska kunna manipuleras utifrån. 

    public LoginMenyAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnvandarId = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        Anvandaridtext = new javax.swing.JTextField();
        LosenAgent = new javax.swing.JPasswordField();
        btnTillbakaMeny = new javax.swing.JButton();
        btnLoginAgent = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAnvandarId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnvandarId.setText("AnvändarID:");

        lblLosenord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLosenord.setText("Lösenord:");

        Anvandaridtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnvandaridtextActionPerformed(evt);
            }
        });

        btnTillbakaMeny.setText("Tillbaka till huvudmenyn");
        btnTillbakaMeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaMenyActionPerformed(evt);
            }
        });

        btnLoginAgent.setText("Logga in");
        btnLoginAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAgentActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRubrik.setText("Logga in som Agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLosenord)
                            .addComponent(lblAnvandarId))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoginAgent)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Anvandaridtext, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(LosenAgent))
                            .addComponent(btnTillbakaMeny, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anvandaridtext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnvandarId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(LosenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLoginAgent)
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaMeny)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static String getSparatId() {
        return sparatId;
    }
    private void AnvandaridtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnvandaridtextActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_AnvandaridtextActionPerformed
    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void btnTillbakaMenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaMenyActionPerformed
        close();// Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaMenyActionPerformed

    private void btnLoginAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAgentActionPerformed
        //Anledningen till att man loggar in med ID är för att det är det enda unika, man hade ju önskat ett Användarnamn i tabellerna men det har vi inte, likaså för Aliens.
        if (Validering.textFaltHarVarde(Anvandaridtext) && Validering.losenordFaltHarVarde(LosenAgent)) {
            try {
                String anvid = Anvandaridtext.getText();
                String sparadAnv = anvid;
                String losen = LosenAgent.getText();
                String fragalosen = "SELECT LOSENORD FROM AGENT WHERE AGENT_ID =" + anvid;
                String svar = idb.fetchSingle(fragalosen);

                if (anvid.trim().equals(anvid) && losen.trim().equals(svar)) {
                    AgentMeny menyAgent = new AgentMeny(idb);
                    sparatId = sparadAnv; // Här sparas ID i fältet ovan.
                    menyAgent.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Felaktigt användarnamn eller lösenord!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fel");
            }
        }
    }//GEN-LAST:event_btnLoginAgentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Anvandaridtext;
    private javax.swing.JPasswordField LosenAgent;
    private javax.swing.JButton btnLoginAgent;
    private javax.swing.JButton btnTillbakaMeny;
    private javax.swing.JLabel lblAnvandarId;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
