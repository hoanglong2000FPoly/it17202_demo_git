/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.HoaDon;
import DomainModels.SanPham;

/**
 *
 * @author Dell
 */
public class HDCTView {
    private HoaDon MaHoaDon;
    
    private SanPham MaSanPham;
    
    private float DonGia;
    
    private int SoLuong;
    
    private float TongTien;

    public HDCTView() {
    }

    public HDCTView(HoaDon MaHoaDon, SanPham MaSanPham, float DonGia, int SoLuong, float TongTien) {
        this.MaHoaDon = MaHoaDon;
        this.MaSanPham = MaSanPham;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.TongTien = TongTien;
    }

    public HoaDon getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(HoaDon MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public SanPham getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(SanPham MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }
    
}
