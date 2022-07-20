/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostory;

import DomainModels.SanPham;
import Services.SanPhamDAO;
import ViewModels.SanPhamView;
import java.util.List;

/**
 *
 * @author Dell
 */
public class SanPhamServiceForm {

    SanPhamDAO spDao = new SanPhamDAO();

    public String themSanPham(SanPhamView sp1) {
        DomainModels.SanPham sp = new SanPham(sp1.getMaSanPham(), sp1.getTenSanPham(), sp1.getSoLuong(),
                sp1.getNamSanXuat(), sp1.getHangSanXuat(), sp1.getGiaNhap(), sp1.getGiaBan(), sp1.getDungTich(), sp1.getCongSuat(),
                sp1.getPin(), sp1.getMoTa(), sp1.getMaTheLoai());
        return spDao.themSanPham(sp);
    }
     public String suaSanPham(SanPhamView sp1) {
        DomainModels.SanPham sp = new SanPham(sp1.getMaSanPham(), sp1.getTenSanPham(), sp1.getSoLuong(),
                sp1.getNamSanXuat(), sp1.getHangSanXuat(), sp1.getGiaNhap(), sp1.getGiaBan(), sp1.getDungTich(), sp1.getCongSuat(),
                sp1.getPin(), sp1.getMoTa(), sp1.getMaTheLoai());
        return spDao.suaSanPham(sp);
    }
     public List<SanPham> listSanPham(){
         return spDao.listSanPham();
     }

}
