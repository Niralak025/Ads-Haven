/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Nirala Kumar
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Customers
     */
    public Customers() {
        initComponents();
        this.setSize(900, 600);
        this.setBounds(350, 130, 900, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cnTxt = new javax.swing.JTextField();
        ceTxt = new javax.swing.JTextField();
        cmTxt = new javax.swing.JTextField();
        canTxt = new javax.swing.JTextField();
        caTxt = new javax.swing.JTextField();
        addcBtn = new javax.swing.JButton();
        adcBackBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(118, 119, 159, 28);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(118, 203, 159, 26);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel3.setText("Mobile No.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(118, 285, 159, 27);

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("Addhar No");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(118, 363, 159, 26);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(118, 435, 159, 27);

        cnTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnTxtKeyReleased(evt);
            }
        });
        getContentPane().add(cnTxt);
        cnTxt.setBounds(314, 119, 450, 28);

        ceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ceTxtKeyReleased(evt);
            }
        });
        getContentPane().add(ceTxt);
        ceTxt.setBounds(314, 203, 450, 26);

        cmTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmTxtKeyReleased(evt);
            }
        });
        getContentPane().add(cmTxt);
        cmTxt.setBounds(314, 285, 450, 27);

        canTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                canTxtKeyReleased(evt);
            }
        });
        getContentPane().add(canTxt);
        canTxt.setBounds(314, 363, 450, 26);

        caTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caTxtKeyReleased(evt);
            }
        });
        getContentPane().add(caTxt);
        caTxt.setBounds(314, 435, 450, 27);

        addcBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        addcBtn.setText("Submit");
        addcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addcBtn);
        addcBtn.setBounds(600, 500, 200, 50);

        adcBackBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        adcBackBtn.setText("Back");
        adcBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(adcBackBtn);
        adcBackBtn.setBounds(100, 500, 200, 50);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel6.setText("                  Customer's Details");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(274, 26, 350, 57);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adcBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcBackBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminMain().setVisible(true);
    }//GEN-LAST:event_adcBackBtnActionPerformed

    private void addcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcBtnActionPerformed
        // TODO add your handling code here:
        
            String query = "INSERT INTO customersdetails(cname,cemail,cmob,caddharno,caddress) VALUES(?,?,?,?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1,cnTxt.getText().trim());
                pst.setString(2,ceTxt.getText().trim());
                pst.setString(3,cmTxt.getText().trim());
                pst.setString(4,canTxt.getText().trim());
                pst.setString(5,caTxt.getText().trim());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_addcBtnActionPerformed

    private void cnTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z ]{0,30}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(cnTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Name");
            cnTxt.setText("");
        }
    }//GEN-LAST:event_cnTxtKeyReleased

    private void ceTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ceTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9@.]{0,50}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ceTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Email");
            ceTxt.setText("");
        }
    }//GEN-LAST:event_ceTxtKeyReleased

    private void cmTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,12}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(cmTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Mobile No");
            cmTxt.setText("");
        }
    }//GEN-LAST:event_cmTxtKeyReleased

    private void canTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,15}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(canTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Addhar no");
            canTxt.setText("");
        }
    }//GEN-LAST:event_canTxtKeyReleased

    private void caTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9-, ()]{0,50}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(caTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Address");
            caTxt.setText("");
        }
    }//GEN-LAST:event_caTxtKeyReleased

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adcBackBtn;
    private javax.swing.JButton addcBtn;
    private javax.swing.JTextField caTxt;
    private javax.swing.JTextField canTxt;
    private javax.swing.JTextField ceTxt;
    private javax.swing.JTextField cmTxt;
    private javax.swing.JTextField cnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
