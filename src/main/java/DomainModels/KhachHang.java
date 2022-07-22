/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "KhachHang")
public class KhachHang implements  Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaKhachHang;
    private String TenKHachHang;
    private int GioiTinh;
    private String Email;
    private String SDT;

    public KhachHang() {
    }

    public KhachHang(int MaKhachHang, String TenKHachHang, int GioiTinh, String Email, String SDT) {
        this.MaKhachHang = MaKhachHang;
        this.TenKHachHang = TenKHachHang;
        this.GioiTinh = GioiTinh;
        this.Email = Email;
        this.SDT = SDT;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKHachHang() {
        return TenKHachHang;
    }

    public void setTenKHachHang(String TenKHachHang) {
        this.TenKHachHang = TenKHachHang;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    
}
