/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.KhachHang;
import DomainModels.NhanVien;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class HoadonView {
     private String MaHoaDon;
    
    private Date NgayTao;
    
    private KhachHang MaKhachHang;
    
    private NhanVien MaNhanVien;

    public HoadonView() {
    }

    public HoadonView(String MaHoaDon, Date NgayTao, KhachHang MaKhachHang, NhanVien MaNhanVien) {
        this.MaHoaDon = MaHoaDon;
        this.NgayTao = NgayTao;
        this.MaKhachHang = MaKhachHang;
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public KhachHang getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(KhachHang MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public NhanVien getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(NhanVien MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }
    
}
