/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbms.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Cust_op extends javax.swing.JFrame {

    /**
     * Creates new form Cust_op
     */
    public Cust_op() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YOUR_DETAILS = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        USERID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        YOUR_DETAILS.setText("KNOW YOUR DETAILS");
        YOUR_DETAILS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YOUR_DETAILSActionPerformed(evt);
            }
        });

        jButton2.setText("NOMINEE DETAILS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("RENEW YOUR POLICY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("VEHICLES DETAILS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("USER ID:");

        jButton1.setText("ACCIDENT HISTORY");
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
                .addGap(464, 464, 464)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YOUR_DETAILS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(USERID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(502, 502, 502))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(USERID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(YOUR_DETAILS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        nominee_det n=new nominee_det();
        n.setVisible(true);
        String userid=USERID.getText();
        n.label.setText(userid);
        n.toFront();
        dispose();
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hhh_insurance?autoReconnect=true&useSSL=false", "root", "1234");
           String user=USERID.getText();
           Statement st1=con.createStatement();
           String query="select * from nominee where cust_id='"+user+"'";
           ResultSet rs=st1.executeQuery(query);
           while(rs.next())
           {
               String nominee_name=rs.getString("nom_name");
               String nominee_relation=rs.getString("nom_rel");
               String nominee_ph=rs.getString("nom_phno");
               String cust_id=rs.getString("cust_id");
               DefaultTableModel model1=(DefaultTableModel)n.nominee.getModel();
               model1.addRow(new Object[]{nominee_name,nominee_relation, nominee_ph, cust_id});
           }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void YOUR_DETAILSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YOUR_DETAILSActionPerformed
        // TODO add your handling code here:
       
        Cust_Table c=new Cust_Table();
        c.setVisible(true);
        String userid=USERID.getText();
        c.label.setText(userid);
        dispose();
        
        
        
        try{
           Class.forName("com.mysql.jdbc.Driver"); 
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hhh_insurance?autoReconnect=true&useSSL=false", "root", "1234");
          // String username=USERNAME.getText();
           //String password1=PASSWORD.getText();
           String user=USERID.getText();
           Statement st1=con.createStatement();
           String query="select * from customer where cust_id='"+user+"'";
            ResultSet rs=st1.executeQuery(query);
            while(rs.next())
            {
                int cust_id=rs.getInt("cust_id");
                String name= rs.getString("cust_name");
                String email= rs.getString("cust_email");
                String ph_no= rs.getString("cust_p_no");
                String date= rs.getString("cust_dob");
                int age= rs.getInt("cust_age");
                String city= rs.getString("cust_city");
                String locality= rs.getString("cust_locality");
                int pin= rs.getInt("cust_pin");
                int branch_id= rs.getInt("Branch_id");
                DefaultTableModel model=(DefaultTableModel)c.output.getModel();
                model.addRow(new Object[]{cust_id, name, email, ph_no, date, age, city, locality, pin, branch_id});
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
            
    }//GEN-LAST:event_YOUR_DETAILSActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
            renew_policy r=new renew_policy();
            String userid=USERID.getText();
            r.USER_ID.setText(userid);     
            r.setVisible(true);
            dispose();
           
            
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        accident_det a=new accident_det();
        a.setVisible(true);
        String userid=USERID.getText();
            a.label.setText(userid); 
            dispose();
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hhh_insurance?autoReconnect=true&useSSL=false", "root", "1234");
           String user=USERID.getText();
           Statement st1=con.createStatement();
           String query="select * from accident where cust_id='"+user+"'";
           ResultSet rs=st1.executeQuery(query);
           while(rs.next())
           {
               String acc_id= rs.getString("acc_id");
               String acc_time=rs.getString("acc_time");
               String acc_date=rs.getString("acc_date");
               String acc_place=rs.getString("acc_place");
               String acc_fat=rs.getString("acc_fatality");
               String acc_amt=rs.getString("acc_claim_amt");
               String reg_no=rs.getString("reg_no");
               DefaultTableModel model=(DefaultTableModel)a.acc_det.getModel();
               model.addRow(new Object[]{acc_id, acc_time, acc_date, acc_place, acc_fat, acc_amt, reg_no});
           }
           
           
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        vehicle_det v=new vehicle_det();
        v.setVisible(true);
        String userid=USERID.getText();
            v.label.setText(userid); 
            dispose();
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hhh_insurance?autoReconnect=true&useSSL=false", "root", "1234");
           String user=USERID.getText();
           Statement st1=con.createStatement();
           String query="select * from vehicle where cust_id='"+user+"'";
           ResultSet rs=st1.executeQuery(query);
           while(rs.next())
           {
               String v_model=rs.getString("v_model");
               String v_make=rs.getString("v_make");
               String v_n_c_b=rs.getString("v_n_c_b");
               String v_chasis=rs.getString("v_chasis_no");
               String v_man_year=rs.getString("v_man_year");
               String v_e_no=rs.getString("v_eng_no");
                DefaultTableModel model1=(DefaultTableModel)v.veh_det.getModel();
               model1.addRow(new Object[]{v_model, v_make, v_n_c_b, v_chasis, v_man_year, v_e_no});
               
           }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
           
        
              
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Cust_op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cust_op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cust_op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cust_op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cust_op c=new Cust_op();
                c.setVisible(true);
                c.setTitle("CUSTOMER DETAILS");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel USERID;
    private javax.swing.JButton YOUR_DETAILS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
