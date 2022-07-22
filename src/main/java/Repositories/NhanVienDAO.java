/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import Utilities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PC
 */

public class NhanVienDAO {
    
//    public List<NhanVien> getList() {
//        List<NhanVien> nhanviens;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//        TypedQuery<NhanVien> nv = session.createQuery("SELECT a FROM NhanVien a");
//        nhanviens = nv.getResultList();
//        }
//        return nhanviens;
//    }
    
    public String add(NhanVien nv) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            
            try {
                session.save(nv);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                return "Thêm thất bại";
            }
        }
        return "Thêm thành công";
    }
    
    public String edit(NhanVien nv) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            
            try {
                session.update(nv);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                return "Sửa thất bại";
            }
        }
        return "Sửa thành công";
    }
    
}


