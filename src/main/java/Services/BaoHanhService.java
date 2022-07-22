/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.BaoHanh;
import Repostory.BaoHanhTruyVan;
import ViewModel.BaoHanhMD;
import java.util.List;

/**
 *
 * @author admin
 */
public class BaoHanhService {
    BaoHanhTruyVan baoHanhTruyVan;

    public BaoHanhService() {
        baoHanhTruyVan = new BaoHanhTruyVan();
    }
    public List getList(){
        return baoHanhTruyVan.getList();
    }
    public String add(BaoHanhMD x){
        return baoHanhTruyVan.save(new BaoHanh(x.getMaBaoHanh(), x.getNgayMua(), x.getMoTa(), x.getMaSanPham(), x.getMaKhachHang(), x.getMaNhanVien()));
    }
     public String edit(BaoHanhMD x){
        return baoHanhTruyVan.save(new BaoHanh(x.getMaBaoHanh(), x.getNgayMua(), x.getMoTa(), x.getMaSanPham(), x.getMaKhachHang(), x.getMaNhanVien()));
    }
    
}
