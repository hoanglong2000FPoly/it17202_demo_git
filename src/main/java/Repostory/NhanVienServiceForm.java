/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostory;

import Services.NhanVienServiceDAO;
import ViewModels.NhanVienView;
import java.util.List;

/**
 *
 * @author Dell
 */
public class NhanVienServiceForm {
    
    NhanVienServiceDAO nvDao = new NhanVienServiceDAO();
    public String themNhanVien(NhanVienView nv){
        DomainModels.NhanVien nv1 = new DomainModels.NhanVien(nv.getMaNhanVien()
                , nv.getTenNhanVien(), nv.getMatKhau(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getEmail(), nv.getSDT(), nv.getVaiTro());
        return nvDao.themNhanVien(nv1);
    }
        public String suaNhanVien(NhanVienView nv){
        DomainModels.NhanVien nv1 = new DomainModels.NhanVien(nv.getMaNhanVien()
                , nv.getTenNhanVien(), nv.getMatKhau(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getEmail(), nv.getSDT(), nv.getVaiTro());
        return nvDao.suaNhanVien(nv1);
    }
    
    public String passNhanVien(String username,String email){
        return nvDao.passNhanVien(username, email);
    }
    
    public List<DomainModels.NhanVien> listNhanVien(){
        return nvDao.listNhanVien();
    }
    
}
