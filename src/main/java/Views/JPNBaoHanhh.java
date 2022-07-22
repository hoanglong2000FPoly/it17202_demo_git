/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DomainModels.BaoHanh;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import DomainModels.SanPham;
import DomainModels.TheLoai;
import Services.BaoHanhService;
import Services.KhachHangService;
import Services.NhanVienService;
import Services.SanPhamService;
import ViewModel.BaoHanhMD;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author T460
 */
public class JPNBaoHanhh extends javax.swing.JPanel {

    /**
     * Creates new form JPNBaoHanhh
     */
     NhanVienService nhanVienService;
     BaoHanhService baoHanhService;
     KhachHangService khachHangService;
     SanPhamService sanPhamService;
    DefaultTableModel _deDefaultTableModel;
    public JPNBaoHanhh() {
        initComponents();
        nhanVienService = new NhanVienService();
        baoHanhService = new BaoHanhService();
        khachHangService = new KhachHangService();
        sanPhamService = new SanPhamService();
        _deDefaultTableModel = new DefaultTableModel();
        cbcTensp(sanPhamService.getList());
        cbcTennv(nhanVienService.getList());
        cbcTenKH(khachHangService.getList());
        loadTable(baoHanhService.getList());
        
    }
     public String nameSp(String ma){
        List<SanPham> _lisSanPhams = sanPhamService.getList();
        for (SanPham x : _lisSanPhams) {
            if (x.getMaSanPham().equals(ma)) {
                return x.getTenSanPham();
            }
        }
        return null;
     
    }
    public String iDSp(String name){
        List<SanPham> _lisSanPhams = sanPhamService.getList();
        for (SanPham x : _lisSanPhams) {
            if (x.getTenSanPham().equals(name)) {
                return x.getMaSanPham();
            }
        }
        return null;
     
    }
     public String nameKH(int ma){
        List<KhachHang> _listKhachHangs = khachHangService.getList();
        for (KhachHang x : _listKhachHangs) {
            if(x.getMaKhachHang() == ma){
                return x.getTenKHachHang();
            }
        }
        return null;
     
    }
    public int iDKH(String name){
        List<KhachHang> _listKhachHangs = khachHangService.getList();
        for (KhachHang x : _listKhachHangs) {
            if (x.getTenKHachHang().equals(name)) {
                return x.getMaKhachHang();
            }
        }
        return -1;
     
    }
       public String nameNV(String ma){
        List<NhanVien> _lNhanViens = nhanVienService.getList();
        for (NhanVien x : _lNhanViens) {
            if (x.getMaNhanVien().equals(ma)) {
                return x.getTenNhanVien();
            }
        }
        return null;
     
    }
    public String iDNv(String name){
        List<NhanVien> _list = nhanVienService.getList();
        for (NhanVien x : _list) {
            if (x.getTenNhanVien().equals(name)) {
                return x.getMaNhanVien();
            }
        }
        return null;
     
    }
    BaoHanhMD guiData(){
        Date date1 = null;
        TheLoai theLoai = new TheLoai();
        SanPham sanpham = new SanPham(String.valueOf(cbc_tensanpham.getSelectedItem()), "", 1, date1, "", 1, 1, 1, "", "", "", theLoai);
         KhachHang kh = new KhachHang(Integer.parseInt(String.valueOf(cbc_tenkhachhang.getSelectedItem())), "", 1, "", "");
         NhanVien nv = new NhanVien(String.valueOf(cbc_tenNhanvien.getSelectedItem()), "", "", date1, 1, "", "", "", 1);
         return new BaoHanhMD(txt_mabaohanh.getText(), date.getDate(), txt_mota.getText(), sanpham, kh, nv);
    }  
   
    
    public void loadTable(List<BaoHanh> _list){
        _deDefaultTableModel = (DefaultTableModel) tbl_baohanh.getModel();
        _deDefaultTableModel.setRowCount(0);
        for (BaoHanh x : _list) {  
         //   _deDefaultTableModel.addRow(new Object[]{x.getMaBaoHanh(),x.getNgayMua(),x.getMoTa(),nameSp(x.getMaSanPham().getMaSanPham()),nameKH(x.getMaKhachHang().getMaKhachHang()),nameNV(x.getMaNhanVien().getMaNhanVien())});
        _deDefaultTableModel.addRow(new Object[]{x.getMaBaoHanh(),x.getNgayMua(),x.getMoTa(),x.getMaSanPham().getMaSanPham(),x.getMaKhachHang().getMaKhachHang(),x.getMaNhanVien().getMaNhanVien()});
        }
    }
    void cbcTensp(List<SanPham> sp){
        DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
        for (SanPham x : sp) {
        //   boxModel.addElement(nameSp(x.getMaSanPham()));
        boxModel.addElement(x.getMaSanPham());
        }
        cbc_tensanpham.setModel(boxModel);
    }
    
    void cbcTennv(List<NhanVien> nv){
        DefaultComboBoxModel boxModel1 = new DefaultComboBoxModel();
        for (NhanVien x : nv) {
         //  boxModel1.addElement(nameNV(x.getMaNhanVien()));
         boxModel1.addElement(x.getMaNhanVien());
        }
        cbc_tenNhanvien.setModel(boxModel1);
    }
    void cbcTenKH(List<KhachHang> kh){
        DefaultComboBoxModel boxModel2 = new DefaultComboBoxModel();
        for (KhachHang x : kh) {
           boxModel2.addElement(x.getMaKhachHang());
        }
        cbc_tenkhachhang.setModel(boxModel2);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_baohanh = new javax.swing.JTable();
        txt_timkiem = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_mabaohanh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbc_tensanpham = new javax.swing.JComboBox<>();
        cbc_tenkhachhang = new javax.swing.JComboBox<>();
        cbc_tenNhanvien = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        tbl_baohanh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Bảo Hành", "Ngày Mua", "Mô Tả", "Tên Sản Phẩm", "Tên Khách Hàng", "Tên Nhân Viên"
            }
        ));
        tbl_baohanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_baohanhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_baohanh);

        btn_timkiem.setText("Tìm Kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_timkiem)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("Danh Sách", jPanel2);

        txt_mabaohanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mabaohanhActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã Bảo Hành ");

        jLabel2.setText("Ngày Mua");

        jLabel3.setText("Mô Tả");

        txt_mota.setColumns(20);
        txt_mota.setRows(5);
        jScrollPane1.setViewportView(txt_mota);

        jLabel4.setText("Mã Sản Phẩm");

        jLabel5.setText("Mã Khách Hàng");

        jLabel6.setText("Mã Nhân Vên");

        cbc_tensanpham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbc_tenkhachhang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbc_tenNhanvien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/add.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/delete.png"))); // NOI18N
        jButton2.setText("Vô Hiệu Hóa");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/edit.png"))); // NOI18N
        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/clear.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_mabaohanh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbc_tensanpham, 0, 139, Short.MAX_VALUE)
                                    .addComponent(cbc_tenkhachhang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbc_tenNhanvien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(46, 46, 46)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_mabaohanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbc_tensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbc_tenkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbc_tenNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("Cập Nhật", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mabaohanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mabaohanhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mabaohanhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     JOptionPane.showConfirmDialog(this, baoHanhService.add(guiData()));
        loadTable(baoHanhService.getList());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showConfirmDialog(this, baoHanhService.edit(guiData()));
        loadTable(baoHanhService.getList());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbl_baohanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_baohanhMouseClicked
       int index = tbl_baohanh.getSelectedRow();
       BaoHanh bh = (BaoHanh) baoHanhService.getList().get(index);
       txt_mabaohanh.setText(bh.getMaBaoHanh());
       txt_mota.setText(bh.getMoTa());
       cbc_tenNhanvien.setSelectedItem(bh.getMaNhanVien());
       cbc_tenkhachhang.setSelectedItem(bh.getMaKhachHang());
       cbc_tensanpham.setSelectedItem(bh.getMaSanPham());
       date.setDate(bh.getNgayMua());
    }//GEN-LAST:event_tbl_baohanhMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       txt_mabaohanh.setText("");
       txt_mota.setText("");
       cbc_tenNhanvien.setSelectedIndex(0);
       cbc_tenkhachhang.setSelectedIndex(0);
       cbc_tensanpham.setSelectedIndex(0);
       date.setDate(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        loadTable(baoHanhService.timkiem(txt_timkiem.getText()));
    }//GEN-LAST:event_btn_timkiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JComboBox<String> cbc_tenNhanvien;
    private javax.swing.JComboBox<String> cbc_tenkhachhang;
    private javax.swing.JComboBox<String> cbc_tensanpham;
    private com.toedter.calendar.JDateChooser date;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_baohanh;
    private javax.swing.JTextField txt_mabaohanh;
    private javax.swing.JTextArea txt_mota;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
