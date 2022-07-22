/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.PhuKien;
import Repostory.PhuKienTruyVan;
import ViewModel.PhuKienMD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class PhuKienService {
    PhuKienTruyVan kienTruyVan;

    public PhuKienService() {
        kienTruyVan = new PhuKienTruyVan();
    }
    
    public List getList(){
        return kienTruyVan.getList();
    }
    
    public String add(PhuKienMD x){
        return kienTruyVan.save(new PhuKien(x.getMaPhuKien(), x.getTenPhuKien(), x.getSoLuong(), x.getGiaNhap(), x.getGiaBan(), x.getDienTro(), x.getMaSanPham()));
    }
    
    public String edit(PhuKienMD x){
        return kienTruyVan.update(new PhuKien(x.getMaPhuKien(), x.getTenPhuKien(), x.getSoLuong(), x.getGiaNhap(), x.getGiaBan(), x.getDienTro(), x.getMaSanPham()));
    }
    
    public List<PhuKien> timKiem(String ma){
        List<PhuKien> kiens = new ArrayList<>();
        for (PhuKien x : kienTruyVan.getList()) {
            if(x.getTenPhuKien().toLowerCase().contains(ma.toLowerCase())){
                kiens.add(x);
            }
        }
        return kiens;
    }
    
}
