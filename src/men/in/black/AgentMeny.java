package men.in.black;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import oru.inf.InfDB;

public class AgentMeny extends javax.swing.JFrame {
 private InfDB idb;

    public AgentMeny(InfDB idb) {
        initComponents();
         this.idb = idb;
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        listaAliensPlats = new javax.swing.JButton();
        ListaOmradesChef = new javax.swing.JButton();
        btnSokInformationAlien = new javax.swing.JButton();
        ListaAliensDatum = new javax.swing.JButton();
        btnListaPaRasAlien = new javax.swing.JButton();
        btnRegistreraAlienAgent = new javax.swing.JButton();
        btnAndraAlienAgent = new javax.swing.JButton();
        btnLosenAgent = new javax.swing.JButton();
        btnRegistreraUtrustning = new javax.swing.JButton();
        btnTillbakaEttSteg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Meny Agent");

        listaAliensPlats.setText("Lista Aliens på plats");
        listaAliensPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAliensPlatsActionPerformed(evt);
            }
        });

        ListaOmradesChef.setText("Lista omradeschef");
        ListaOmradesChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaOmradesChefActionPerformed(evt);
            }
        });

        btnSokInformationAlien.setText("Sök information om enskild Alien");
        btnSokInformationAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokInformationAlienActionPerformed(evt);
            }
        });

        ListaAliensDatum.setText("Lista Aliens på datum");
        ListaAliensDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaAliensDatumActionPerformed(evt);
            }
        });

        btnListaPaRasAlien.setText("Lista Alien på ras");
        btnListaPaRasAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPaRasAlienActionPerformed(evt);
            }
        });

        btnRegistreraAlienAgent.setText("Registrera Alien");
        btnRegistreraAlienAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienAgentActionPerformed(evt);
            }
        });

        btnAndraAlienAgent.setText("Ändra alienuppgift");
        btnAndraAlienAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlienAgentActionPerformed(evt);
            }
        });

        btnLosenAgent.setText("Byt lösenord");
        btnLosenAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLosenAgentActionPerformed(evt);
            }
        });

        btnRegistreraUtrustning.setText("Registrera utrustning");
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        btnTillbakaEttSteg.setText("Tillbaka till inloggning");
        btnTillbakaEttSteg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaEttStegActionPerformed(evt);
            }
        });

        jButton1.setText("Lista min egen utrustning");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnTillbakaEttSteg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLosenAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListaPaRasAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSokInformationAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(ListaOmradesChef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listaAliensPlats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAndraAlienAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistreraUtrustning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListaAliensDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistreraAlienAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraAlienAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaAliensPlats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListaOmradesChef)
                .addGap(11, 11, 11)
                .addComponent(btnSokInformationAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistreraUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListaAliensDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListaPaRasAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistreraAlienAgent)
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(51, 51, 51)
                .addComponent(btnLosenAgent)
                .addGap(34, 34, 34)
                .addComponent(btnTillbakaEttSteg)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAliensPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAliensPlatsActionPerformed
        ListaAliensPaPlats sokFonster = new ListaAliensPaPlats(idb);
        sokFonster.setVisible(true);
    }//GEN-LAST:event_listaAliensPlatsActionPerformed

    private void ListaOmradesChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaOmradesChefActionPerformed
        VisaOmradesChefAgent omradeFonster = new VisaOmradesChefAgent(idb);
        omradeFonster.setVisible(true);
    }//GEN-LAST:event_ListaOmradesChefActionPerformed

    private void ListaAliensDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaAliensDatumActionPerformed
        ListaAliensDatum NyttFonsterListaAliensDatum = new ListaAliensDatum(idb);
        NyttFonsterListaAliensDatum.setVisible(true);
    }//GEN-LAST:event_ListaAliensDatumActionPerformed

    private void btnRegistreraAlienAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienAgentActionPerformed
        RegistreraAlien nyttFonsterRegistreraAlien = new RegistreraAlien(idb);
        nyttFonsterRegistreraAlien.setVisible(true);
    }//GEN-LAST:event_btnRegistreraAlienAgentActionPerformed

    private void btnAndraAlienAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAlienAgentActionPerformed
        AndraInformationAlienEnkel nyttAndraAlienFonster = new AndraInformationAlienEnkel(idb);
        nyttAndraAlienFonster.setVisible(true);
    }//GEN-LAST:event_btnAndraAlienAgentActionPerformed

    private void btnLosenAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLosenAgentActionPerformed
        AndraLosenordAgent andraLosenFonster = new AndraLosenordAgent(idb);
        andraLosenFonster.setVisible(true);
    }//GEN-LAST:event_btnLosenAgentActionPerformed

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
       RegistreraUtrustning nyttFonsterLaggTillUtrustning = new RegistreraUtrustning(idb);
        nyttFonsterLaggTillUtrustning.setVisible(true);
    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

    private void btnListaPaRasAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPaRasAlienActionPerformed
        ListaAliensRas nyttFonsterListaAliensRas = new ListaAliensRas(idb);
        nyttFonsterListaAliensRas.setVisible(true);
    }//GEN-LAST:event_btnListaPaRasAlienActionPerformed

    private void btnTillbakaEttStegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaEttStegActionPerformed
    close();
    }//GEN-LAST:event_btnTillbakaEttStegActionPerformed

    private void btnSokInformationAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokInformationAlienActionPerformed
        SokEnskildAlien nyttFonsterSokEnskildAlien = new SokEnskildAlien(idb);
        nyttFonsterSokEnskildAlien.setVisible(true);
    }//GEN-LAST:event_btnSokInformationAlienActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaAgentUtrustning nyttFonsterAgentUtrustning = new ListaAgentUtrustning(idb);
        nyttFonsterAgentUtrustning.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListaAliensDatum;
    private javax.swing.JButton ListaOmradesChef;
    private javax.swing.JButton btnAndraAlienAgent;
    private javax.swing.JButton btnListaPaRasAlien;
    private javax.swing.JButton btnLosenAgent;
    private javax.swing.JButton btnRegistreraAlienAgent;
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JButton btnSokInformationAlien;
    private javax.swing.JButton btnTillbakaEttSteg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JButton listaAliensPlats;
    // End of variables declaration//GEN-END:variables
}
