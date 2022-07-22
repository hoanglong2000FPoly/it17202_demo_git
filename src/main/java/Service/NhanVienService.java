/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModels.NhanVien;
import ViewModels.NhanVienView;
import Repositories.NhanVienDAO;

/**
 *
 * @author PC
 */
public class NhanVienService {
    NhanVienDAO nvDAO;
    
    public NhanVienService() {
        nvDAO = new NhanVienDAO();
    }
    
    public String add(NhanVienView nv) {
        NhanVien nv1 = new NhanVien(nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getMatKhau(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getEmail(), nv.getSDT(), nv.getVaiTro());
        return nvDAO.add(nv1);
    }
    
    public String edit(NhanVienView nv) {
        NhanVien nv1 = new NhanVien(nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getMatKhau(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), nv.getEmail(), nv.getSDT(), nv.getVaiTro());
        return nvDAO.edit(nv1);
    }
}
