/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DomainModels.KhachHang;
import Repositories.KhachHangDAO;
import ViewModels.KhachHangView;

/**
 *
 * @author PC
 */
public class KhachHangService {
    
    KhachHangDAO khDAO;

    public KhachHangService() {
        khDAO = new KhachHangDAO();
    }
    
    public String add(KhachHangView kh) {
        KhachHang kh1 = new KhachHang(kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getGioiTinh(), kh.getEmail(), kh.getSDT());
        return khDAO.add(kh1);
    }
    
    public String edit(KhachHangView kh) {
        KhachHang kh1 = new KhachHang(kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getGioiTinh(), kh.getEmail(), kh.getSDT());
        return khDAO.edit(kh1);
    }
    
}
