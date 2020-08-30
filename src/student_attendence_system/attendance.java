package student_attendence_system;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;




public class attendance extends javax.swing.JFrame {
     Connection con=null;
     PreparedStatement pst = null;
     ResultSet rs =null;
     
    public attendance() {
        initComponents();
        dept();
        //TableExample();
    }
   

    private void dept(){
    String sql = "SELECT DISTINCT s_dept FROM student";
        String sql1 = "SELECT DISTINCT s_intake FROM student";

            String sql2 = "SELECT DISTINCT s_section FROM student";

                String sql3 = "SELECT DISTINCT s_shift FROM student";
                String sql4 = "SELECT DISTINCT s_crs_code FROM student";

         try {
             Class.forName("com.mysql.jdbc.Driver");
                
                con = DriverManager.getConnection("jdbc:mysql://localhost/student_attendance","root","");
             pst = con.prepareStatement(sql);
             rs = pst.executeQuery();
             while(rs.next()){
             
             s_dept.addItem(rs.getString("s_dept"));
             }
             pst = con.prepareStatement(sql1);
             rs = pst.executeQuery();
              while(rs.next()){
             
             
             s_intake.addItem(rs.getString("s_intake"));
             
             }
              pst = con.prepareStatement(sql2);
             rs = pst.executeQuery();
               while(rs.next()){
            
             s_sec.addItem(rs.getString("s_section"));
            // s_batch.addItem(rs.getString("s_shift"));
             }
               pst = con.prepareStatement(sql3);
             rs = pst.executeQuery();
                while(rs.next()){
             
             
             s_batch.addItem(rs.getString("s_shift"));
             }
                
                 pst = con.prepareStatement(sql4);
             rs = pst.executeQuery();
                while(rs.next()){
             
             
             crs_code.addItem(rs.getString("s_crs_code"));
             }

         } catch (SQLException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        s_dept = new javax.swing.JComboBox<>();
        s_intake = new javax.swing.JComboBox<>();
        s_sec = new javax.swing.JComboBox<>();
        s_batch = new javax.swing.JComboBox<>();
        s_srch_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atn_tbl = new javax.swing.JTable();
        btn_present = new javax.swing.JButton();
        btn_absnt = new javax.swing.JButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        crs_code = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("Student Attendance Sheet");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        s_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_deptActionPerformed(evt);
            }
        });

        s_srch_btn.setText("Search");
        s_srch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_srch_btnActionPerformed(evt);
            }
        });

        atn_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Boolean(false), null, null, null}
            },
            new String [] {
                "1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(atn_tbl);
        if (atn_tbl.getColumnModel().getColumnCount() > 0) {
            atn_tbl.getColumnModel().getColumn(0).setPreferredWidth(20);
            atn_tbl.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        btn_present.setText("Present");
        btn_present.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_presentActionPerformed(evt);
            }
        });

        btn_absnt.setText("Absent");
        btn_absnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_absntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_absnt)
                .addGap(77, 77, 77)
                .addComponent(btn_present)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_present)
                    .addComponent(btn_absnt))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        txtDate.setDateFormatString("yyyy-MM-dd");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(s_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(s_intake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(s_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(s_batch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(crs_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(s_srch_btn)
                        .addGap(65, 65, 65)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jButton1)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(929, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(97, 97, 97)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(s_intake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s_batch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s_srch_btn)
                        .addComponent(s_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crs_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jButton2)
                    .addContainerGap(457, Short.MAX_VALUE)))
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

    private void s_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_deptActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_s_deptActionPerformed

    
    private void s_srch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_srch_btnActionPerformed
              String dept = s_dept.getSelectedItem().toString();
              String intake = s_intake.getSelectedItem().toString();
              String section = s_sec.getSelectedItem().toString();
              String batch = s_batch.getSelectedItem().toString();
              String course_code = crs_code.getSelectedItem().toString();
                




        try {
             // TODO add your handling code here:
             
             
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/student_attendance","root","");
             pst = con.prepareStatement("select * from student WHERE s_dept =? and s_intake=? and s_section = ? and s_shift = ?  and s_crs_code = ? ");
               pst.setString(1, dept);
                pst.setString(2, intake);
                pst.setString(3, section);
                 pst.setString(4, batch);
                 pst.setString(5, course_code);
                 

             rs = pst.executeQuery();
             atn_tbl.setModel(DbUtils.resultSetToTableModel(rs));
            
             
             
             

         } catch (ClassNotFoundException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         }
            
    }//GEN-LAST:event_s_srch_btnActionPerformed
 
    
    
    private void btn_presentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_presentActionPerformed
        // TODO add your handling code here:
         String dept = s_dept.getSelectedItem().toString();
          String intake = s_intake.getSelectedItem().toString();
          String section = s_sec.getSelectedItem().toString();
          String batch = s_batch.getSelectedItem().toString();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
           SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM", Locale.getDefault());
            String d = sdf.format(txtDate.getDate());
            String ym = sdf1.format(txtDate.getDate());
             
         int column = 0;
              int row = atn_tbl.getSelectedRow();
              String value = atn_tbl.getModel().getValueAt(row, column).toString();
              
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/student_attendance","root","");
             
               pst = con.prepareStatement("insert into attendane(student_id,student_dept,student_intake,student_section,student_batch,student_atndnce,attendance_date,mnth_atndns)values(?,?,?,?,?,?,?,?)");
               pst.setString(1, value);
                pst.setString(2, dept);
                pst.setString(3, intake);
                 pst.setString(4, section);
                 pst.setString(5, batch);
                  pst.setString(6, "Present");
                  pst.setString(7,d);
                   pst.setString(8,ym);
                  pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "done");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         }
            
           
        
        
    }//GEN-LAST:event_btn_presentActionPerformed

    private void btn_absntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_absntActionPerformed
        // TODO add your handling code here:btn_absnt
        
         String dept = s_dept.getSelectedItem().toString();
          String intake = s_intake.getSelectedItem().toString();
          String section = s_sec.getSelectedItem().toString();
          String batch = s_batch.getSelectedItem().toString();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String d = sdf.format(txtDate.getDate());
             
         int column = 0;
              int row = atn_tbl.getSelectedRow();
              String value = atn_tbl.getModel().getValueAt(row, column).toString();
              
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/student_attendance","root","");
             
               pst = con.prepareStatement("insert into attendane(student_id,student_dept,student_intake,student_section,student_batch,student_atndnce,attendance_date)values(?,?,?,?,?,?,?)");
               pst.setString(1, value);
                pst.setString(2, dept);
                pst.setString(3, intake);
                 pst.setString(4, section);
                 pst.setString(5, batch);
                  pst.setString(6, "Absent");
                  pst.setString(7,d);
                  pst.executeUpdate();
                //JOptionPane.showMessageDialog(null, "done");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_btn_absntActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main m_s = new main();
                this.hide();
                m_s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable atn_tbl;
    private javax.swing.JButton btn_absnt;
    private javax.swing.JButton btn_present;
    private javax.swing.JComboBox<String> crs_code;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> s_batch;
    private javax.swing.JComboBox<String> s_dept;
    private javax.swing.JComboBox<String> s_intake;
    private javax.swing.JComboBox<String> s_sec;
    private javax.swing.JButton s_srch_btn;
    private com.toedter.calendar.JDateChooser txtDate;
    // End of variables declaration//GEN-END:variables
}