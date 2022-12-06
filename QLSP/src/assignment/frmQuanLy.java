package assignment;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class frmQuanLy extends javax.swing.JFrame {

    /**
     * Creates new form frmQuanLy
     */
    public frmQuanLy() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBangSanPham = new javax.swing.JButton();
        btnBangLoaiSanPham = new javax.swing.JButton();
        btnBangNhanVien = new javax.swing.JButton();
        btnQuanLyQuyen = new javax.swing.JButton();
        btnQuanLyNguoiDung = new javax.swing.JButton();
        lblThongBao = new javax.swing.JLabel();
        lblLuotDangNhap = new javax.swing.JLabel();
        lblHienThiUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mnuCaiDat = new javax.swing.JMenu();
        mnuDangXuat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/hethong.png"))); // NOI18N
        jLabel1.setText("Hệ Thống Quản Lý");

        btnBangSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/sanpham.png"))); // NOI18N
        btnBangSanPham.setText("Quản Lý Sản Phẩm");
        btnBangSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangSanPhamActionPerformed(evt);
            }
        });

        btnBangLoaiSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/lisloaisanpham.png"))); // NOI18N
        btnBangLoaiSanPham.setText("Quản Lý Loại Sản Phẩm");
        btnBangLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangLoaiSanPhamActionPerformed(evt);
            }
        });

        btnBangNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/nhanvien.png"))); // NOI18N
        btnBangNhanVien.setText("Quản Lý Nhân Viên");
        btnBangNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangNhanVienActionPerformed(evt);
            }
        });

        btnQuanLyQuyen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Users-icon.png"))); // NOI18N
        btnQuanLyQuyen.setText("Quản Lý Quyền Sử Dụng");
        btnQuanLyQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyQuyenActionPerformed(evt);
            }
        });

        btnQuanLyNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/users-mixed-gender-icon.png"))); // NOI18N
        btnQuanLyNguoiDung.setText("Quản Lý Người Dùng");
        btnQuanLyNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNguoiDungActionPerformed(evt);
            }
        });

        lblThongBao.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));
        lblThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/thongbao.png"))); // NOI18N

        lblLuotDangNhap.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));
        lblLuotDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/pencil-red-icon.png"))); // NOI18N

        lblHienThiUser.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));
        lblHienThiUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Users-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBangSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(btnQuanLyNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBangLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuanLyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnBangNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(lblLuotDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHienThiUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBangSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBangLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBangNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblThongBao)
                .addGap(18, 18, 18)
                .addComponent(lblLuotDangNhap)
                .addGap(18, 18, 18)
                .addComponent(lblHienThiUser)
                .addGap(32, 32, 32))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), null, new java.awt.Color(102, 0, 0), new java.awt.Color(204, 204, 0)));

        mnuHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/hethongsys.png"))); // NOI18N
        mnuHeThong.setText("Hệ Thống");
        mnuHeThong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuHeThongMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuHeThong);

        mnuCaiDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/caidat.png"))); // NOI18N
        mnuCaiDat.setText("Cài Đặt");
        jMenuBar1.add(mnuCaiDat);

        mnuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/dangxuat.png"))); // NOI18N
        mnuDangXuat.setText("Đăng Xuất");
        mnuDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuDangXuatMouseClicked(evt);
            }
        });
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuDangXuat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void btnBangSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangSanPhamActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        frmSanPham frmSP = new frmSanPham();
        frmSP.show();
    }//GEN-LAST:event_btnBangSanPhamActionPerformed

    private void btnBangLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        frmLoaiSanPham frmLSP = new frmLoaiSanPham();
        frmLSP.show();
    }//GEN-LAST:event_btnBangLoaiSanPhamActionPerformed

    private void btnBangNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangNhanVienActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        frmNhanVien frmNV = new frmNhanVien();
        frmNV.show();
    }//GEN-LAST:event_btnBangNhanVienActionPerformed

    private void btnQuanLyNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNguoiDungActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        frmNguoiDung frmnd = new frmNguoiDung();
        frmnd.show();
    }//GEN-LAST:event_btnQuanLyNguoiDungActionPerformed

    private void btnQuanLyQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyQuyenActionPerformed
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        frmQuyen frmQ = new frmQuyen();
        frmQ.show();
    }//GEN-LAST:event_btnQuanLyQuyenActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDangXuatMouseClicked
        // TODO add your handling code here:
        confirm();
        
    }//GEN-LAST:event_mnuDangXuatMouseClicked

    private void mnuHeThongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuHeThongMouseClicked
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        frmQuanLy frmql = new frmQuanLy();
        frmql.show();
        this.dispose();
    }//GEN-LAST:event_mnuHeThongMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Main.playSound("soundbutton.wav");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn thoát chương trình không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
            Main.playSound("soundbutton.wav");
            System.exit(0);
        }
        else{
            Main.playSound("soundbutton.wav");
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        lblHienThiUser.setText("Đăng nhập bằng tài khoản:  " + Main.hienThiTenNguoiDung);
        lblLuotDangNhap.setText("Lượt đăng nhập:  " +Main.LuotDangNhap);
        
        if(frmDangNhap.Quyen == 1){
            lblThongBao.setText("Bạn vừa đăng nhập bằng quyền ADMIN");
        }
        else if(frmDangNhap.Quyen == 2){
            lblThongBao.setText("Bạn vừa đăng nhập bằng quyền IT");
            btnQuanLyNguoiDung.setEnabled(false);
            btnQuanLyQuyen.setEnabled(false);
        }
        else if(frmDangNhap.Quyen == 3){
            lblThongBao.setText("Bạn vừa đăng nhập bằng quyền Nhân Viên");
            btnBangNhanVien.setEnabled(false);
            btnQuanLyNguoiDung.setEnabled(false);
            btnQuanLyQuyen.setEnabled(false);
            btnBangLoaiSanPham.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened
    public void confirm(){
        Main.playSound("soundbutton.wav");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn đăng xuất không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
            Main.playSound("soundbutton.wav");
            frmDangNhap frmdn = new frmDangNhap();
            frmdn.show();
            this.dispose();
        }
        else{
            Main.playSound("soundbutton.wav");
        }
    }

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
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangLoaiSanPham;
    private javax.swing.JButton btnBangNhanVien;
    private javax.swing.JButton btnBangSanPham;
    private javax.swing.JButton btnQuanLyNguoiDung;
    private javax.swing.JButton btnQuanLyQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHienThiUser;
    private javax.swing.JLabel lblLuotDangNhap;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JMenu mnuCaiDat;
    private javax.swing.JMenu mnuDangXuat;
    private javax.swing.JMenu mnuHeThong;
    // End of variables declaration//GEN-END:variables
}
