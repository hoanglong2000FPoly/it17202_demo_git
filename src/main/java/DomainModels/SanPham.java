/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "SanPham")
public class SanPham implements Serializable {

    @Id
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private Date NamSanXuat;
    private String HangSanXuat;
    private float GiaNhap;
    private float GiaBan;
    private float DungTich;
    private String CongSuat;
    private String Pin;
    private String MoTa;
    @ManyToOne
    @JoinColumn(name = "MaTheLoai")
    private TheLoai MaTheLoai;

    public SanPham() {
    }

    public SanPham(String MaSanPham, String TenSanPham, int SoLuong, Date NamSanXuat, String HangSanXuat, float GiaNhap, float GiaBan, float DungTich, String CongSuat, String Pin, String MoTa, TheLoai MaTheLoai) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.NamSanXuat = NamSanXuat;
        this.HangSanXuat = HangSanXuat;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.DungTich = DungTich;
        this.CongSuat = CongSuat;
        this.Pin = Pin;
        this.MoTa = MoTa;
        this.MaTheLoai = MaTheLoai;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Date getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(Date NamSanXuat) {
        this.NamSanXuat = NamSanXuat;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String HangSanXuat) {
        this.HangSanXuat = HangSanXuat;
    }

    public float getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(float GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public float getDungTich() {
        return DungTich;
    }

    public void setDungTich(float DungTich) {
        this.DungTich = DungTich;
    }

    public String getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(String CongSuat) {
        this.CongSuat = CongSuat;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public TheLoai getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(TheLoai MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

}
