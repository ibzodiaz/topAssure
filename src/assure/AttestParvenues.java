/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assure;

import static assure.ListClients.jTableClient;
import static assure.ShowAttestClient.jAgence;
import static assure.ShowAttestClient.jCode;
import static assure.ShowAttestClient.jDate;
import static assure.ShowAttestClient.jLocalisation;
import static assure.ShowAttestClient.jNombreAttestation;
import static assure.ShowAttestClient.jTypeAttestation;
import connexion.connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AttestParvenues extends javax.swing.JFrame {

    Connection connection;
    PreparedStatement pstmt;
    Statement stmt;
    ResultSet rs;
    int compteur = 0;
    
    public void connect(){
        connection = new connexion().bdd();
    }
    public AttestParvenues(ListClients lc) {
        initComponents();
        Table2();
        jNombreAttestationP.setText(String.valueOf(jTableParvenus.getRowCount()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParvenus = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSearchP = new javax.swing.JButton();
        txtSearchP = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnDeleteP = new javax.swing.JButton();
        btnDeleteAllP = new javax.swing.JButton();
        btnActualizeP = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jCodeP = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTypeAttestationP = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLocalisationP = new javax.swing.JLabel();
        jNombreAttestationP = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jAgenceP = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 10, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableParvenus.setBackground(new java.awt.Color(255, 255, 51));
        jTableParvenus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTableParvenus);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RECHERCHE PAR DATE ET TEMPS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnSearchP.setBackground(new java.awt.Color(51, 51, 255));
        btnSearchP.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchP.setText("Rechercher");
        btnSearchP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPActionPerformed(evt);
            }
        });

        txtSearchP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSearchP, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
            .addComponent(btnSearchP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtSearchP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnDeleteP.setBackground(new java.awt.Color(255, 0, 51));
        btnDeleteP.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteP.setText("Supprimer");
        btnDeleteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePActionPerformed(evt);
            }
        });

        btnDeleteAllP.setBackground(new java.awt.Color(0, 153, 0));
        btnDeleteAllP.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAllP.setText("Vider tout le tableau");
        btnDeleteAllP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllPActionPerformed(evt);
            }
        });

        btnActualizeP.setBackground(new java.awt.Color(51, 51, 255));
        btnActualizeP.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizeP.setText("Actualiser");
        btnActualizeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizePActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteAllP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizeP, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btnDeleteAllP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizeP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attestations Parvenues", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("CODE :");

        jCodeP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCodeP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("TYPE D'ATTESTATIONS :");

        jTypeAttestationP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTypeAttestationP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("LOCALISATION :");

        jLocalisationP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLocalisationP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jNombreAttestationP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jNombreAttestationP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("NOMBRE D'ATTESTATIONS PARVENU :");

        jAgenceP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAgenceP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("AGENCE :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jNombreAttestationP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jAgenceP, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 507, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCodeP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTypeAttestationP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLocalisationP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNombreAttestationP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLocalisationP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCodeP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTypeAttestationP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jAgenceP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(399, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPActionPerformed

    private void btnSearchPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPActionPerformed
      
        String searched = txtSearchP.getText();
        
        if(searched.equals("")){
           
           JOptionPane.showMessageDialog(null,"Veuillez d'abord remplir le champ de recherche !");
           
        }else{

            String[] production ={"ATTESTATIONS PARVENUES","DATE"};

            String[] afficher = new String[2];

            DefaultTableModel model = new DefaultTableModel(null,production);

            jTableParvenus.removeAll();

            try {

                connect();

                int i= jTableClient.getSelectedRow();
                DefaultTableModel model0= (DefaultTableModel) jTableClient.getModel();

                pstmt = connection.prepareStatement("SELECT * FROM attestationParvenue WHERE coming_date LIKE ? AND idTheClient = ?");

                pstmt.setString(1,"%"+searched+"%");
                pstmt.setString(2,model0.getValueAt(i,0).toString());
                rs = pstmt.executeQuery();

                while(rs.next()){
                     
                    afficher[0] = rs.getString("numero");
                    afficher[1] = rs.getString("coming_date");
                    model.addRow(afficher);

                }



                jTableParvenus.setModel(model);
                jNombreAttestationP.setText(jTableParvenus.getRowCount()+"");
                connection.close();

            } catch (Exception e) {

                e.printStackTrace();

            }
       }
        
    }//GEN-LAST:event_btnSearchPActionPerformed

    private void btnDeleteAllPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllPActionPerformed
        connect();
        int i= jTableClient.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel) jTableClient.getModel();
        int res = JOptionPane.showConfirmDialog(null, "êtes vous sûr ?","Suppression",JOptionPane.WARNING_MESSAGE);
        if(res == JOptionPane.YES_OPTION){
            try {
                pstmt = connection.prepareStatement("DELETE FROM attestationParvenue WHERE idTheClient = ?");
                pstmt.setString(1,model.getValueAt(i,0).toString());
                pstmt.executeUpdate();
                connection.close();
                JOptionPane.showMessageDialog(null,"Le tableau est vidé !");
                Table1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteAllPActionPerformed

    private void btnDeletePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePActionPerformed
        connect();
        int i= jTableClient.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel) jTableClient.getModel();
        
        int j= jTableParvenus.getSelectedRow();
        DefaultTableModel model1= (DefaultTableModel) jTableParvenus.getModel();
        
        int res = JOptionPane.showConfirmDialog(null, "êtes vous sûr ?","Suppression",JOptionPane.WARNING_MESSAGE);
        if(res == JOptionPane.YES_OPTION){
            try {
                pstmt = connection.prepareStatement("DELETE FROM attestationParvenue WHERE idTheClient = ? AND numero = ?");
                pstmt.setString(1,model.getValueAt(i,0).toString());
                pstmt.setString(2,model1.getValueAt(j,0).toString());
                pstmt.executeUpdate();
                connection.close();
                JOptionPane.showMessageDialog(null,"Supprimé");
                Table1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeletePActionPerformed

    private void btnActualizePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizePActionPerformed
        Table1();
    }//GEN-LAST:event_btnActualizePActionPerformed

    public void Table1(){
        connect();
        int i= jTableClient.getSelectedRow();
        DefaultTableModel model0= (DefaultTableModel) jTableClient.getModel();
        
        jCodeP.setText(model0.getValueAt(i,1).toString());
        jAgenceP.setText(model0.getValueAt(i,2).toString());
        jLocalisationP.setText(model0.getValueAt(i,3).toString());
        jNombreAttestationP.setText(String.valueOf(jTableParvenus.getRowCount()));
        jTypeAttestationP.setText(model0.getValueAt(i,5).toString());
        
        
        String[] production ={"ATTESTATIONS PARVENUES","DATE"};

        String[] afficher = new String[2];
    
        DefaultTableModel model = new DefaultTableModel(null,production);
        try {

            connect();

            Statement st = connection.createStatement();

            rs = st.executeQuery("SELECT * FROM attestationParvenue WHERE "+model0.getValueAt(i,0).toString()+" = idTheClient");

           

            while(rs.next()){
                
                afficher[0] = rs.getString("numero");                
                afficher[1] = rs.getString("coming_date");
                model.addRow(afficher);
                
                compteur++;
            }

            jTableParvenus.setModel(model);
            
         
            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }finally{

            if(connection != null)

                try {

                        connection.close();

                } catch (SQLException ex) {

                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);

                }

        }
    }
     
    public void Table2(){
        String[] production ={"ATTESTATIONS PARVENUES","DATE"};

        String[] afficher = new String[2];
    
        DefaultTableModel model = new DefaultTableModel(null,production);
        
        jTableParvenus.setModel(model);
        
        
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AttestParvenues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttestParvenues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttestParvenues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttestParvenues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttestParvenues(new ListClients()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizeP;
    private javax.swing.JButton btnDeleteAllP;
    private javax.swing.JButton btnDeleteP;
    private javax.swing.JButton btnSearchP;
    public static javax.swing.JLabel jAgenceP;
    public static javax.swing.JLabel jCodeP;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLocalisationP;
    public static javax.swing.JLabel jNombreAttestationP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableParvenus;
    public static javax.swing.JLabel jTypeAttestationP;
    private javax.swing.JTextField txtSearchP;
    // End of variables declaration//GEN-END:variables
}
