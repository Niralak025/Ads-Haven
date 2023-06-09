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
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
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
        jLabel6 = new javax.swing.JLabel();
        enTxt = new javax.swing.JTextField();
        emTxt = new javax.swing.JTextField();
        eeTxt = new javax.swing.JTextField();
        eaTxt = new javax.swing.JTextField();
        eanTxt = new javax.swing.JTextField();
        erTxt = new javax.swing.JTextField();
        eaddBtn = new javax.swing.JButton();
        aeBackBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel1.setText("Name ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(185, 85, 118, 30);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Mobile No.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(185, 144, 118, 30);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel3.setText("Email ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(185, 211, 118, 30);

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(185, 287, 118, 30);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Role");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(185, 441, 118, 30);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel6.setText("Addhar No");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(185, 366, 118, 30);

        enTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enTxtKeyReleased(evt);
            }
        });
        getContentPane().add(enTxt);
        enTxt.setBounds(384, 85, 320, 30);

        emTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emTxtKeyReleased(evt);
            }
        });
        getContentPane().add(emTxt);
        emTxt.setBounds(384, 144, 320, 30);

        eeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eeTxtKeyReleased(evt);
            }
        });
        getContentPane().add(eeTxt);
        eeTxt.setBounds(384, 211, 320, 30);

        eaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eaTxtKeyReleased(evt);
            }
        });
        getContentPane().add(eaTxt);
        eaTxt.setBounds(384, 287, 320, 30);

        eanTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eanTxtKeyReleased(evt);
            }
        });
        getContentPane().add(eanTxt);
        eanTxt.setBounds(384, 366, 320, 30);

        erTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                erTxtKeyReleased(evt);
            }
        });
        getContentPane().add(erTxt);
        erTxt.setBounds(384, 441, 320, 30);

        eaddBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        eaddBtn.setText("Submit");
        eaddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eaddBtn);
        eaddBtn.setBounds(600, 500, 200, 50);

        aeBackBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        aeBackBtn.setText("Back");
        aeBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aeBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aeBackBtn);
        aeBackBtn.setBounds(100, 500, 200, 50);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel7.setText("                                  Employee Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aeBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aeBackBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminMain().setVisible(true);
    }//GEN-LAST:event_aeBackBtnActionPerformed

    private void eaddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaddBtnActionPerformed
        // TODO add your handling code here:
        
        String query = "INSERT INTO employeedetails(ename,emob,eemail,eaddress,eaddharno,erole) VALUES(?,?,?,?,?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1,enTxt.getText().trim());
                pst.setString(2,emTxt.getText().trim());
                pst.setString(3,eeTxt.getText().trim());
                pst.setString(4,eaTxt.getText().trim());
                pst.setString(5,eanTxt.getText().trim());
                pst.setString(6,erTxt.getText().trim());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_eaddBtnActionPerformed

    private void enTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z ]{0,30}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(enTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Name");
            enTxt.setText("");
        }
    }//GEN-LAST:event_enTxtKeyReleased

    private void emTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,12}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(emTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Mobile No");
            emTxt.setText("");
        }
    }//GEN-LAST:event_emTxtKeyReleased

    private void eeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eeTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9@.]{0,50}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(eeTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Email");
            eeTxt.setText("");
        }
    }//GEN-LAST:event_eeTxtKeyReleased

    private void eaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eaTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9-, ()]{0,50}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(eaTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Address");
            eaTxt.setText("");
        }
    }//GEN-LAST:event_eaTxtKeyReleased

    private void eanTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eanTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,15}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(eanTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Addhar no");
            eanTxt.setText("");
        }
    }//GEN-LAST:event_eanTxtKeyReleased

    private void erTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_erTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,15}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(erTxt.getText().trim());
        if(!match.matches()){
            JOptionPane.showMessageDialog(null, "Please Enter correct Role");
            eanTxt.setText("");
        }
    }//GEN-LAST:event_erTxtKeyReleased

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aeBackBtn;
    private javax.swing.JTextField eaTxt;
    private javax.swing.JButton eaddBtn;
    private javax.swing.JTextField eanTxt;
    private javax.swing.JTextField eeTxt;
    private javax.swing.JTextField emTxt;
    private javax.swing.JTextField enTxt;
    private javax.swing.JTextField erTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
