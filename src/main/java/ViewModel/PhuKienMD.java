/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModels.SanPham;

/**
 *
 * @author admin
 */
public class PhuKienMD {

    private String MaPhuKien;
    private String TenPhuKien;
    private int SoLuong;
    private float GiaNhap;
    private float GiaBan;
    private String DienTro;
    private SanPham MaSanPham;

    public PhuKienMD() {
    }

    public PhuKienMD(String MaPhuKien, String TenPhuKien, int SoLuong, float GiaNhap, float GiaBan, String DienTro, SanPham MaSanPham) {
        this.MaPhuKien = MaPhuKien;
        this.TenPhuKien = TenPhuKien;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.DienTro = DienTro;
        this.MaSanPham = MaSanPham;
    }

    public String getMaPhuKien() {
        return MaPhuKien;
    }

    public void setMaPhuKien(String MaPhuKien) {
        this.MaPhuKien = MaPhuKien;
    }

    public String getTenPhuKien() {
        return TenPhuKien;
    }

    public void setTenPhuKien(String TenPhuKien) {
        this.TenPhuKien = TenPhuKien;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
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

    public String getDienTro() {
        return DienTro;
    }

    public void setDienTro(String DienTro) {
        this.DienTro = DienTro;
    }

    public SanPham getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(SanPham MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

}
