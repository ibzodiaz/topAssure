/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assure;

import java.awt.Dimension;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class Opening extends javax.swing.JFrame {

    /**
     * Creates new form Opening
     */
    Dimension d = new Dimension(825,285);
    public Opening() {
        initComponents();
        chargement();
        this.setSize(d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAccess = new javax.swing.JButton();
        jlbPercentInc = new javax.swing.JLabel();
        loadprogress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btnAccess.setBackground(new java.awt.Color(255, 255, 255));
        btnAccess.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAccess.setForeground(new java.awt.Color(255, 0, 51));
        btnAccess.setText("Accéder à l'application");
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccess);
        btnAccess.setBounds(640, 240, 185, 40);

        jlbPercentInc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbPercentInc.setForeground(new java.awt.Color(255, 0, 51));
        jlbPercentInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbPercentInc.setText("0");
        getContentPane().add(jlbPercentInc);
        jlbPercentInc.setBounds(180, 230, 440, 40);
        getContentPane().add(loadprogress);
        loadprogress.setBounds(30, 210, 770, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assurance-auto-resilie.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 825, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        this.dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_btnAccessActionPerformed
    
    public void chargement(){
        btnAccess.setVisible(false);
        new Thread(new Runnable() {
            public void run(){
                for(int i = 0 ; i <= 100 ; i++ ){
                    jlbPercentInc.setText(""+i+"%");
                    loadprogress.setValue(i);
                    try{
                        Thread.sleep(50);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                
                jlbPercentInc.setText("Chargement de l'application terminé !");
                btnAccess.setVisible(true);  
            }
        }).start();
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
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opening().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbPercentInc;
    private javax.swing.JProgressBar loadprogress;
    // End of variables declaration//GEN-END:variables
}
