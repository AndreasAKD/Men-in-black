package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class ListaAgentUtrustning extends javax.swing.JFrame {

    private InfDB idb;

    public ListaAgentUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        FyllTxtArea(); // Anropar metoden för att direkt visa detta när man öppnar fönstret via menyn. 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAgentUtrustning = new javax.swing.JTextArea();
        lblDinUtrustning = new javax.swing.JLabel();
        btnTillbakaEttSteg5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtAreaAgentUtrustning.setColumns(20);
        txtAreaAgentUtrustning.setRows(5);
        jScrollPane1.setViewportView(txtAreaAgentUtrustning);

        lblDinUtrustning.setText("Din utrustning");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblDinUtrustning))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnTillbakaEttSteg5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDinUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaEttSteg5)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaEttSteg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttSteg5ActionPerformed
        close(); // Här anropas metoden för att stänga fönstret.
    }//GEN-LAST:event_btnTillbakaEttSteg5ActionPerformed
    public void close() {
        //Metod för att stänga fönstret, anropas på knappen "Tillbaka..."
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public void FyllTxtArea() {
        txtAreaAgentUtrustning.setText("");

        ArrayList<HashMap<String, String>> soktUtrustning;
        try {
            String AgentId = LoginMenyAgent.getSparatId();
            String fragaUtrustning = "SELECT BENAMNING FROM UTRUSTNING\n"
                    + "JOIN\n"
                    + "INNEHAR_UTRUSTNING ON INNEHAR_UTRUSTNING.UTRUSTNINGS_ID = UTRUSTNING.UTRUSTNINGS_ID\n"
                    + "WHERE AGENT_ID =" + AgentId;
            soktUtrustning = idb.fetchRows(fragaUtrustning);

            for (HashMap<String, String> utrustning : soktUtrustning) {
                txtAreaAgentUtrustning.append(utrustning.get("BENAMNING") + "\n");
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) { //Lägger även till NullPointerException
            JOptionPane.showMessageDialog(null, "Det finns för nuvarande ingen alien i detta område!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaEttSteg5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDinUtrustning;
    private javax.swing.JTextArea txtAreaAgentUtrustning;
    // End of variables declaration//GEN-END:variables
}
