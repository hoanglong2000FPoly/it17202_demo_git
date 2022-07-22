/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostory;

import java.util.List;
import  DomainModels.NhanVien;
import Ultilities.HibernateUti;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author T460
 */
public class NhanVienTruyVan {
   
    
    
    public List<NhanVien> getList(){
        List<NhanVien> listNhanViens;
        try(Session session = HibernateUti.getSessionFactory().openSession()){
            TypedQuery<NhanVien> query = session.createQuery("from NhanVien");
           listNhanViens = query.getResultList();
        }
    return  listNhanViens;
}
    public String save(NhanVien nv ){
        try(Session session = HibernateUti.getSessionFactory().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
            session.save(nv);
            transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return"Khong Thanh cong";
            }
        }
        return "Thanh Cong";
    }
     public String update(NhanVien nv ){
        try(Session session = HibernateUti.getSessionFactory().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
            session.update(nv);
            transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return"Khong Thanh cong";
            }
        }
        return "Thanh Cong";
    }
     
    
}
