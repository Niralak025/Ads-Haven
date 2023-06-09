/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Nirala Kumar
 */
public class UserBookAdvertisement extends javax.swing.JFrame {

    float totalprice = 0.0f;
    String str = "";
    String str1 = "";
    String type = "Admin";

    /**
     * Creates new form BookAdvertisement
     */
    public UserBookAdvertisement() {
        initComponents();
        this.setSize(1150, 600);
        this.setBounds(350, 130, 1150, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        rdListField = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tvListField = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        bbListField = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        smListField = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        npListField = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        vhListField = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        billBoardBtn = new javax.swing.JButton();
        telVisBtn = new javax.swing.JButton();
        radBtn = new javax.swing.JButton();
        vhBtn = new javax.swing.JButton();
        nsBtn = new javax.swing.JButton();
        smBtn = new javax.swing.JButton();
        allBook = new javax.swing.JButton();
        custNameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        custMobTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        custAddTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        custSelTxt = new javax.swing.JTextArea();
        backbookBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rdListField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2500/-   One Month", "5000/-   Three Months", "7000/-   Six Months", "10000/- Nine Months", "13000/- One Year" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(rdListField);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 70, 178, 120);

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Radio Advertisement");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 30, 178, 32);

        tvListField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2500/-   One Month", "5000/-   Three Months", "7000/-   Six Months", "10000/- Nine Months", "13000/- One Year" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(tvListField);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 70, 178, 120);

        bbListField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2500/-   One Month", "5000/-   Three Months", "7000/-   Six Months", "10000/- Nine Months", "13000/- One Year" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(bbListField);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(630, 70, 178, 120);

        smListField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2500/-   One Month", "5000/-   Three Months", "7000/-   Six Months", "10000/- Nine Months", "13000/- One Year" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(smListField);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(90, 270, 178, 114);

        npListField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2500/-   One Month", "5000/-   Three Months", "7000/-   Six Months", "10000/- Nine Months", "13000/- One Year" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(npListField);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(350, 270, 178, 114);

        vhListField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2500/-   One Month", "5000/-   Three Months", "7000/-   Six Months", "10000/- Nine Months", "13000/- One Year" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(vhListField);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(620, 270, 178, 114);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Television Advertisement");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 30, 178, 32);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BillBoard Advertisement");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(630, 30, 178, 32);

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vehical Advertisement");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(618, 240, 190, 30);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Social Media Advertisement");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 240, 200, 30);

        billBoardBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        billBoardBtn.setText("Book Now");
        billBoardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billBoardBtnActionPerformed(evt);
            }
        });
        getContentPane().add(billBoardBtn);
        billBoardBtn.setBounds(650, 200, 140, 22);

        telVisBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        telVisBtn.setText("Book Now");
        telVisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telVisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(telVisBtn);
        telVisBtn.setBounds(380, 200, 140, 22);

        radBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        radBtn.setText("Book Now");
        radBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnActionPerformed(evt);
            }
        });
        getContentPane().add(radBtn);
        radBtn.setBounds(110, 200, 140, 22);

        vhBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        vhBtn.setText("Book Now");
        vhBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhBtnActionPerformed(evt);
            }
        });
        getContentPane().add(vhBtn);
        vhBtn.setBounds(640, 390, 140, 22);

        nsBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        nsBtn.setText("Book Now");
        nsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nsBtn);
        nsBtn.setBounds(370, 390, 140, 22);

        smBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        smBtn.setText("Book Now");
        smBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smBtnActionPerformed(evt);
            }
        });
        getContentPane().add(smBtn);
        smBtn.setBounds(110, 390, 140, 22);

        allBook.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        allBook.setText("All Book ");
        allBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBookActionPerformed(evt);
            }
        });
        getContentPane().add(allBook);
        allBook.setBounds(150, 460, 580, 27);

        custNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custNameTxtKeyReleased(evt);
            }
        });
        getContentPane().add(custNameTxt);
        custNameTxt.setBounds(880, 80, 240, 22);

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 80, 60, 16);

        custMobTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custMobTxtKeyReleased(evt);
            }
        });
        getContentPane().add(custMobTxt);
        custMobTxt.setBounds(880, 130, 240, 22);

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel8.setText("Mob No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(820, 130, 60, 16);

        custAddTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custAddTxtKeyReleased(evt);
            }
        });
        getContentPane().add(custAddTxt);
        custAddTxt.setBounds(880, 190, 240, 22);

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(820, 190, 60, 16);

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel10.setText("Items");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(820, 250, 50, 16);

        custSelTxt.setColumns(20);
        custSelTxt.setRows(5);
        jScrollPane7.setViewportView(custSelTxt);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(880, 250, 234, 86);

        backbookBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        backbookBtn.setText("Back");
        backbookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbookBtn);
        backbookBtn.setBounds(820, 460, 130, 27);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NewsPaper Advertisement");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(348, 240, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1150, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnActionPerformed
        // TODO add your handling code here:
        float price = 0.0f;

        if (rdListField.getSelectedValue() == "2500/-   One Month") {
            price += 2500;
        } else if (rdListField.getSelectedValue() == "5000/-   Three Months") {
            price += 5000;
        } else if (rdListField.getSelectedValue() == "7000/-   Six Months") {
            price += 7000;
        } else if (rdListField.getSelectedValue() == "10000/- Nine Months") {
            price += 10000;
        } else if (rdListField.getSelectedValue() == "13000/- One Year") {
            price += 13000;
        }

        JOptionPane.showMessageDialog(this, price);
        str = str + "\nRadio Advertisement = " + price;
        str1 = str1 + "\nRadio Advertisement";
        totalprice = totalprice + price;
        String query = "INSERT INTO productdetails(productname,productprice) VALUES(?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, "Radio Advertisement");
                pst.setFloat(2, price);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_radBtnActionPerformed

    private void telVisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telVisBtnActionPerformed
        // TODO add your handling code here:
        float price = 0;
        if (tvListField.getSelectedValue() == "2500/-   One Month") {
            price += 2500;
        } else if (tvListField.getSelectedValue() == "5000/-   Three Months") {
            price += 5000;
        } else if (tvListField.getSelectedValue() == "7000/-   Six Months") {
            price += 7000;
        } else if (tvListField.getSelectedValue() == "10000/- Nine Months") {
            price += 10000;
        } else if (tvListField.getSelectedValue() == "13000/- One Year") {
            price += 13000;
        }
        JOptionPane.showMessageDialog(this, price);
        str = str + "\nTelevision Advertisement = " + price;
        str1 = str1 + "\nTelevision Advertisement";
        totalprice = totalprice + price;

        String query = "INSERT INTO productdetails(productname,productprice) VALUES(?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, "Television Advertisement");
                pst.setFloat(2, price);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_telVisBtnActionPerformed

    private void billBoardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billBoardBtnActionPerformed
        // TODO add your handling code here:
        float price = 0.0f;
        if (bbListField.getSelectedValue() == "2500/-   One Month") {
            price += 2500;
        } else if (bbListField.getSelectedValue() == "5000/-   Three Months") {
            price += 5000;
        } else if (bbListField.getSelectedValue() == "7000/-   Six Months") {
            price += 7000;
        } else if (bbListField.getSelectedValue() == "10000/- Nine Months") {
            price += 10000;
        } else if (bbListField.getSelectedValue() == "13000/- One Year") {
            price += 13000;
        }
        JOptionPane.showMessageDialog(this, price);
        str = str + "\nBillBoard Advertisement = " + price;
        str1 = str1 + "\nBillBoard Advertisement";
        totalprice = totalprice + price;

        String query = "INSERT INTO productdetails(productname,productprice) VALUES(?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, "BillBoard Advertisement");
                pst.setFloat(2, price);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_billBoardBtnActionPerformed

    private void smBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smBtnActionPerformed
        // TODO add your handling code here:
        float price = 0.0f;
        if (smListField.getSelectedValue() == "2500/-   One Month") {
            price += 2500;
        } else if (smListField.getSelectedValue() == "5000/-   Three Months") {
            price += 5000;
        } else if (smListField.getSelectedValue() == "7000/-   Six Months") {
            price += 7000;
        } else if (smListField.getSelectedValue() == "10000/- Nine Months") {
            price += 10000;
        } else if (smListField.getSelectedValue() == "13000/- One Year") {
            price += 13000;
        }
        JOptionPane.showMessageDialog(this, price);
        str = str + "\nSocial Media Advertisement = " + price;
        str1 = str1 + "\nSocial Media Advertisement";
        totalprice = totalprice + price;

        String query = "INSERT INTO productdetails(productname,productprice) VALUES(?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, "Social media Advertisement");
                pst.setFloat(2, price);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_smBtnActionPerformed

    private void nsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsBtnActionPerformed
        // TODO add your handling code here:
        float price = 0.0f;
        if (npListField.getSelectedValue() == "2500/-   One Month") {
            price += 2500;
        } else if (npListField.getSelectedValue() == "5000/-   Three Months") {
            price += 5000;
        } else if (npListField.getSelectedValue() == "7000/-   Six Months") {
            price += 7000;
        } else if (npListField.getSelectedValue() == "10000/- Nine Months") {
            price += 10000;
        } else if (npListField.getSelectedValue() == "13000/- One Year") {
            price += 13000;
        }
        JOptionPane.showMessageDialog(this, price);
        str = str + "\nNewsPaper Advertisement = " + price;
        str1 = str1 + "\nNewsPaper Advertisement";
        totalprice = totalprice + price;

        String query = "INSERT INTO productdetails(productname,productprice) VALUES(?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, "Newspaper Advertisement");
                pst.setFloat(2, price);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_nsBtnActionPerformed

    private void vhBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhBtnActionPerformed
        // TODO add your handling code here:
        float price = 0.0f;

        if (vhListField.getSelectedValue() == "2500/-   One Month") {
            price += 2500;
        } else if (vhListField.getSelectedValue() == "5000/-   Three Months") {
            price += 5000;
        } else if (vhListField.getSelectedValue() == "7000/-   Six Months") {
            price += 7000;
        } else if (vhListField.getSelectedValue() == "10000/- Nine Months") {
            price += 10000;
        } else if (vhListField.getSelectedValue() == "13000/- One Year") {
            price += 13000;
        }
        JOptionPane.showMessageDialog(this, price);
        str = str + "\nVehical Advertisement =" + price;
        str1 = str1 + "\nVehical Advertisement";
        totalprice = totalprice + price;

        String query = "INSERT INTO productdetails(productname,productprice) VALUES(?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, "Vehical Advertisement");
                pst.setFloat(2, price);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_vhBtnActionPerformed

    private void allBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBookActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this, str + "\nTotal Amount = " + totalprice);
        //JOptionPane.showMessageDialog(this, totalprice);
        custSelTxt.setText(str1);
        //new BookingForm().setVisible(true);

        String query = "INSERT INTO booking(cname,cmob,caddress,bookingitems) VALUES(?,?,?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adhaven", "root", "1234");
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, custNameTxt.getText().trim());
                pst.setString(2, custMobTxt.getText().trim());
                pst.setString(3, custAddTxt.getText().trim());
                pst.setString(4, custSelTxt.getText().trim());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_allBookActionPerformed

    private void backbookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbookBtnActionPerformed
        // TODO add your handling code here:

        new UserMain().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_backbookBtnActionPerformed

    private void custNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custNameTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z ]{0,20}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(custNameTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Customer Name");
            custNameTxt.setText("");
        }
    }//GEN-LAST:event_custNameTxtKeyReleased

    private void custMobTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custMobTxtKeyReleased

        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,12}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(custMobTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Mobile No");
            custMobTxt.setText("");
        }
    }//GEN-LAST:event_custMobTxtKeyReleased

    private void custAddTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custAddTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9-, ()]{0,50}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(custAddTxt.getText().trim());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Please Enter correct Address");
            custAddTxt.setText("");
        }
    }//GEN-LAST:event_custAddTxtKeyReleased

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
            java.util.logging.Logger.getLogger(UserBookAdvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserBookAdvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserBookAdvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserBookAdvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserBookAdvertisement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allBook;
    private javax.swing.JButton backbookBtn;
    private javax.swing.JList<String> bbListField;
    private javax.swing.JButton billBoardBtn;
    private javax.swing.JTextField custAddTxt;
    private javax.swing.JTextField custMobTxt;
    private javax.swing.JTextField custNameTxt;
    private javax.swing.JTextArea custSelTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> npListField;
    private javax.swing.JButton nsBtn;
    private javax.swing.JButton radBtn;
    private javax.swing.JList<String> rdListField;
    private javax.swing.JButton smBtn;
    private javax.swing.JList<String> smListField;
    private javax.swing.JButton telVisBtn;
    private javax.swing.JList<String> tvListField;
    private javax.swing.JButton vhBtn;
    private javax.swing.JList<String> vhListField;
    // End of variables declaration//GEN-END:variables
}
