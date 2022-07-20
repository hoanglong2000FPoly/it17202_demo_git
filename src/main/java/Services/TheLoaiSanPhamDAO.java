/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.TheLoaiSanPham;
import Ultilities.HibernateUltis;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dell
 */
public class TheLoaiSanPhamDAO {
    
    
    public String themTheLoai(TheLoaiSanPham tl){
        try(Session ss = HibernateUltis.getSessionFactory().openSession()){
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.save(tl);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Không thành công";
            }
            return "Thêm thành công";
        }
    }
        public String suaTheLoai(TheLoaiSanPham tl){
        try(Session ss = HibernateUltis.getSessionFactory().openSession()){
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.update(tl);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Không thành công";
            }
            return "Thêm thành công";
        }
    }
    
public List<TheLoaiSanPham> listTheLoai(){
    List<TheLoaiSanPham> list;
    try(Session ss = HibernateUltis.getSessionFactory().openSession()){
        String sql = "select c from TheLoaiSanPham c";
        TypedQuery<TheLoaiSanPham> qr = ss.createQuery(sql,TheLoaiSanPham.class);
        list = qr.getResultList();
    }
    return list;
}
    
}
