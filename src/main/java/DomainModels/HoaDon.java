/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HoaDon")
public class HoaDon implements  Serializable{
    @Id
    private String MaHoaDon;
    
    private Date NgayTao;
    
    @ManyToOne
    @JoinColumn(name = "MaKhachHang")
    private KhachHang MaKhachHang;
    
    @ManyToOne
    @JoinColumn(name = "MaNhanVien")
    private NhanVien MaNhanVien;

    public HoaDon() {
    }

    public HoaDon(String MaHoaDon, Date NgayTao, KhachHang MaKhachHang, NhanVien MaNhanVien) {
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
