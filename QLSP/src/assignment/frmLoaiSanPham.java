package assignment;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class frmLoaiSanPham extends javax.swing.JFrame {

    /**
     * Creates new form frmLoaiSanPham
     */
    public frmLoaiSanPham() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlform = new javax.swing.JPanel();
        lblTTLSP = new javax.swing.JLabel();
        lblMaLoaiSP = new javax.swing.JLabel();
        txtMaLoaiSP = new javax.swing.JTextField();
        lblTenLoai = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        lblMoTa = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlform.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTTLSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTTLSP.setForeground(java.awt.SystemColor.activeCaption);
        lblTTLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/sanpham.png"))); // NOI18N
        lblTTLSP.setText("THÔNG TIN LOẠI SẢN PHẨM");

        lblMaLoaiSP.setText("Mã Loại Sản Phẩm");

        txtMaLoaiSP.setEditable(false);

        lblTenLoai.setText("Tên Loại");

        lblMoTa.setText("Mô Tả");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Button-Add-icon.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Delete-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/pencil-red-icon.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/refresh-icon.png"))); // NOI18N
        btnTaoMoi.setText("Tạo Mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/timkiem.png"))); // NOI18N
        lblTimKiem.setText("Search: ");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlformLayout = new javax.swing.GroupLayout(pnlform);
        pnlform.setLayout(pnlformLayout);
        pnlformLayout.setHorizontalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addComponent(lblMaLoaiSP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlformLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTenLoai)
                                .addGap(72, 72, 72)
                                .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addComponent(lblMoTa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaoMoi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlformLayout.createSequentialGroup()
                .addComponent(lblTTLSP)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlformLayout.setVerticalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addComponent(lblTTLSP)
                .addGap(8, 8, 8)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaLoaiSP))
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenLoai)
                            .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMoTa)
                            .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnXoa))
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnTaoMoi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblLoaiSanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblLoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Loại Sản Phẩm", "Tên Loại", "Mô Tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiSanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LayDuLieu(){
        String SQL = "select * from LoaiSanPham";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[] {"STT","Mã Loại Sản Phẩm","Tên Loại","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblLoaiSanPham.setModel(tableModel);
        try {
            while(rs.next()){
                Object[] item = new Object[4];
                item[0] = tblLoaiSanPham.getRowCount() + 1;
                item[1] = rs.getInt("MaLoaiSP");
                item[2] = rs.getString("TenLoai");
                item[3] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
    }//GEN-LAST:event_formWindowOpened

    private void tblLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSanPhamMouseClicked
        // tao jtable de hien thi 
        Main.playSound("soundbutton.wav");
        int index = tblLoaiSanPham.getSelectedRow();
        txtMaLoaiSP.setText(tblLoaiSanPham.getValueAt(index, 1).toString());
        txtTenLoai.setText(tblLoaiSanPham.getValueAt(index, 2).toString());
        txtMoTa.setText(tblLoaiSanPham.getValueAt(index, 3).toString());
    }//GEN-LAST:event_tblLoaiSanPhamMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        String tenLoai,moTa;
        tenLoai = txtTenLoai.getText();
        moTa = txtMoTa.getText();
        String SQL = "insert into LoaiSanPham(TenLoai,MoTa)"
                + " values(N'"+tenLoai+"',N'"+moTa+"')";        
        if("".equals(tenLoai) && "".equals(moTa)){
            Main.thongBao("Chưa nhập đầy đủ dữ liệu","Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        int[] index = tblLoaiSanPham.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String maLoaiCanXoa = tblLoaiSanPham.getValueAt(index[i], 1).toString();
            String SQL = "delete from LoaiSanPham where MaLoaiSP = "+maLoaiCanXoa+"";
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        String tenLoai,moTa,maLoai;
        tenLoai = txtTenLoai.getText();
        moTa = txtMoTa.getText();
        maLoai = txtMaLoaiSP.getText();
        String SQL = "update LoaiSanPham set TenLoai = N'"+tenLoai+"',"
                + " MoTa = N'"+moTa+"' where MaLoaiSP = "+maLoai;
        if("".equals(tenLoai) && "".equals(moTa) && "".equals(maLoai)){
            Main.thongBao("Bạn chưa nhập đầy đủ dữ liệu","Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        txtMaLoaiSP.setText("");
        txtTenLoai.setText("");
        txtMoTa.setText("");
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        Main.playSound("soundkeyboard.wav");
        String tuKhoaCanTim = txtTimKiem.getText();
        String SQL = "select * from LoaiSanPham where"
                + " TenLoai like N'%"+tuKhoaCanTim+"%' or MoTa like N'%"+tuKhoaCanTim+"%'";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[] {"STT","Mã Loại","Tên Loại","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblLoaiSanPham.setModel(tableModel);
        try {
            while(rs.next()){
                Object[] item = new Object[4];
                item[0] = tblLoaiSanPham.getRowCount() + 1;
                item[1] = rs.getInt("MaLoaiSP");
                item[2] = rs.getString("TenLoai");
                item[3] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

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
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLoaiSanPham().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaLoaiSP;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblTTLSP;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlform;
    private javax.swing.JTable tblLoaiSanPham;
    private javax.swing.JTextField txtMaLoaiSP;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenLoai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
