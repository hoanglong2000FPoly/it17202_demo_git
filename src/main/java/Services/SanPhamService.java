/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import ViewModel.SanPhamMD;
import java.util.List;
//import Repostory.ISanPhamTruyVan;
import Repostory.SanPhamTruyVan;
/**
 *
 * @author admin
 */
public class SanPhamService {
    SanPhamTruyVan iSanPhamTruyVan;
    public SanPhamService() {
        iSanPhamTruyVan = new SanPhamTruyVan();
    }
    
    public List getList() {
        return iSanPhamTruyVan.getList();
        
    }

    public String add(SanPhamMD sp) {
        return iSanPhamTruyVan.save(new SanPham(sp.getMaSanPham(), 
                sp.getTenSanPham(), sp.getSoLuong(), sp.getNamSanXuat(), sp.getHangSanXuat(), sp.getGiaNhap(), sp.getGiaBan(), sp.getDungTich(), sp.getCongSuat(), sp.getPin(), sp.getMoTa(), sp.getMatheLoai()));
    }

    public String edit(SanPhamMD sp) {
        return iSanPhamTruyVan.edit(new SanPham(sp.getMaSanPham(), 
                sp.getTenSanPham(), sp.getSoLuong(), sp.getNamSanXuat(), sp.getHangSanXuat(), sp.getGiaNhap(), sp.getGiaBan(), sp.getDungTich(), sp.getCongSuat(), sp.getPin(), sp.getMoTa(), sp.getMatheLoai()));
    }
    
}
