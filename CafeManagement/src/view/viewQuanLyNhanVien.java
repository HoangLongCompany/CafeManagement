/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author BaoLong
 */
public class viewQuanLyNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form viewQuanLyNhanVien
     */
    public viewQuanLyNhanVien() {
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

        jPanel1 = new javax.swing.JPanel();
        pn = new javax.swing.JPanel();
        pn1 = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        btThemNV = new javax.swing.JButton();
        btSuaNV = new javax.swing.JButton();
        btXoaNV = new javax.swing.JButton();
        pn2 = new javax.swing.JPanel();
        pnTimKiem = new javax.swing.JPanel();
        lbChucVu = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        tfHoTen = new javax.swing.JTextField();
        btTimKiem = new javax.swing.JButton();
        cbbChucVu = new javax.swing.JComboBox<>();
        pnThongTin = new javax.swing.JPanel();
        lbMaNhanVien = new javax.swing.JLabel();
        lbHoTen2 = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        lbCMND = new javax.swing.JLabel();
        lbDiaChi = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JLabel();
        lbChucVu2 = new javax.swing.JLabel();
        lbCaLamViec = new javax.swing.JLabel();
        tfMaNhanVien = new javax.swing.JTextField();
        tfHoTen2 = new javax.swing.JTextField();
        tfNgaySinh = new javax.swing.JTextField();
        tfGioiTinh = new javax.swing.JTextField();
        tfCMND = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        tfSoDienThoai = new javax.swing.JTextField();
        tfChucVu = new javax.swing.JTextField();
        tfCaLamViec = new javax.swing.JTextField();
        pn3 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CafeManagement_Quản lý nhân viên");

        pn.setBackground(new java.awt.Color(255, 255, 255));

        pn1.setBackground(new java.awt.Color(204, 204, 255));

        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        btThemNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btThemNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1488801680_Plus__Orange.png"))); // NOI18N
        btThemNV.setText("Thêm Nhân Viên");
        btThemNV.setFocusable(false);
        btThemNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btThemNV);

        btSuaNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSuaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1488802703_edit.png"))); // NOI18N
        btSuaNV.setText("Sửa Nhân Viên");
        btSuaNV.setFocusable(false);
        btSuaNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btSuaNV);

        btXoaNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btXoaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1488802717_DeleteRed.png"))); // NOI18N
        btXoaNV.setText("Xóa Nhân Viên");
        btXoaNV.setFocusable(false);
        btXoaNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btXoaNV);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn2.setBackground(new java.awt.Color(255, 255, 255));

        pnTimKiem.setBackground(new java.awt.Color(153, 153, 255));

        lbChucVu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbChucVu.setText("Chức Vụ");

        lbHoTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbHoTen.setText("Họ Tên");

        btTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1488818508_system-search.png"))); // NOI18N
        btTimKiem.setText("Tìm kiếm");

        cbbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHoTen)
                            .addComponent(lbChucVu))
                        .addGap(26, 26, 26)
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHoTen)
                            .addComponent(cbbChucVu, 0, 151, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTimKiemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btTimKiem)))
                .addContainerGap())
        );
        pnTimKiemLayout.setVerticalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbChucVu)
                    .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoTen)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btTimKiem)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnThongTin.setBackground(new java.awt.Color(204, 204, 255));

        lbMaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbMaNhanVien.setText("Mã Nhân Viên");

        lbHoTen2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbHoTen2.setText("Họ Tên");

        lbNgaySinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNgaySinh.setText("Ngày Sinh");

        lbGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbGioiTinh.setText("Giới Tính");

        lbCMND.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbCMND.setText("Số CMND");

        lbDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbDiaChi.setText("Địa Chỉ");

        lbSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbSoDienThoai.setText("Số Điện Thoại");

        lbChucVu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbChucVu2.setText("Chức Vụ");

        lbCaLamViec.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbCaLamViec.setText("Ca Làm Việc");

        javax.swing.GroupLayout pnThongTinLayout = new javax.swing.GroupLayout(pnThongTin);
        pnThongTin.setLayout(pnThongTinLayout);
        pnThongTinLayout.setHorizontalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaNhanVien)
                    .addComponent(lbHoTen2)
                    .addComponent(lbNgaySinh)
                    .addComponent(lbGioiTinh)
                    .addComponent(lbCMND)
                    .addComponent(lbDiaChi)
                    .addComponent(lbSoDienThoai)
                    .addComponent(lbChucVu2)
                    .addComponent(lbCaLamViec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMaNhanVien)
                    .addComponent(tfHoTen2)
                    .addComponent(tfNgaySinh)
                    .addComponent(tfGioiTinh)
                    .addComponent(tfCMND)
                    .addComponent(tfDiaChi)
                    .addComponent(tfSoDienThoai)
                    .addComponent(tfChucVu)
                    .addComponent(tfCaLamViec))
                .addContainerGap())
        );
        pnThongTinLayout.setVerticalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNhanVien)
                    .addComponent(tfMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoTen2)
                    .addComponent(tfHoTen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgaySinh)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh)
                    .addComponent(tfGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCMND)
                    .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiaChi)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoDienThoai)
                    .addComponent(tfSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbChucVu2)
                    .addComponent(tfChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCaLamViec)
                    .addComponent(tfCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addComponent(pnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPane.setViewportView(tbNhanVien);

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane)
        );

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnLayout.createSequentialGroup()
                .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(viewQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewQuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSuaNV;
    private javax.swing.JButton btThemNV;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoaNV;
    private javax.swing.JComboBox<String> cbbChucVu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCMND;
    private javax.swing.JLabel lbCaLamViec;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lbChucVu2;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbHoTen2;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSoDienThoai;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfCaLamViec;
    private javax.swing.JTextField tfChucVu;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfGioiTinh;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfHoTen2;
    private javax.swing.JTextField tfMaNhanVien;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfSoDienThoai;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
