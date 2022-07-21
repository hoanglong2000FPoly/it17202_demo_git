/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevirce;

import DomainModels.TheLoaiSanPham;
import Repositories.TheLoaiSanPhamDAO;
import ViewModels.TheLoaiSanPhamView;
import java.util.List;


public class TheLoaiSanPhamForm {
    TheLoaiSanPhamDAO tlDAO = new TheLoaiSanPhamDAO();
    
    public String themTheLoai(TheLoaiSanPhamView tl1){
        TheLoaiSanPham tl = new TheLoaiSanPham(tl1.getMaTheLoai(), tl1.getMaTheLoai());
        return tlDAO.themTheLoai(tl);
    }
        public String suaTheLoai(TheLoaiSanPhamView tl1){
        TheLoaiSanPham tl = new TheLoaiSanPham(tl1.getMaTheLoai(), tl1.getMaTheLoai());
        return tlDAO.suaTheLoai(tl);
    }
        
        public List<TheLoaiSanPham> listTheLoai(){
            return tlDAO.listTheLoai();
        }
    
}
