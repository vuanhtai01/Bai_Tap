import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ThuVien extends javax.swing.JFrame 
{

    public ThuVien() 
    {
        initComponents();
        
        //load 
        Load();
       // LoadCB();
        //LoadDL();
        
    }
       
    java.sql.Connection conn;
    Statement truyvan;
    ResultSet rs;
     String S;
    
    public  void Load()
	{
            try
	    {   
		conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KAQ9C8I:1433; databaseName =THUVIEN","sa","sa");
		truyvan = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		if (conn != null) 
		{
		  System.out.println("KẾT NỐI THÀNH CÔNG ");
                  //this.dispose();
		} 
		          
            }
            catch (SQLException e)
            {
                System.err.println("KẾT NỐI THẤT BẠI");   
                this.dispose();
             
            }
	}
    public void LoadCB()
    {
        try
	{
					
            rs= truyvan.executeQuery("Select NgonNgu from NgonNgu");
            while (rs.next())
            { 					
            NgonNguCB.addItem(rs.getString(1));		            
            }
	}
	catch(SQLException ex)
	{       	
	}
        //xong
        //S="Lào";
        //NgonNguCB.setSelectedItem(""+S+"");
        //end
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ThmBT = new javax.swing.JButton();
        LuuBT = new javax.swing.JButton();
        ThoatBT = new javax.swing.JButton();
        MaSachT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        NgonNguCB = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THƯ VIỆN");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THƯ VIỆN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã Sách");

        ThmBT.setText("THÊM");
        ThmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThmBTActionPerformed(evt);
            }
        });

        LuuBT.setText("LƯU");
        LuuBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuBTActionPerformed(evt);
            }
        });

        ThoatBT.setBackground(new java.awt.Color(255, 0, 0));
        ThoatBT.setText("THOÁT");
        ThoatBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatBTActionPerformed(evt);
            }
        });

        MaSachT.setBackground(new java.awt.Color(0, 255, 153));
        MaSachT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MaSachT.setForeground(new java.awt.Color(204, 51, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên Sách");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Giá");

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1000));
        jSpinner1.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ngôn  Ngữ");

        NgonNguCB.setBackground(new java.awt.Color(255, 255, 102));
        NgonNguCB.setEditable(true);
        NgonNguCB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NgonNguCB.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MaSachT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ThmBT, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LuuBT, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ThoatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NgonNguCB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaSachT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgonNguCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LuuBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThoatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThmBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadDL()
    {
         S="Lào";
        try
        {
            rs=truyvan.executeQuery("SELECT TOP 1  * FROM Sach");
            rs.next();
            if(rs.getString(1).trim().length()>0)
		MaSachT.setText(rs.getString(1).trim());
            if(rs.getString(2).trim().length()>0)
		jTextField2.setText(rs.getString(2).trim());
            if(rs.getString(3).trim().length()>0)
               S=rs.getString(3).trim();
            jSpinner1.setValue(( Integer.parseInt(S) ));
            if(rs.getString(4).trim().length()>0)
               S=rs.getString(4).trim();
            NgonNguCB.setSelectedItem(""+S+"");		  
        }
        catch (SQLException ex)
        {
	System.out.println("Lỗi :\t"+ex);
        }
    }
    private void ThmBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThmBTActionPerformed
        
        S=NgonNguCB.getSelectedItem().toString();
        try        
        {
            PreparedStatement ps=conn.prepareStatement("insert into Sach (MaSach, TenSach, Gia, NgonNgu) values(?,?,?,?)");
            ps.setString(1, MaSachT.getText());
            ps.setString(2, jTextField2.getText());
            ps.setInt(3,Integer.parseInt(jSpinner1.getValue().toString()));
            ps.setString(4,S);
            ps.executeUpdate();
            System.out.print("thanh cong");
		  
	}
        catch(SQLException ex)
        {
            System.out.print("Loi :\n"+ex);
        }
        
    }//GEN-LAST:event_ThmBTActionPerformed

    
    private void ThoatBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatBTActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ThoatBTActionPerformed

    private void LuuBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuBTActionPerformed
        // TODO add your handling code here:
        //nút sửa
        //jSpinner1.setValue(10000);
        
    }//GEN-LAST:event_LuuBTActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ThuVien().setVisible(true);
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LuuBT;
    private javax.swing.JTextField MaSachT;
    private javax.swing.JComboBox<String> NgonNguCB;
    private javax.swing.JButton ThmBT;
    private javax.swing.JButton ThoatBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}