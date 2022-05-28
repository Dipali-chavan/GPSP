
package gpms;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenevo
 */
public class MarriageSearch extends javax.swing.JInternalFrame {

    /**
     * Creates new form MarriageSearch
     */
    DefaultTableModel model;
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public MarriageSearch() {
        initComponents();
        model=(DefaultTableModel) jTable_Users.getModel();

        findUsers();
    }
    public Connection getConnection()
    {
     
        
        try{
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/forms","root","");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
 // function to return users arraylist with particular data 
    public ArrayList<MarriageClass> ListUsers(String ValToSearch)
    {
        ArrayList<MarriageClass> usersList = new ArrayList<MarriageClass>();
        
        Statement st;
       
        
        try{
            con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `marriagetable` WHERE CONCAT(husbandname,wifename,placeofmarriage,marriagedate,regdate,regno)LIKE'%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            
            MarriageClass ms;
            
            while(rs.next())
            {
                ms = new MarriageClass(
                                 rs.getString("husbandname"),
                                 rs.getString("wifename"),
                                 rs.getString("placeofmarriage"),
                                 rs.getDate("marriagedate"),

                                 rs.getDate("regdate"),
                                 rs.getInt("regno")
                                 
                                );
                usersList.add(ms);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
    }
    
    // function to display data in jtable
    public void findUsers()
    {
        ArrayList<MarriageClass> users = ListUsers(jText_Search.getText());
     
        model.setColumnIdentifiers(new Object[]{"Husband_Name","Wife_Name","Place_of_Marriage","Marriage_Date","Regdate","RegNo"});
        Object[] row = new Object[6];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getHusband_Name();
            row[1] = users.get(i).getWife_Name();
            row[2] = users.get(i).getPlace_of_Marriage();
            row[3] = users.get(i).getMarriage_Date();
            row[4] = users.get(i).getRegdate();
            row[5] = users.get(i).getRegNo();

            model.addRow(row);
        }
       jTable_Users.setModel(model);
       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jText_Search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1150, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jText_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_SearchActionPerformed(evt);
            }
        });
        getContentPane().add(jText_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 54, 191, 29));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 53, -1, 29));

        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Husband_Name", "Wife_Name", "Place_of_Marriage", "Marriage_Date", "Regdate", "RegNo"
            }
        ));
        jTable_Users.setRowHeight(22);
        jTable_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 287, 749, 97));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 230, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 230, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("ADD");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 230, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 53, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Husband_Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 146, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Wife_Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 146, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Place_of_Marriage");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 146, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Marriage_Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 146, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Regdate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 146, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("RegNo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 146, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 173, 112, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 173, 105, 30));

        jTextField3.setMinimumSize(new java.awt.Dimension(6, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 173, 119, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 173, 129, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 173, 127, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 169, 131, 34));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    findUsers();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int i=jTable_Users.getSelectedRow();        // TODO add your handling code here:
           if(i>=0)
           {
               model.removeRow(i);
           }
           else
           {
               System.out.print("delete rows");
           }
           try
         {
             String sql="DELETE FROM marriagetable WHERE regno=?";
             con=(Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/forms","root","");
             pst=(PreparedStatement) con.prepareStatement(sql);
             pst.setString(1, jTextField6.getText());
             
             pst.executeUpdate();
             
            JOptionPane.showMessageDialog(null,"Remove successfully");
            jTextField1.setText(" ");
          jTextField2.setText(" ");
          jTextField3.setText(" ");jTextField4.setText(" ");jTextField5.setText(" ");jTextField6.setText(" "); 
             
         }
         catch(HeadlessException | SQLException ex)
         {
             JOptionPane.showMessageDialog(null,"Remove success");
         }      // TODO add your handl  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jText_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_SearchActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UsersMouseClicked
       int i=jTable_Users.getSelectedRow();
        jTextField1.setText(model.getValueAt(i, 0).toString());
        jTextField2.setText(model.getValueAt(i, 1).toString());
        jTextField3.setText(model.getValueAt(i, 2).toString());
        jTextField4.setText(model.getValueAt(i, 3).toString());        
        jTextField5.setText(model.getValueAt(i, 4).toString());
        jTextField6.setText(model.getValueAt(i, 5).toString());      
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_UsersMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i=jTable_Users.getSelectedRow();
          if(i>=0)
          {
              model.setValueAt(jTextField1.getText(), i, 0);
              model.setValueAt(jTextField2.getText(), i, 1);
              model.setValueAt(jTextField3.getText(), i, 2);
              model.setValueAt(jTextField4.getText(), i, 3);
              model.setValueAt(jTextField5.getText(), i, 4);
              model.setValueAt(jTextField6.getText(), i, 5);
             
            

              
          }
          try
          {
             String query="UPDATE marriagetable SET husbandname=?,wifename=?,placeofmarriage=?,marriagedate=?,regdate=? WHERE regno=?";
             con=(Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/forms","root","");
             pst=(PreparedStatement) con.prepareStatement(query);
             pst.setString(6, jTextField6.getText());
             pst.setString(1, jTextField1.getText());
             pst.setString(2, jTextField2.getText());
             pst.setString(3, jTextField3.getText());
             pst.setString(4, jTextField4.getText());
             pst.setString(5, jTextField5.getText());
             

             pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"updated succesfully");
          }
          catch(HeadlessException | SQLException ex)
         {
             JOptionPane.showMessageDialog(null,"update success");
         }
          jTextField1.setText(" ");
          jTextField2.setText(" ");
          jTextField3.setText(" ");jTextField4.setText(" ");jTextField5.setText(" ");jTextField6.setText(" "); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jText_Search;
    // End of variables declaration//GEN-END:variables
}
