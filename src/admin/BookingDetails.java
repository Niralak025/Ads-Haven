/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nirala Kumar
 */
public class BookingDetails extends javax.swing.JFrame {

    /**
     * Creates new form BookingDetails
     */
    public BookingDetails() {
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

        bdBackBtn = new javax.swing.JButton();
        showBookBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bdBackBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bdBackBtn.setText("Back");
        bdBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bdBackBtn);
        bdBackBtn.setBounds(600, 500, 200, 50);

        showBookBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        showBookBtn.setText("Show Details");
        showBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showBookBtn);
        showBookBtn.setBounds(100, 500, 200, 50);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        bookingTable.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.No.", "Name", "Mob.No.", "Address", "Booking Items"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookingTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 191, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdBackBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminMain().setVisible(true);
    }//GEN-LAST:event_bdBackBtnActionPerformed

    private void showBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtr;
        dtr = (DefaultTableModel) bookingTable.getModel();
        dtr.setRowCount(3);//initial value of row set 
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {

                PreparedStatement pst = conn.prepareStatement("SELECT * FROM booking");
                ResultSet rst = pst.executeQuery();
                while (rst.next()) {
                    dtr.addRow(new Object[]{rst.getInt("id"), rst.getString("cname"), rst.getString("cmob"),rst.getString("caddress"), rst.getString("bookingitems")});
                } 

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_showBookBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BookingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdBackBtn;
    private javax.swing.JTable bookingTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showBookBtn;
    // End of variables declaration//GEN-END:variables
}
