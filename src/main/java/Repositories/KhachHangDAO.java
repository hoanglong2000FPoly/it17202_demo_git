/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PC
 */
public class KhachHangDAO {
    
    public String add(KhachHang kh) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            
            try {
                session.save(kh);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                return "Thêm thất bại";
            }
        }
        return "Thêm thành công";
    }
    
    public String edit(KhachHang kh) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            
            try {
                session.update(kh);
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
