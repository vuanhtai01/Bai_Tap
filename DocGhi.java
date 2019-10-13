import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DocGhi extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public DocGhi() {
        initComponents();
    }



    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private File fileRoot;

    /**
     *
     */



    public void Doc() 
    {
        JFileChooser fc;
        FileReader fr = null;
        BufferedReader br = null;
        String s;
        try {
            fc = new JFileChooser();
            int openDialog = fc.showOpenDialog(null);
            if (openDialog == JFileChooser.APPROVE_OPTION) 
            {
                String path = fc.getSelectedFile().getAbsolutePath();
                jTextField1.setText(path);
                fr = new FileReader(path);
                br = new BufferedReader(fr);
                while ((s = br.readLine()) != null) 
                {
                    jTextArea1.append(s + "\n");
                }
            }
            br.close();
            fr.close();
        } catch (Exception e2) {
            // TODO: handle exception
            System.out.println("Error" + e2.getMessage());
        }
    }

    public void LuuLai() 
    {
        JFileChooser fc;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fc = new JFileChooser();
            //int openDialog = fc.showOpenDialog(null);//hien thi hop thoại
            if( jTextField1.getText().toString().trim().length() > 0 && jTextArea1.getText().toString().length() > 0)
            {
                fw = new FileWriter(jTextField1.getText().toString().trim());
                bw = new BufferedWriter(fw);
                bw.write(jTextArea1.getText());
                bw.flush();
                JOptionPane.showMessageDialog(null, "Lưu File Thành công");
            }
            else//trung hop khong có duong dan truóc hoạc k có dữ liệu
            {
                System.err.println( jTextArea1.getText().toString().length() );
                if( jTextArea1.getText().toString().length() <= 0 )
                   JOptionPane.showMessageDialog(null, "Lui Lòng nhập dữ liệu");
                else
                    if ( jTextField1.getText().toString().trim().length() <= 1 ) 
                       LuuMoi();
            }
            bw.close();
            fw.close();
        } 
        catch (Exception e2) 
        {
            // TODO: handle exception
            System.out.println("Error" + e2.getMessage());
        }

    }
    public void LuuMoi()
    {
        JFileChooser chooser;
        String Name = JOptionPane.showInputDialog ("Nhập Tên file");
        if( Name.length()>0 )
        {
            chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) 
            { 
                //System.out.println("Thu muc: " +  chooser.getCurrentDirectory());
                //System.out.println("ten file : " +  chooser.getSelectedFile());
                jTextField1.setText(chooser.getSelectedFile()+"\\"+Name+".txt");
                FileWriter fw = null;
                BufferedWriter bw = null;
                try 
                {
                    fw = new FileWriter(jTextField1.getText().toString().trim());
                    bw = new BufferedWriter(fw);
                    bw.write(jTextArea1.getText());
                    bw.flush();
                    JOptionPane.showMessageDialog(null, "Lưu File Thành công");
                } 
                catch (Exception e) 
                {
                }
            }
        }
        else 
            JOptionPane.showMessageDialog(null, "tên Không đươc đẻ trống");  


    }
    public void LamMoi(String DuongDan)
    {
        FileReader fr = null;
        BufferedReader br = null;
        String s;
        try 
        {
            if (DuongDan.length() > 0) 
            {
                jTextArea1.setText("");
                fr = new FileReader(DuongDan);
                br = new BufferedReader(fr);
                while ((s = br.readLine()) != null) 
                {
                    jTextArea1.append(s + "\n");
                }
            }
            br.close();
            fr.close();
        } catch (Exception e2) {
            // TODO: handle exception
            System.out.println("Error" + e2.getMessage());
        }
    }



    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        MoBT = new javax.swing.JButton();
        LuuBT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        XoaBT = new javax.swing.JButton();
        ThoatBT = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jTextArea1.setBackground(new java.awt.Color(204, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        MoBT.setText("Mở File");
        MoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoBTActionPerformed(evt);
            }
        });

        LuuBT.setText("Lưu");
        LuuBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuBTActionPerformed(evt);
            }
        });

        jButton3.setText("Luu với");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        XoaBT.setText("Xóa File");
        XoaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaBTActionPerformed(evt);
            }
        });

        ThoatBT.setText("Thoát");
        ThoatBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatBTActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LuuBT, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(XoaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ThoatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoBT)
                    .addComponent(jButton3)
                    .addComponent(XoaBT)
                    .addComponent(ThoatBT)
                    .addComponent(LuuBT))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XoaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBTActionPerformed
        // TODO add your handling code here:
        File file = new File(jTextField1.getText().toString().trim());
//          kiem tra nếu file tồn tại thì xóa
        if (file.exists()) 
        {   
            int returnValue = 0;
            returnValue = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa", "Bang chắc chứ?", JOptionPane.YES_NO_OPTION);

            if (returnValue == JOptionPane.YES_OPTION)
            {
                file.delete();
                JOptionPane.showMessageDialog(null, "Xóa fle thành công");
                jTextField1.setText("");
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Vui Lòng chọn đường dẫn");
            JFileChooser fc;
            fc = new JFileChooser();
            int openDialog = fc.showOpenDialog(null);
            if (openDialog == JFileChooser.APPROVE_OPTION) 
            {
                String path = fc.getSelectedFile().getAbsolutePath();
                jTextField1.setText(path);
                XoaBTActionPerformed(evt);
            }
        }

    }//GEN-LAST:event_XoaBTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LuuMoi();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LuuBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuBTActionPerformed
        // TODO add your handling code here:
        LuuLai();
    }//GEN-LAST:event_LuuBTActionPerformed

    private void MoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoBTActionPerformed
        // TODO add your handling code here:
        Doc();
    }//GEN-LAST:event_MoBTActionPerformed

    private void ThoatBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatBTActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ThoatBTActionPerformed

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
            java.util.logging.Logger.getLogger(DocGhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocGhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocGhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocGhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocGhi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LuuBT;
    private javax.swing.JButton MoBT;
    private javax.swing.JButton ThoatBT;
    private javax.swing.JButton XoaBT;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}